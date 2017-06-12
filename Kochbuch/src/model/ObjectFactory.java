//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.06.12 um 07:16:54 PM CEST 
//


package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Kochbuch_QNAME = new QName("", "Kochbuch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KochbuchType }
     * 
     */
    public KochbuchType createKochbuchType() {
        return new KochbuchType();
    }

    /**
     * Create an instance of {@link RezepteTyp }
     * 
     */
    public RezepteTyp createRezepteTyp() {
        return new RezepteTyp();
    }

    /**
     * Create an instance of {@link ZutatenTyp }
     * 
     */
    public ZutatenTyp createZutatenTyp() {
        return new ZutatenTyp();
    }

    /**
     * Create an instance of {@link RezeptTyp }
     * 
     */
    public RezeptTyp createRezeptTyp() {
        return new RezeptTyp();
    }

    /**
     * Create an instance of {@link ZutatTyp }
     * 
     */
    public ZutatTyp createZutatTyp() {
        return new ZutatTyp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KochbuchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Kochbuch")
    public JAXBElement<KochbuchType> createKochbuch(KochbuchType value) {
        return new JAXBElement<KochbuchType>(_Kochbuch_QNAME, KochbuchType.class, null, value);
    }

}
