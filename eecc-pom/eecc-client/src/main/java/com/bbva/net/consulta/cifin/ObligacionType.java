
package com.bbva.net.consulta.cifin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObligacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObligacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PaqueteInformacion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="IdentificadorLinea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstadoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroObligacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Calidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstadoObligacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModalidadCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineaCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Periodicidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaApertura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaTerminacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaldoObligacion" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ValorMora" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorCuota" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CuotasCanceladas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoGarantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CubrimientoGarantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MoraMaxima" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comportamientos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParticipacionDeuda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProbabilidadNoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaCorte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModoExtincion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaPermanencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroReestructuraciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NaturalezaReestructuracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarcaTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClaseTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoEntidadOriginadoraCartera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntidadOriginadoraCartera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstadoTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroCuotasPactadas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroCuotasMora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reestructurado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DiasCartera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorCargoFijo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ClausulaPermanencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroMesesContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroMesesClausula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligacionType", propOrder = {
    "paqueteInformacionOrIdentificadorLineaOrTipoContrato"
})
public class ObligacionType {

    @XmlElementRefs({
        @XmlElementRef(name = "PaqueteInformacion", type = JAXBElement.class),
        @XmlElementRef(name = "EstadoTitular", type = JAXBElement.class),
        @XmlElementRef(name = "TipoEntidad", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroMesesClausula", type = JAXBElement.class),
        @XmlElementRef(name = "TipoPago", type = JAXBElement.class),
        @XmlElementRef(name = "EstadoObligacion", type = JAXBElement.class),
        @XmlElementRef(name = "EstadoContrato", type = JAXBElement.class),
        @XmlElementRef(name = "ModalidadCredito", type = JAXBElement.class),
        @XmlElementRef(name = "Periodicidad", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroMesesContrato", type = JAXBElement.class),
        @XmlElementRef(name = "EntidadOriginadoraCartera", type = JAXBElement.class),
        @XmlElementRef(name = "NaturalezaReestructuracion", type = JAXBElement.class),
        @XmlElementRef(name = "CuotasCanceladas", type = JAXBElement.class),
        @XmlElementRef(name = "Vigencia", type = JAXBElement.class),
        @XmlElementRef(name = "ValorCuota", type = JAXBElement.class),
        @XmlElementRef(name = "FechaPago", type = JAXBElement.class),
        @XmlElementRef(name = "TipoEntidadOriginadoraCartera", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroReestructuraciones", type = JAXBElement.class),
        @XmlElementRef(name = "Comportamientos", type = JAXBElement.class),
        @XmlElementRef(name = "ClausulaPermanencia", type = JAXBElement.class),
        @XmlElementRef(name = "FechaPermanencia", type = JAXBElement.class),
        @XmlElementRef(name = "ClaseTarjeta", type = JAXBElement.class),
        @XmlElementRef(name = "ParticipacionDeuda", type = JAXBElement.class),
        @XmlElementRef(name = "Calidad", type = JAXBElement.class),
        @XmlElementRef(name = "ValorCargoFijo", type = JAXBElement.class),
        @XmlElementRef(name = "FechaTerminacion", type = JAXBElement.class),
        @XmlElementRef(name = "MarcaTarjeta", type = JAXBElement.class),
        @XmlElementRef(name = "TipoGarantia", type = JAXBElement.class),
        @XmlElementRef(name = "CubrimientoGarantia", type = JAXBElement.class),
        @XmlElementRef(name = "FechaCorte", type = JAXBElement.class),
        @XmlElementRef(name = "DiasCartera", type = JAXBElement.class),
        @XmlElementRef(name = "ValorMora", type = JAXBElement.class),
        @XmlElementRef(name = "TipoContrato", type = JAXBElement.class),
        @XmlElementRef(name = "ChequesDevueltos", type = JAXBElement.class),
        @XmlElementRef(name = "SaldoObligacion", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroObligacion", type = JAXBElement.class),
        @XmlElementRef(name = "Reestructurado", type = JAXBElement.class),
        @XmlElementRef(name = "Sucursal", type = JAXBElement.class),
        @XmlElementRef(name = "LineaCredito", type = JAXBElement.class),
        @XmlElementRef(name = "ModoExtincion", type = JAXBElement.class),
        @XmlElementRef(name = "ValorInicial", type = JAXBElement.class),
        @XmlElementRef(name = "MoraMaxima", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroCuotasMora", type = JAXBElement.class),
        @XmlElementRef(name = "FechaApertura", type = JAXBElement.class),
        @XmlElementRef(name = "Ciudad", type = JAXBElement.class),
        @XmlElementRef(name = "ProbabilidadNoPago", type = JAXBElement.class),
        @XmlElementRef(name = "IdentificadorLinea", type = JAXBElement.class),
        @XmlElementRef(name = "Calificacion", type = JAXBElement.class),
        @XmlElementRef(name = "NumeroCuotasPactadas", type = JAXBElement.class),
        @XmlElementRef(name = "NombreEntidad", type = JAXBElement.class),
        @XmlElementRef(name = "TipoMoneda", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> paqueteInformacionOrIdentificadorLineaOrTipoContrato;

    /**
     * Gets the value of the paqueteInformacionOrIdentificadorLineaOrTipoContrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paqueteInformacionOrIdentificadorLineaOrTipoContrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getPaqueteInformacionOrIdentificadorLineaOrTipoContrato() {
        if (paqueteInformacionOrIdentificadorLineaOrTipoContrato == null) {
            paqueteInformacionOrIdentificadorLineaOrTipoContrato = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.paqueteInformacionOrIdentificadorLineaOrTipoContrato;
    }

}
