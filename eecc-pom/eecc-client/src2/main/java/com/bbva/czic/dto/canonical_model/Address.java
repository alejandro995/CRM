
package com.bbva.czic.dto.canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Address complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="streetType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstStreetOrdinal" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="firstStreetBis" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="firstStreetCardinality" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="firstStreetNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="secondStreetOrdinal" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="secondStreetBis" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="secondStreetCardinality" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="secondStreetNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="additionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:com:bbva:czic:dto:canonical_model}reference" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetSocialLevel" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="startingResidenceDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberPersonLiving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ownershipType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stair" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="door" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geographicGroup" type="{urn:com:bbva:czic:dto:canonical_model}geographicGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasContractsAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "location",
    "id",
    "type",
    "streetType",
    "streetName",
    "streetNumber",
    "firstStreetOrdinal",
    "firstStreetBis",
    "firstStreetCardinality",
    "firstStreetNumber",
    "secondStreetOrdinal",
    "secondStreetBis",
    "secondStreetCardinality",
    "secondStreetNumber",
    "additionalInformation",
    "name",
    "country",
    "city",
    "state",
    "streetSocialLevel",
    "startingResidenceDate",
    "numberPersonLiving",
    "ownershipType",
    "zipcode",
    "block",
    "stair",
    "floor",
    "door",
    "alias",
    "geographicGroup",
    "hasContractsAssociated"
})
public class Address {

    protected String location;
    protected String id;
    protected OptionsList type;
    protected OptionsList streetType;
    protected String streetName;
    protected Integer streetNumber;
    protected OptionsList firstStreetOrdinal;
    protected OptionsList firstStreetBis;
    protected OptionsList firstStreetCardinality;
    protected Integer firstStreetNumber;
    protected OptionsList secondStreetOrdinal;
    protected OptionsList secondStreetBis;
    protected OptionsList secondStreetCardinality;
    protected Integer secondStreetNumber;
    protected String additionalInformation;
    protected String name;
    protected Reference country;
    protected String city;
    protected String state;
    protected OptionsList streetSocialLevel;
    protected Integer startingResidenceDate;
    protected Integer numberPersonLiving;
    protected OptionsList ownershipType;
    protected String zipcode;
    protected String block;
    protected String stair;
    protected String floor;
    protected String door;
    protected String alias;
    @XmlElement(nillable = true)
    protected List<GeographicGroup> geographicGroup;
    protected Boolean hasContractsAssociated;

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setType(OptionsList value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad streetType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getStreetType() {
        return streetType;
    }

    /**
     * Define el valor de la propiedad streetType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setStreetType(OptionsList value) {
        this.streetType = value;
    }

    /**
     * Obtiene el valor de la propiedad streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtiene el valor de la propiedad streetNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetNumber() {
        return streetNumber;
    }

    /**
     * Define el valor de la propiedad streetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetNumber(Integer value) {
        this.streetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad firstStreetOrdinal.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getFirstStreetOrdinal() {
        return firstStreetOrdinal;
    }

    /**
     * Define el valor de la propiedad firstStreetOrdinal.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setFirstStreetOrdinal(OptionsList value) {
        this.firstStreetOrdinal = value;
    }

    /**
     * Obtiene el valor de la propiedad firstStreetBis.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getFirstStreetBis() {
        return firstStreetBis;
    }

    /**
     * Define el valor de la propiedad firstStreetBis.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setFirstStreetBis(OptionsList value) {
        this.firstStreetBis = value;
    }

    /**
     * Obtiene el valor de la propiedad firstStreetCardinality.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getFirstStreetCardinality() {
        return firstStreetCardinality;
    }

    /**
     * Define el valor de la propiedad firstStreetCardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setFirstStreetCardinality(OptionsList value) {
        this.firstStreetCardinality = value;
    }

    /**
     * Obtiene el valor de la propiedad firstStreetNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstStreetNumber() {
        return firstStreetNumber;
    }

    /**
     * Define el valor de la propiedad firstStreetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstStreetNumber(Integer value) {
        this.firstStreetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad secondStreetOrdinal.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSecondStreetOrdinal() {
        return secondStreetOrdinal;
    }

    /**
     * Define el valor de la propiedad secondStreetOrdinal.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSecondStreetOrdinal(OptionsList value) {
        this.secondStreetOrdinal = value;
    }

    /**
     * Obtiene el valor de la propiedad secondStreetBis.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSecondStreetBis() {
        return secondStreetBis;
    }

    /**
     * Define el valor de la propiedad secondStreetBis.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSecondStreetBis(OptionsList value) {
        this.secondStreetBis = value;
    }

    /**
     * Obtiene el valor de la propiedad secondStreetCardinality.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSecondStreetCardinality() {
        return secondStreetCardinality;
    }

    /**
     * Define el valor de la propiedad secondStreetCardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSecondStreetCardinality(OptionsList value) {
        this.secondStreetCardinality = value;
    }

    /**
     * Obtiene el valor de la propiedad secondStreetNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondStreetNumber() {
        return secondStreetNumber;
    }

    /**
     * Define el valor de la propiedad secondStreetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondStreetNumber(Integer value) {
        this.secondStreetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define el valor de la propiedad additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCountry(Reference value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad streetSocialLevel.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getStreetSocialLevel() {
        return streetSocialLevel;
    }

    /**
     * Define el valor de la propiedad streetSocialLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setStreetSocialLevel(OptionsList value) {
        this.streetSocialLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad startingResidenceDate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingResidenceDate() {
        return startingResidenceDate;
    }

    /**
     * Define el valor de la propiedad startingResidenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingResidenceDate(Integer value) {
        this.startingResidenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad numberPersonLiving.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberPersonLiving() {
        return numberPersonLiving;
    }

    /**
     * Define el valor de la propiedad numberPersonLiving.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberPersonLiving(Integer value) {
        this.numberPersonLiving = value;
    }

    /**
     * Obtiene el valor de la propiedad ownershipType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getOwnershipType() {
        return ownershipType;
    }

    /**
     * Define el valor de la propiedad ownershipType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setOwnershipType(OptionsList value) {
        this.ownershipType = value;
    }

    /**
     * Obtiene el valor de la propiedad zipcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Define el valor de la propiedad zipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Obtiene el valor de la propiedad block.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Define el valor de la propiedad block.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Obtiene el valor de la propiedad stair.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStair() {
        return stair;
    }

    /**
     * Define el valor de la propiedad stair.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStair(String value) {
        this.stair = value;
    }

    /**
     * Obtiene el valor de la propiedad floor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Define el valor de la propiedad floor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Obtiene el valor de la propiedad door.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Define el valor de la propiedad door.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the geographicGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicGroup }
     * 
     * 
     */
    public List<GeographicGroup> getGeographicGroup() {
        if (geographicGroup == null) {
            geographicGroup = new ArrayList<GeographicGroup>();
        }
        return this.geographicGroup;
    }

    /**
     * Obtiene el valor de la propiedad hasContractsAssociated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasContractsAssociated() {
        return hasContractsAssociated;
    }

    /**
     * Define el valor de la propiedad hasContractsAssociated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasContractsAssociated(Boolean value) {
        this.hasContractsAssociated = value;
    }

}
