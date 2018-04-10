package com.aplicacion.certificado;

import com.validacion.xml.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.SOAP.cliente.*;
import com.convertir.XMLtoString.ConverseXML;

import com.sun.xml.internal.txw2.Document;



public class Application {

	public static void main(String[] args) {
		
		//Aplicación java a la que se le pasa la ruta del xml, la ruta del certificado, y la ruta del servidor web
		
		//Argumentos que se le pasan RUTAXML, RUTACERTIFICADO, RUTASERVIDOR
		
		//Comprobar que esta que la estructura esta bien respecto al archivo xsd
		
		//Importar y almacenar certificado en JAVA
		 
		//Peticiones SOAP
		
		 try {
			 		
				String xsdPath = "C:\\Users\\sdatos02\\Desktop\\Marshalling\\FacturaMarshallingFace\\Facturaev32.xsd";
				String xmlPath = "C:\\Users\\sdatos02\\Desktop\\Marshalling\\FacturaMarshallingFace\\Facturaev32.xml";
				String cerPath = "C:\\Program Files\\Java\\jre1.8.0_161\\bin\\certfile.cer";
				
				//Guardar el contenido del archivo XML en un String , y guardarlo en un mensaje del SOAP
				
				File fXmlFile = new File(xmlPath);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
				
				String XMLtext = ConverseXML.converseXMLtoString(doc);
				System.out.println(XMLtext);
				
				InputStream is = new ByteArrayInputStream(XMLtext.getBytes());
				
				//Validar la estructura del XML respecto al XSD
				
				System.out.println("Resultado validación del XML con el XSD es:  " + ValidacionXML.responseValidate(ValidacionXML.validateXMLSchema(xsdPath, xmlPath)));
				
				//Peticiones SOAP
				String soapEndpointUrl = "https://se-face-webservice.redsara.es/facturasspp";
			    String soapAction = "https://se-face-webservice.redsara.es/facturasspp/enviarFactura";

			    ClienteSOAP.callSoapWebService(soapEndpointUrl, soapAction, XMLtext);
			    ClienteSOAP.createSOAPRequest(soapAction,XMLtext);
		 } 
		 
		 catch (Exception e) {
				e.printStackTrace();
		 }
		 
		 
	}

}

