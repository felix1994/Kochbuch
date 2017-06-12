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
 * <p>Java-Klasse für ZutatenTyp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZutatenTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zutat" type="{}ZutatTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZutatenTyp", propOrder = {
    "zutat"
})
public class ZutatenTyp {

    @XmlElement(name = "Zutat", required = true)
    protected ZutatTyp zutat;

    /**
     * Ruft den Wert der zutat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZutatTyp }
     *     
     */
    public ZutatTyp getZutat() {
        return zutat;
    }

    /**
     * Legt den Wert der zutat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatTyp }
     *     
     */
    public void setZutat(ZutatTyp value) {
        this.zutat = value;
    }

}
