package es.upm.ctb.midas.talleruima.ej4;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.tutorial.Meeting;

import es.upm.ctb.midas.talleruima.ej3.Unit;
import es.upm.ctb.midas.talleruima.ej2.Number;
/**
 * Ejemplo de anotador agregado
 * @author hambit
 *
 */
public class MetricsAnnotator extends JCasAnnotator_ImplBase {
    
    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
		//Obtener los indices de interes de las anotaciones anteriores
		FSIndex numberIndex = arg0.getAnnotationIndex(Number.type);
		FSIndex unitIndex = arg0.getAnnotationIndex(Unit.type);
	
		//Iteradores de los indices
		FSIterator numberIterator = numberIndex.iterator();
		FSIterator unitIterator = unitIndex.iterator();
		
		int currentNumber = 0;
		int currentUnit = 0;
		
		while (numberIterator.hasNext()) {
		    Number number = (Number) numberIterator.next();
		    currentNumber++;
		    while (unitIterator.hasNext()) {
				Unit unit = (Unit) unitIterator.next();
				currentUnit++;
				//Anotar cuando la unidad corresponde al numero en proceso
				if(currentNumber==currentUnit){	    
					Metric metric = new Metric(arg0, number.getBegin(), unit.getEnd());
					metric.setNumber(number);
					metric.setUnit(unit);
					metric.addToIndexes();
					//Pasar al siguiente numero
					break;
				}
		    }
		    //Reiniciar el iterador y el contador de unidades
		    unitIterator.moveToFirst();
		    currentUnit = 0;
		}

    }

}
