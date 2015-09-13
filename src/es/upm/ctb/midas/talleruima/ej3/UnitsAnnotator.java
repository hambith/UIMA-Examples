package es.upm.ctb.midas.talleruima.ej3;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
/**
 * Ejemplo de grupos de parametros y creacion de tipos
 * @author hambit
 *
 */
public class UnitsAnnotator extends JCasAnnotator_ImplBase {
    private String wordPattern;
    private String[] units;
    private String[] baseUnits;
    private String[] multipliers;
    
    public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);
	
		//obtener las unidades
		units = (String[]) getContext().getConfigParameterValue("unitInfo", "unit");
		//obtener las unidades base
		baseUnits = (String[]) getContext().getConfigParameterValue("unitInfo", "baseUnit");
		//obtener los multiplicadores 
		multipliers = (String[]) getContext().getConfigParameterValue("unitInfo", "multiplier");
		//obtener la expresión regular para palabras
		wordPattern = (String) getContext().getConfigParameterValue("wordRegEx");
		
    }
    
    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
	
		//Crear un mapa de unidades con los datos de los parametros
		HashMap<String, Unit> hash = new HashMap<String, Unit>();
		for (int i = 0; i < units.length; i++) {
		    Unit unit = new Unit(arg0);
		    unit.setUnit(units[i]);
		    unit.setBaseUnit(baseUnits[i]);
		    unit.setMultiplier(Double.valueOf(multipliers[i]));
		    hash.put(units[i], unit);
		}
		//Obtener el texto a procesar
		String docText = arg0.getDocumentText();
		
		//Buscar palabras en el texto
		Pattern pattern = Pattern.compile(wordPattern);
		Matcher matcher = pattern.matcher(docText);
		
		while (matcher.find()) {
		    //Obtener la cadena de la palabra
		    String unitString = docText.substring(matcher.start(),matcher.end());
		    
		    //Anotar la palabra si corresponde a una unidad
		    Unit unit = hash.get(unitString);
		    if (unit!=null){
				//Dar valores a la anotacion
				unit.setBegin(matcher.start());
				unit.setEnd(matcher.end());
				//Añadir la anotación a los indices del cas
				unit.addToIndexes(arg0);		
		    }
	
		    
		}
    }

}
