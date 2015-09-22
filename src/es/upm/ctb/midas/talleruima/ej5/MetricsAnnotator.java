package es.upm.ctb.midas.talleruima.ej5;

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
import es.upm.ctb.midas.talleruima.ej4.Metric;
import es.upm.ctb.midas.talleruima.ej2.Number;
/**
 * Ejemplo de anotador agregado con modificacion de anotaciones previas
 * @author hambit
 *
 */
public class MetricsAnnotator extends JCasAnnotator_ImplBase {
    String metricsPattern;

    public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);
		//Obtener la expresion regular para numeros
		metricsPattern = (String) aContext.getConfigParameterValue("MetricRegEx");
    }
    @Override
    public void process(JCas arg0) throws AnalysisEngineProcessException {
		//Obtener el texto a procesar
		String docText = arg0.getDocumentText();
		
		//Buscar numeros en el texto
		Pattern pattern = Pattern.compile(metricsPattern);
		Matcher matcher = pattern.matcher(docText);
		
		//Anotar las metricas detectadas
		while (matcher.find()) {
		    Metric metric = new Metric(arg0, matcher.start(),matcher.end());
		    metric.addToIndexes();
		}

    }

}
