package facturacionFace;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class FacturaFaceImpl {

	public static void main(String[] args) {
	//Argumentos que se le pasan RUTAXML, RUTACERTIFICADO, RUTASERVIDOR
	
	
	//Lectura del fichero XML externo
	 try {

			File fXmlFile = new File("C:\\Users\\sdatos02\\Desktop\\Face\\Facturaev31.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nList = doc.getElementsByTagName("Facturae");
			
			
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("SchemaVersion : " + eElement.getAttribute("SchemaVersion"));
					System.out.println("Modality : " + eElement.getElementsByTagName("Modality").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("Parties").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("Invoices").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("Extensions").item(0).getTextContent());

				}
			}
	 } 
	 
	 catch (Exception e) {
			e.printStackTrace();
	 }
	
	 //Importar y almacenar ceritficado en JAVA
	 //.......
	}
}
