package com.SOAP.cliente;

import java.io.InputStream;

import javax.xml.soap.*;

import com.sun.org.apache.xml.internal.utils.QName;

public class ClienteSOAP {
	  
	public static void createSoapEnvelope(SOAPMessage soapMessage, String XMLtext) throws SOAPException {
	        SOAPPart soapPart = soapMessage.getSOAPPart();

	        String myNamespace = "webservice.se-face.redsara.es";
	        String myNamespaceURI = "https://se-face-webservice.redsara.es/facturasspp";

	        // SOAP Envelope
	        SOAPEnvelope envelope = soapPart.getEnvelope();
	        
	        //SOAP Header
	        SOAPHeader header = envelope.getHeader();
	        header.addTextNode("Header");
	    	SOAPElement security = header.addHeaderElement(envelope.createName("Security","", "wsse"));
	    	//security = security.addChildElement(envelope.createName("BinarySecurityToken", "", "wsse"));
	    	

	        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
	        
	            /*
	            Constructed SOAP Request Message:
	            <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:myNamespace="http://www.webserviceX.NET">
	                <SOAP-ENV:Header/>
	                <SOAP-ENV:Body>
	                    <myNamespace:GetInfoByCity>
	                        <myNamespace:USCity>New York</myNamespace:USCity>
	                    </myNamespace:GetInfoByCity>
	                </SOAP-ENV:Body>
	            </SOAP-ENV:Envelope>
	            */
	        
	        String xmlPath = "C:\\Users\\sdatos02\\Desktop\\Marshalling\\FacturaMarshallingFace\\Facturaev32.xml";
	        
	        // SOAP Body
	        SOAPBody soapBody = envelope.getBody(); 
	        SOAPElement soapBodyElem = soapBody.addChildElement("enviarFactura", myNamespace);
	        SOAPElement soap = soapBodyElem.addChildElement("facturaXML",myNamespace);
	        soap.addTextNode(XMLtext);
	        

	 }
	
    public static void callSoapWebService(String soapEndpointUrl, String soapAction, String XMLtext) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction, XMLtext), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }
    
    public static SOAPMessage createSOAPRequest(String soapAction, String XMLtext) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        
        createSoapEnvelope(soapMessage, XMLtext);

        //MimeHeaders headers = soapMessage.getMimeHeaders();
        //headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }
    
    
}