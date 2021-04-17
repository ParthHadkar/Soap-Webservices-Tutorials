
package com.soapapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for services complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="services">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoServicePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "services", propOrder = {
    "autoServiceType",
    "autoServiceName",
    "autoServicePrice"
})
public class Services {

    @XmlElement(name = "AutoServiceType")
    protected String autoServiceType;
    @XmlElement(name = "AutoServiceName")
    protected String autoServiceName;
    @XmlElement(name = "AutoServicePrice")
    protected double autoServicePrice;

    /**
     * Gets the value of the autoServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoServiceType() {
        return autoServiceType;
    }

    /**
     * Sets the value of the autoServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoServiceType(String value) {
        this.autoServiceType = value;
    }

    /**
     * Gets the value of the autoServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoServiceName() {
        return autoServiceName;
    }

    /**
     * Sets the value of the autoServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoServiceName(String value) {
        this.autoServiceName = value;
    }

    /**
     * Gets the value of the autoServicePrice property.
     * 
     */
    public double getAutoServicePrice() {
        return autoServicePrice;
    }

    /**
     * Sets the value of the autoServicePrice property.
     * 
     */
    public void setAutoServicePrice(double value) {
        this.autoServicePrice = value;
    }

}
