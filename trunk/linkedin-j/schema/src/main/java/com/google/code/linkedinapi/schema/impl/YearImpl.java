//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.10 at 10:39:01 AM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Year;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "year", propOrder = {
    "year"
})
public class YearImpl
    implements Year
{

    @XmlElement(required = true)
    protected BigInteger year;

    public BigInteger getYear() {
        return year;
    }

    public void setYear(BigInteger value) {
        this.year = value;
    }

}
