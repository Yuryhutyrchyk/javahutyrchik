package xml;

import java.util.jar.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SaxTask extends DefaultHandler {
	public void startDocument() {
		System.out.println(" start parsing...");
	}

	public void endDocument() {
		System.out.print("\nend parsing...");
	}

	public void startElement(String nameSpaceURI, String localName, String qName, Attributes atts) {
		System.out.print("<" + qName + ">");
	}

	public void endElement(String nameSpaceURI, String localName, String qName) {
		System.out.print(" <" + qName + ">");
	}

	public void characters(char[] ch, int start, int length) {
		for (int i = start; i < (start + length); i++) {
			System.out.print(ch[i]);
		}
	}
}