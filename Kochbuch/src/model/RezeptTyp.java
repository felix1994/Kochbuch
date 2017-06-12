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
 * <p>Java-Klasse für RezeptTyp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RezeptTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Schwierigkeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zutaten" type="{}ZutatenTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RezeptTyp", propOrder = {
    "name",
    "beschreibung",
    "anleitung",
    "schwierigkeit",
    "dauer",
    "typ",
    "zutaten"
})
public class RezeptTyp {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Beschreibung", required = true)
    protected String beschreibung;
    @XmlElement(name = "Anleitung", required = true)
    protected String anleitung;
    @XmlElement(name = "Schwierigkeit", required = true)
    protected String schwierigkeit;
    @XmlElement(name = "Dauer", required = true)
    protected String dauer;
    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Zutaten", required = true)
    protected ZutatenTyp zutaten;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
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
     * Legt den Wert der name-Eigenschaft fest.
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
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der anleitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnleitung() {
        return anleitung;
    }

    /**
     * Legt den Wert der anleitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnleitung(String value) {
        this.anleitung = value;
    }

    /**
     * Ruft den Wert der schwierigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Legt den Wert der schwierigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeit(String value) {
        this.schwierigkeit = value;
    }

    /**
     * Ruft den Wert der dauer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDauer() {
        return dauer;
    }

    /**
     * Legt den Wert der dauer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDauer(String value) {
        this.dauer = value;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der zutaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZutatenTyp }
     *     
     */
    public ZutatenTyp getZutaten() {
        return zutaten;
    }

    /**
     * Legt den Wert der zutaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatenTyp }
     *     
     */
    public void setZutaten(ZutatenTyp value) {
        this.zutaten = value;
    }

}
