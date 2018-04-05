package com.aplicacion.certificado;

import com.validacion.xml.*;


public class Application {

	public static void main(String[] args) {
		
		//Aplicación java a la que se le pasa la ruta del xml, la ruta del certificado, y la ruta del servidor web
		
		//Argumentos que se le pasan RUTAXML, RUTACERTIFICADO, RUTASERVIDOR
		
		//Comprobar que esta que la estructura esta bien respecto al archivo xsd		
		
		 try {
			 		
				String xsdPath = "C:\\Users\\sdatos02\\Desktop\\Marshalling\\FacturaMarshallingFace\\Facturaev32.xsd";
				String xmlPath = "C:\\Users\\sdatos02\\Desktop\\Marshalling\\FacturaMarshallingFace\\Facturaev32.xml";
				String cerPath = "C:\\Program Files\\Java\\jre1.8.0_161\\bin\\certfile.cer";
				
				System.out.println("Resultado validación del XML con el XSD es:  " + ValidacionXML.responseValidate(ValidacionXML.validateXMLSchema(xsdPath, xmlPath)));
		 } 
		 
		 catch (Exception e) {
				e.printStackTrace();
		 }
		
		 
		 //Importar y almacenar certificado en JAVA
		 
		 //Peticiones SOAP
		 
	}

}



