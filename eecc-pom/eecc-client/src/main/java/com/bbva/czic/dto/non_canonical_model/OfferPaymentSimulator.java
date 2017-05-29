
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bbva.czic.dto.canonical_model.LoanInterest;
import com.bbva.czic.dto.canonical_model.Money;


/**
 * <p>Clase Java para OfferPaymentSimulator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferPaymentSimulator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="insuranceAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="interest" type="{urn:com:bbva:czic:dto:canonical_model}LoanInterest" minOccurs="0"/>
 *         &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPaymentSimulator", propOrder = {
    "amount",
    "totalAmount",
    "insuranceAmount",
    "interest",
    "operationDate"
})
public class OfferPaymentSimulator {

    protected Money amount;
    protected Money totalAmount;
    protected Money insuranceAmount;
    protected LoanInterest interest;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalAmount(Money value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Define el valor de la propiedad insuranceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInsuranceAmount(Money value) {
        this.insuranceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad interest.
     * 
     * @return
     *     possible object is
     *     {@link LoanInterest }
     *     
     */
    public LoanInterest getInterest() {
        return interest;
    }

    /**
     * Define el valor de la propiedad interest.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanInterest }
     *     
     */
    public void setInterest(LoanInterest value) {
        this.interest = value;
    }

    /**
     * Obtiene el valor de la propiedad operationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Define el valor de la propiedad operationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

}
