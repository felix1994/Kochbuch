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
 * <p>Java-Klasse für KochbuchType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KochbuchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezepte" type="{}RezepteTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KochbuchType", propOrder = {
    "rezepte"
})
public class KochbuchType {

    @XmlElement(name = "Rezepte", required = true)
    protected RezepteTyp rezepte;

    /**
     * Ruft den Wert der rezepte-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RezepteTyp }
     *     
     */
    public RezepteTyp getRezepte() {
        return rezepte;
    }

    /**
     * Legt den Wert der rezepte-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RezepteTyp }
     *     
     */
    public void setRezepte(RezepteTyp value) {
        this.rezepte = value;
    }

}
