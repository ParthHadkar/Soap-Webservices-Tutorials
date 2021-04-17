
package com.soapapp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceByCatv2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceByCatv2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoServices" type="{http://www.soapapp.com}services" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceByCatv2Response", propOrder = {
    "autoServices"
})
public class GetServiceByCatv2Response {

    @XmlElement(name = "AutoServices")
    protected List<Services> autoServices;

    /**
     * Gets the value of the autoServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Services }
     * 
     * 
     */
    public List<Services> getAutoServices() {
        if (autoServices == null) {
            autoServices = new ArrayList<Services>();
        }
        return this.autoServices;
    }

}
