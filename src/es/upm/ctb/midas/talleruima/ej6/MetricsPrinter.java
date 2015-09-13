package es.upm.ctb.midas.talleruima.ej6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceSpecifier;
import org.apache.uima.util.InvalidXMLException;
import org.apache.uima.util.XMLInputSource;

import es.upm.ctb.midas.talleruima.ej3.Unit;
import es.upm.ctb.midas.talleruima.ej4.Metric;
import es.upm.ctb.midas.talleruima.ej2.Number;

/**
 * Ejemplo de uso de anotadores en codigo
 * @author hambit
 *
 */
public class MetricsPrinter {

    public static void main(String[] args) throws IOException, InvalidXMLException, ResourceInitializationException, AnalysisEngineProcessException {
    	//Leer el descriptor
    	XMLInputSource in = new XMLInputSource("desc/ej5/MetricsAnnotatorPipeline.xml");
        ResourceSpecifier specifier =  UIMAFramework.getXMLParser().parseResourceSpecifier(in);

        //Crear el AE
        AnalysisEngine analisysEngine = UIMAFramework.produceAnalysisEngine(specifier);
        //Leer el texto a procesar
        String text = new String(Files.readAllBytes(Paths.get("resources/test.txt")));
        //Crear un CAS en el AE
        JCas ajCas = analisysEngine.newJCas();
                  
        //Analizar el documento
        ajCas.setDocumentText(text);
        analisysEngine.process(ajCas);
        
        //Usar las anotaciones hechas
        FSIterator it = ajCas.getAnnotationIndex(Metric.type).iterator();
        while (it.isValid()) {
            Metric metric = (Metric) it.get();
            Number number = metric.getNumber();
            Unit unit = metric.getUnit();
            Double value = (number.getIsDouble()) ? number.getAbsoluteDoubleValue() : Double.valueOf(number.getAbsoluteIntegerValue());
            System.out.println("===================");
            System.out.println("Metric: "+metric.getCoveredText());
            System.out.println("Real value: "+value*number.getSign()*unit.getMultiplier());
            System.out.println("Base unit: "+unit.getBaseUnit());
            it.moveToNext();
        }
        
        ajCas.reset();
        analisysEngine.destroy();
    }

}
