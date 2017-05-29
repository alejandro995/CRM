
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bbva.czic.dto.canonical_model.Branch;
import com.bbva.czic.dto.canonical_model.Contract;


/**
 * <p>Clase Java para operationSenderContract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operationSenderContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branch" type="{urn:com:bbva:czic:dto:canonical_model}Branch" minOccurs="0"/>
 *         &lt;element name="contract" type="{urn:com:bbva:czic:dto:canonical_model}Contract" minOccurs="0"/>
 *         &lt;element name="repetitions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationSenderContract", propOrder = {
    "branch",
    "contract",
    "repetitions"
})
public class OperationSenderContract {

    protected Branch branch;
    protected Contract contract;
    protected String repetitions;

    /**
     * Obtiene el valor de la propiedad branch.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Define el valor de la propiedad branch.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * Obtiene el valor de la propiedad repetitions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetitions() {
        return repetitions;
    }

    /**
     * Define el valor de la propiedad repetitions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetitions(String value) {
        this.repetitions = value;
    }

}
