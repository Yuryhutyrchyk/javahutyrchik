package xml;

import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Information {
	public static void main(String[] args) throws SAXException, IOException {
		XMLReader p = XMLReaderFactory.createXMLReader();
		p.setContentHandler(new SaxTask());
		p.parse("1.xml");
	}
}