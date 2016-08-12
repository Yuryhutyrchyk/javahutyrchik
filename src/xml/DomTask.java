package xml;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomTask {
	public static void main(String[] args) {
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("1.xml");
			Node root = document.getDocumentElement();
			System.out.println(root.getNodeName());
			System.out.println("------------");
			NodeList nodeElement = root.getChildNodes();
			for (int i = 0; i < nodeElement.getLength(); i++) {
				Node point = nodeElement.item(i);
				if (point.getNodeType() != Node.TEXT_NODE) {
					NodeList pointprops = point.getChildNodes();
					for (int j = 0; j < pointprops.getLength(); j++) {
						Node pointprop = pointprops.item(j);
						if (pointprop.getNodeType() != Node.TEXT_NODE) {
							System.out.println(nodeElement.item(i).getNodeName() + " " + pointprop.getNodeName() + ": "
									+ pointprop.getChildNodes().item(0).getTextContent());
						}
					}
					System.out.println("------------");
				}
			}
		} catch (ParserConfigurationException ex) {
			ex.printStackTrace(System.out);
		} catch (SAXException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}
}
