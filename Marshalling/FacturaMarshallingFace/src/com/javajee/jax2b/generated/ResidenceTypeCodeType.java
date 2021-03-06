//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.23 at 12:40:28 PM GMT 
//


package com.javajee.jax2b.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidenceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResidenceTypeCodeType")
@XmlEnum
public enum ResidenceTypeCodeType {


    /**
     * Extranjero (Fuera Uni�n Europea).
     * 
     */
    E,

    /**
     * Residente (en Espa�a).
     * 
     */
    R,

    /**
     * Residente en la Uni�n Europea (excepto Espa�a).
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static ResidenceTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
