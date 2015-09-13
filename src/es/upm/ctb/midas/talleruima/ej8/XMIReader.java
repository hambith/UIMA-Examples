package es.upm.ctb.midas.talleruima.ej8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.impl.XmiCasDeserializer;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.CasCreationUtils;
import org.apache.uima.util.InvalidXMLException;
import org.apache.uima.util.XMLInputSource;
import org.apache.uima.util.XMLParser;
import org.xml.sax.SAXException;

import es.upm.ctb.midas.talleruima.ej2.Number;
import es.upm.ctb.midas.talleruima.ej3.Unit;
import es.upm.ctb.midas.talleruima.ej4.Metric;
/**
 * Ejemplo usar un fichero XMI con anotaciones
 * @author hambit
 *
 */
public class XMIReader {

    public static void main(String[] args) throws IOException, InvalidXMLException, CASException, ResourceInitializationException, SAXException {
		JCas jcas = null;

		//Leer el descriptor del anotador
		XMLParser xmlParser = UIMAFramework.getXMLParser();
		XMLInputSource in = new XMLInputSource("desc/ej4/MetricsAnnotatorPipeline.xml");
		//Crear un AE en base al descriptor
		AnalysisEngineDescription tsDesc = xmlParser.parseAnalysisEngineDescription(in);
		//Obtener el CAS
		jcas = CasCreationUtils.createCas(tsDesc).getJCas();

		if (jcas != null) {
			//De-serializar la anotacion de un fichero
		    FileInputStream inputStream = null;
			inputStream = new FileInputStream("resources/annotation.xmi");
			XmiCasDeserializer.deserialize(inputStream, jcas.getCas());
			
			//Obtener el texto de la anotacion
			String sofaString = jcas.getDocumentText();
			System.out.println(sofaString);
			 
			//Usar las anotaciones del fichero
			FSIterator it = jcas.getAnnotationIndex(Metric.type).iterator();
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
		}
    }

}
