//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.06 at 07:51:57 PM CET 
//


package streafa.tech.polcar.xmlclasses.xmlclasses.productslist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MeasureUnit" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartNameOnInvoice" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartNameOnInvoiceFull" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Quality" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ITEM")
public class ITEM {

    @XmlAttribute(name = "MeasureUnit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String measureUnit;
    @XmlAttribute(name = "Number", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String number;
    @XmlAttribute(name = "PartNameOnInvoice", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String partNameOnInvoice;
    @XmlAttribute(name = "PartNameOnInvoiceFull", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String partNameOnInvoiceFull;
    @XmlAttribute(name = "Quality", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String quality;

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the partNameOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNameOnInvoice() {
        return partNameOnInvoice;
    }

    /**
     * Sets the value of the partNameOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNameOnInvoice(String value) {
        this.partNameOnInvoice = value;
    }

    /**
     * Gets the value of the partNameOnInvoiceFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNameOnInvoiceFull() {
        return partNameOnInvoiceFull;
    }

    /**
     * Sets the value of the partNameOnInvoiceFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNameOnInvoiceFull(String value) {
        this.partNameOnInvoiceFull = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
    }

}
