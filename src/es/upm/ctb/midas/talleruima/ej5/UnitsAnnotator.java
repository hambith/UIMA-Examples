package es.upm.ctb.midas.talleruima.ej5;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import es.upm.ctb.midas.talleruima.ej3.Unit;
import es.upm.ctb.midas.talleruima.ej4.Metric;
/**
 * Ejemplo de anotador agregado con modificacion de anotaciones previas
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
	
		//Crear el mapa de unidades 
		HashMap<String, Unit> hash = new HashMap<String, Unit>();
		for (int i = 0; i < units.length; i++) {
		    Unit unit = new Unit(arg0);
		    unit.setUnit(units[i]);
		    unit.setBaseUnit(baseUnits[i]);
		    unit.setMultiplier(Double.valueOf(multipliers[i]));
		    hash.put(units[i], unit);
		}
		
		FSIterator metricIterator = arg0.getAnnotationIndex(Metric.type).iterator();
		while (metricIterator.isValid()) {
		    Metric metric = (Metric) metricIterator.get();
		    //Buscar numeros en el texto
		    Pattern pattern = Pattern.compile(wordPattern);
		    Matcher matcher = pattern.matcher(metric.getCoveredText());
		    
		    while (matcher.find()) {
			//Obtener la cadena de la palabra
			String unitString = metric.getCoveredText().substring(matcher.start(),matcher.end());
			
			//Anotar si la palabra corresponde a una unidad
			Unit unit = hash.get(unitString);
			if (unit!=null){
			    //Dar valores a la anotacion
			    unit.setBegin(metric.getBegin()+matcher.start());//OJO: el valor se calcula cogiendo como referencia el de la anotacion "padre"
			    unit.setEnd(metric.getBegin()+matcher.end());
			    //Añadir la anotación a los indices del cas
			    unit.addToIndexes(arg0);
			    //Modificar la anotacion
			    metric.setUnit(unit);
			}
			
			
		    }
		    metricIterator.moveToNext();
		}
	
    }

}
