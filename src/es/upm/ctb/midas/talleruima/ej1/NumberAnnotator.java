package es.upm.ctb.midas.talleruima.ej1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

/**
 * Ejemplo de un anotador basico
 * @author hambit
 *
 */
public class NumberAnnotator extends JCasAnnotator_ImplBase {

    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
	//Obtener el texto a procesar
	String docText = arg0.getDocumentText();
	
	//Buscar numeros en el texto
	Pattern pattern = Pattern.compile("(\\+|-)?\\d+(.\\d+)?");
	Matcher matcher = pattern.matcher(docText);
	
	while (matcher.find()) {
	    //Obtener la cadena del numero
	    String numberString = docText.substring(matcher.start(),matcher.end());
	    Double doubleValue = null;
	    Integer integerValue = null;
	    boolean isDouble = false;
	    
	    //Obtenemos su valor y su tipo
	    if (numberString.contains(".") ){
	    	doubleValue = Double.valueOf(numberString);
	    	isDouble = true;
	    } else {
	    	integerValue = Integer.valueOf(numberString);
	    }

	    //Crear la annotacion
	    Number numberAnnotation = new Number(arg0);
	    
	    //Dar valores a la anotacion
	    numberAnnotation.setBegin(matcher.start());
	    numberAnnotation.setEnd(matcher.end());
	    numberAnnotation.setIsDouble(isDouble);
	    if (isDouble) {
	    	numberAnnotation.setAbsoluteDoubleValue(Math.abs(doubleValue));
	    } else {
	    	numberAnnotation.setAbsoluteIntegerValue(Math.abs(integerValue));
	    	doubleValue = integerValue.doubleValue();
	    }
	    if (doubleValue >0){
	    	numberAnnotation.setSign(1);
	    } else {
	    	numberAnnotation.setSign(-1);		
	    }

	    //Añadir la anotación a los indices del cas
	    numberAnnotation.addToIndexes(arg0);
	}
    }

}
