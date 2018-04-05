package com.validacion.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class ValidacionXML {

	public static boolean validateXMLSchema (String xsdPath, String xmlPath) {
        
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
           
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
	
	public static String responseValidate(boolean response) {
		String res = " ";
		if(response == true) {
			res = "Estructura XML compatible con el esquema";
			return res;
		}
		else {
			res = "Estructura XML NO compatible con el esquema";
			return res;
		}
	} 
	

}

