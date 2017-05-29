
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para branchOccupancyInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="branchOccupancyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cashRegisterOccupancyLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cashRegisterWaitingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "branchOccupancyInformation", propOrder = {
    "cashRegisterOccupancyLevel",
    "cashRegisterWaitingTime"
})
public class BranchOccupancyInformation {

    protected BigDecimal cashRegisterOccupancyLevel;
    protected String cashRegisterWaitingTime;

    /**
     * Obtiene el valor de la propiedad cashRegisterOccupancyLevel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashRegisterOccupancyLevel() {
        return cashRegisterOccupancyLevel;
    }

    /**
     * Define el valor de la propiedad cashRegisterOccupancyLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashRegisterOccupancyLevel(BigDecimal value) {
        this.cashRegisterOccupancyLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad cashRegisterWaitingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashRegisterWaitingTime() {
        return cashRegisterWaitingTime;
    }

    /**
     * Define el valor de la propiedad cashRegisterWaitingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashRegisterWaitingTime(String value) {
        this.cashRegisterWaitingTime = value;
    }

}
