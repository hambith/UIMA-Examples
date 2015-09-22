package es.upm.ctb.midas.talleruima.ej5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import es.upm.ctb.midas.talleruima.ej4.Metric;
import es.upm.ctb.midas.talleruima.ej2.Number;
/**
 * Ejemplo de anotador agregado con modificacion de anotaciones previas
 * @author hambit
 *
 */
public class NumberAnnotator extends JCasAnnotator_ImplBase {
    String numberPattern;

    public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);
		//Obtener la expresion regular para numeros
		numberPattern = (String) aContext.getConfigParameterValue("NumberRegEx");
    }
    
    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
    	//Obtener el iterador sobre el indice de anotaciones de metricas
		FSIterator metricIterator = arg0.getAnnotationIndex(Metric.type).iterator();
		
		while (metricIterator.isValid()) {
		    Metric metric = (Metric) metricIterator.get();
			//Buscar numeros en la metrica
			Pattern pattern = Pattern.compile(numberPattern);
			Matcher matcher = pattern.matcher(metric.getCoveredText());
			
			while (matcher.find()) {
			    //Obtener la cadena del numero
			    String numberString = metric.getCoveredText().substring(matcher.start(),matcher.end());
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
			    numberAnnotation.setBegin(metric.getBegin()+matcher.start()); //OJO: el valor se calcula cogiendo como referencia el de la anotacion "padre"
			    numberAnnotation.setEnd(metric.getBegin()+matcher.end());
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
			    //Añadir la anotacion a los indices del cas
			    numberAnnotation.addToIndexes(arg0);
			    //Modificar la anotacion de la metrica
			    metric.setNumber(numberAnnotation);
			}   
		    metricIterator.moveToNext();
		}
    }

}
