package co.edureka;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXTest {
	
	
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException{
		/*
		 * One of the ways of Parsing with SAXParser
		 * 
		 * try {
			XMLReader reader=XMLReaderFactory.createXMLReader();
			reader.setContentHandler(new SAXXMLHandler());
			reader.parse("D://PythonWorkspace//RESTWithJaxWS//src//ch04//team/teams.ser");
			
		} catch (SAXException | IOException e) {			
			e.printStackTrace();
		}	*/
		
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		parser.parse(new File("D://PythonWorkspace//RESTWithJaxWS//src//ch04//team/teams.ser"), new SAXXMLHandler());
	}
}
