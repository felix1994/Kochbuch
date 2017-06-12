//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.06.12 um 07:16:54 PM CEST 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RezepteTyp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RezepteTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezept" type="{}RezeptTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RezepteTyp", propOrder = {
    "rezept"
})
public class RezepteTyp {

    @XmlElement(name = "Rezept", required = true)
    protected RezeptTyp rezept;

    /**
     * Ruft den Wert der rezept-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RezeptTyp }
     *     
     */
    public RezeptTyp getRezept() {
        return rezept;
    }

    /**
     * Legt den Wert der rezept-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RezeptTyp }
     *     
     */
    public void setRezept(RezeptTyp value) {
        this.rezept = value;
    }

}
