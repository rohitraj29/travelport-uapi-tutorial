
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentRef" type="{http://www.travelport.com/schema/common_v32_0}typeGeneralReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="ThirdPartyCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ThirdPartyLocatorCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="36"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ThirdPartyName" type="{http://www.travelport.com/schema/common_v32_0}typeThirdPartySupplier" /&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segmentRef"
})
@XmlRootElement(name = "ThirdPartyInformation")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public class ThirdPartyInformation
    implements Locatable
{

    @XmlElement(name = "SegmentRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeGeneralReference> segmentRef;
    @XmlAttribute(name = "ThirdPartyCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected String thirdPartyCode;
    @XmlAttribute(name = "ThirdPartyLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected String thirdPartyLocatorCode;
    @XmlAttribute(name = "ThirdPartyName")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected String thirdPartyName;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlAttribute(name = "ElStat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean keyOverride;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the segmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<TypeGeneralReference>();
        }
        return this.segmentRef;
    }

    /**
     * Gets the value of the thirdPartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    /**
     * Sets the value of the thirdPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setThirdPartyCode(String value) {
        this.thirdPartyCode = value;
    }

    /**
     * Gets the value of the thirdPartyLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String getThirdPartyLocatorCode() {
        return thirdPartyLocatorCode;
    }

    /**
     * Sets the value of the thirdPartyLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setThirdPartyLocatorCode(String value) {
        this.thirdPartyLocatorCode = value;
    }

    /**
     * Gets the value of the thirdPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String getThirdPartyName() {
        return thirdPartyName;
    }

    /**
     * Sets the value of the thirdPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setThirdPartyName(String value) {
        this.thirdPartyName = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
