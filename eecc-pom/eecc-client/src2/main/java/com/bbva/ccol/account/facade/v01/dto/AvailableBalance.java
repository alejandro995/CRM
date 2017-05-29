
package com.bbva.ccol.account.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para availableBalance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="availableBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentBalances" type="{urn:com:bbva:ccol:account:facade:v02:dto}money" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pendingBalances" type="{urn:com:bbva:ccol:account:facade:v02:dto}money" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postedBalances" type="{urn:com:bbva:ccol:account:facade:v02:dto}money" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableBalance", propOrder = {
    "currentBalances",
    "pendingBalances",
    "postedBalances"
})
public class AvailableBalance {

    @XmlElement(nillable = true)
    protected List<Money> currentBalances;
    @XmlElement(nillable = true)
    protected List<Money> pendingBalances;
    @XmlElement(nillable = true)
    protected List<Money> postedBalances;

    /**
     * Gets the value of the currentBalances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentBalances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentBalances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getCurrentBalances() {
        if (currentBalances == null) {
            currentBalances = new ArrayList<Money>();
        }
        return this.currentBalances;
    }

    /**
     * Gets the value of the pendingBalances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingBalances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingBalances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getPendingBalances() {
        if (pendingBalances == null) {
            pendingBalances = new ArrayList<Money>();
        }
        return this.pendingBalances;
    }

    /**
     * Gets the value of the postedBalances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postedBalances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostedBalances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getPostedBalances() {
        if (postedBalances == null) {
            postedBalances = new ArrayList<Money>();
        }
        return this.postedBalances;
    }

}
