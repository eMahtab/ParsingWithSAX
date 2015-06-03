package co.edureka;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SAXXMLHandler extends DefaultHandler {
	
	public void startDocument(){
		System.out.println("Begin Processing Document");
	}	
	public void endDocument(){
		System.out.print("\nEnd Processing Document");
	}
	
	public void startElement(String namespaceURI,String localName,String qname,Attributes atts){
		System.out.print("<"+qname+">");
	}
	
	public void endElement(String namespaceURI,String localName,String qname){
		System.out.print("</"+qname+">");
	}
	
	public void characters(char []ch,int start,int length){
		for(int i=start;i <(start+length); i++){
			System.out.print(ch[i]);
		}		
	}

}
