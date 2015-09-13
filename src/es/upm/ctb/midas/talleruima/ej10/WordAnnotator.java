package es.upm.ctb.midas.talleruima.ej10;
/**
 * Ejemplo de arrays y listas
 * 
 * @author hambit 
 **/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.EmptyStringList;
import org.apache.uima.jcas.cas.NonEmptyFSList;
import org.apache.uima.jcas.cas.NonEmptyStringList;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.cas.TOP;

public class WordAnnotator extends JCasAnnotator_ImplBase {
    private static final String VOWELS = "AEIOUaeiou";
    private static final String CONSONANTS = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";

    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
	//Obtener el texto a procesar
	String docText = arg0.getDocumentText();
	
	//Buscar numeros en el texto
	Pattern pattern = Pattern.compile("\\w+");
	Matcher matcher = pattern.matcher(docText);
	
	while (matcher.find()) {
	    //Obtener la cadena del numero
	    String wordString = docText.substring(matcher.start(),matcher.end());
	    //Obtener los caracteres de la palabra
	    char[] wordChars = wordString.toCharArray();
	    //Array de vocales
	    StringArray vowels = new StringArray(arg0, wordString.length());
	    int vowelsCnt = 0;
	    //Cursor de la lista de consonantes
	    NonEmptyStringList consonantsPointer = new NonEmptyStringList(arg0);
	    //Lista de consonantes
	    NonEmptyStringList consonants = consonantsPointer;
	   
	    //Identificar el tipo de cada caracter
		for (char c : wordChars) {
		    if(VOWELS.indexOf(c) != -1){//vocal
		    	//Añadir al array de vocales
		        vowels.set(vowelsCnt++, Character.toString(c));
		    } else if (CONSONANTS.indexOf(c) != -1){//consonante
		    	//Añadir a la lista de consonantes
		        consonantsPointer.setHead(Character.toString(c));
		        //Incrementar la lista y mover el cursor
		        consonantsPointer.setTail(new NonEmptyStringList(arg0));
		        consonantsPointer = (NonEmptyStringList) consonantsPointer.getTail();
		    }
		}

	    //Crear la annotacion
	    Word wordAnnotation = new Word(arg0);
	    
	    //Dar valores a la anotacion
	    wordAnnotation.setBegin(matcher.start());
	    wordAnnotation.setEnd(matcher.end());
	    wordAnnotation.setVowels(vowels);
	    wordAnnotation.setConsonants(consonants);

	    //Añadir la anotación a los indices del cas
	    wordAnnotation.addToIndexes(arg0);
	}
    }

}
