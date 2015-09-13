package es.upm.ctb.midas.talleruima.ej7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.impl.XmiCasDeserializer;
import org.apache.uima.cas.impl.XmiCasSerializer;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceSpecifier;
import org.apache.uima.util.CasCreationUtils;
import org.apache.uima.util.InvalidXMLException;
import org.apache.uima.util.XMLInputSource;
import org.apache.uima.util.XMLParser;
import org.xml.sax.SAXException;

import es.upm.ctb.midas.talleruima.ej2.Number;
import es.upm.ctb.midas.talleruima.ej3.Unit;
import es.upm.ctb.midas.talleruima.ej4.Metric;
/**
 * Ejemplo crear un fichero XMI con anotaciones
 * @author hambit
 *
 */
public class XMIWriter {

    public static void main(String[] args) throws IOException, InvalidXMLException, ResourceInitializationException, AnalysisEngineProcessException, SAXException {
    	//Leer el descriptor
    	XMLInputSource in = new XMLInputSource("desc/ej5/MetricsAnnotatorPipeline.xml");
        ResourceSpecifier specifier =  UIMAFramework.getXMLParser().parseResourceSpecifier(in);
        //Crear un fichero de salida
        FileOutputStream outputStream = new FileOutputStream("resources/annotation.xmi");

        //Crear el AE
        AnalysisEngine analisysEngine = UIMAFramework.produceAnalysisEngine(specifier);
        //Leer el fichero de entrada
        String text = new String(Files.readAllBytes(Paths.get("resources/test.txt")));
        //Crear un CAS en el AE
        JCas ajCas = analisysEngine.newJCas();
                  
        //Analizar el documento
        ajCas.setDocumentText(text);
        analisysEngine.process(ajCas);

        //Serializar las anotaciones en el fichero
        XmiCasSerializer.serialize(ajCas.getCas(), outputStream);
        outputStream.close();
        ajCas.reset();
        analisysEngine.destroy();
    }

}
