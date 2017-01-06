//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 04:16:51 PM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContainerConstraints" type="{http://dss.esig.europa.eu/validation/policy}ContainerConstraints" minOccurs="0"/>
 *         &lt;element name="SignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}SignatureConstraints" minOccurs="0"/>
 *         &lt;element name="CounterSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}SignatureConstraints" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/policy}TimestampConstraints" minOccurs="0"/>
 *         &lt;element name="Revocation" type="{http://dss.esig.europa.eu/validation/policy}RevocationConstraints" minOccurs="0"/>
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/>
 *         &lt;element name="Article32" type="{http://dss.esig.europa.eu/validation/policy}Article32" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "containerConstraints",
    "signatureConstraints",
    "counterSignatureConstraints",
    "timestamp",
    "revocation",
    "cryptographic",
    "article32"
})
@XmlRootElement(name = "ConstraintsParameters")
public class ConstraintsParameters {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ContainerConstraints")
    protected ContainerConstraints containerConstraints;
    @XmlElement(name = "SignatureConstraints")
    protected SignatureConstraints signatureConstraints;
    @XmlElement(name = "CounterSignatureConstraints")
    protected SignatureConstraints counterSignatureConstraints;
    @XmlElement(name = "Timestamp")
    protected TimestampConstraints timestamp;
    @XmlElement(name = "Revocation")
    protected RevocationConstraints revocation;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;
    @XmlElement(name = "Article32")
    protected Article32 article32;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the containerConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerConstraints }
     *     
     */
    public ContainerConstraints getContainerConstraints() {
        return containerConstraints;
    }

    /**
     * Sets the value of the containerConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerConstraints }
     *     
     */
    public void setContainerConstraints(ContainerConstraints value) {
        this.containerConstraints = value;
    }

    /**
     * Gets the value of the signatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureConstraints }
     *     
     */
    public SignatureConstraints getSignatureConstraints() {
        return signatureConstraints;
    }

    /**
     * Sets the value of the signatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureConstraints }
     *     
     */
    public void setSignatureConstraints(SignatureConstraints value) {
        this.signatureConstraints = value;
    }

    /**
     * Gets the value of the counterSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureConstraints }
     *     
     */
    public SignatureConstraints getCounterSignatureConstraints() {
        return counterSignatureConstraints;
    }

    /**
     * Sets the value of the counterSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureConstraints }
     *     
     */
    public void setCounterSignatureConstraints(SignatureConstraints value) {
        this.counterSignatureConstraints = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampConstraints }
     *     
     */
    public TimestampConstraints getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampConstraints }
     *     
     */
    public void setTimestamp(TimestampConstraints value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the revocation property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationConstraints }
     *     
     */
    public RevocationConstraints getRevocation() {
        return revocation;
    }

    /**
     * Sets the value of the revocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationConstraints }
     *     
     */
    public void setRevocation(RevocationConstraints value) {
        this.revocation = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

    /**
     * Gets the value of the article32 property.
     * 
     * @return
     *     possible object is
     *     {@link Article32 }
     *     
     */
    public Article32 getArticle32() {
        return article32;
    }

    /**
     * Sets the value of the article32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article32 }
     *     
     */
    public void setArticle32(Article32 value) {
        this.article32 = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
