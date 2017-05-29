
package com.bbva.jee.arq.spring.core.servicing.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pagination complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="firstPage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastPage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nextPage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numPages" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pageSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="previousPage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagination")
public class Pagination {

    @XmlAttribute(name = "end")
    protected Long end;
    @XmlAttribute(name = "firstPage")
    protected String firstPage;
    @XmlAttribute(name = "lastPage")
    protected String lastPage;
    @XmlAttribute(name = "nextPage")
    protected String nextPage;
    @XmlAttribute(name = "numPages")
    protected Long numPages;
    @XmlAttribute(name = "page")
    protected Long page;
    @XmlAttribute(name = "pageSize")
    protected Long pageSize;
    @XmlAttribute(name = "previousPage")
    protected String previousPage;
    @XmlAttribute(name = "start")
    protected Long start;
    @XmlAttribute(name = "total")
    protected Long total;

    /**
     * Obtiene el valor de la propiedad end.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnd() {
        return end;
    }

    /**
     * Define el valor de la propiedad end.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnd(Long value) {
        this.end = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPage() {
        return firstPage;
    }

    /**
     * Define el valor de la propiedad firstPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    /**
     * Obtiene el valor de la propiedad lastPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPage() {
        return lastPage;
    }

    /**
     * Define el valor de la propiedad lastPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPage(String value) {
        this.lastPage = value;
    }

    /**
     * Obtiene el valor de la propiedad nextPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPage() {
        return nextPage;
    }

    /**
     * Define el valor de la propiedad nextPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPage(String value) {
        this.nextPage = value;
    }

    /**
     * Obtiene el valor de la propiedad numPages.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPages() {
        return numPages;
    }

    /**
     * Define el valor de la propiedad numPages.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPages(Long value) {
        this.numPages = value;
    }

    /**
     * Obtiene el valor de la propiedad page.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPage() {
        return page;
    }

    /**
     * Define el valor de la propiedad page.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPage(Long value) {
        this.page = value;
    }

    /**
     * Obtiene el valor de la propiedad pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Define el valor de la propiedad pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Obtiene el valor de la propiedad previousPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPage() {
        return previousPage;
    }

    /**
     * Define el valor de la propiedad previousPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPage(String value) {
        this.previousPage = value;
    }

    /**
     * Obtiene el valor de la propiedad start.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStart() {
        return start;
    }

    /**
     * Define el valor de la propiedad start.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStart(Long value) {
        this.start = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

}
