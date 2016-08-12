package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxTask {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean unit = false;
		XMLInputFactory XMLinpFact = XMLInputFactory.newInstance();
		try {
			XMLStreamReader reader = XMLinpFact.createXMLStreamReader(
					new FileInputStream("1.xml"));
			String unitName = "";
			int valueX = 0;
			int valueY = 0;
			int read = 0;
			int count = 1;
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("pointList")) {
						System.out.println(reader.getLocalName());
					} else if (reader.getLocalName().equals("point")) {
						System.out.print(reader.getLocalName() + " ");
					} else if (reader.getLocalName().equals("x")) {
						a = true;
					} else if (reader.getLocalName().equals("y")) {
						b = true;
					} else if (reader.getLocalName().equals("unit")) {
						unit = true;
					}
				}
				if (res == XMLStreamConstants.CHARACTERS) {
					if (a) {
						valueX = (Integer.parseInt(reader.getText()));
						a = false;
					} else if (b) {
						valueY = (Integer.parseInt(reader.getText()));
						b = false;
					} else if (unit) {
						unitName = reader.getText();
						read = 1;
						unit = false;
					}
				}
				if (read > 0) {
					System.out.println(count + ": " + valueX + unitName + ", " + valueY + unitName);
					count++;
					read = 0;
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
