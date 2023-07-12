//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.06 at 02:16:40 PM IST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}version" minOccurs="0"/&gt;
 *         &lt;element ref="{}title" minOccurs="0"/&gt;
 *         &lt;element ref="{}introduction" minOccurs="0"/&gt;
 *         &lt;element ref="{}chapter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isAddenda"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "title",
    "introduction",
    "chapter"
})
@XmlRootElement(name = "ICD10CM.tabular")
public class ICD10CMTabular {

    protected ContentType version;
    protected ContentType title;
    protected IntroductionType introduction;
    protected List<ChapterType> chapter;
    @XmlAttribute(name = "isAddenda")
    protected String isAddenda;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setVersion(ContentType value) {
        this.version = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setTitle(ContentType value) {
        this.title = value;
    }

    /**
     * Gets the value of the introduction property.
     * 
     * @return
     *     possible object is
     *     {@link IntroductionType }
     *     
     */
    public IntroductionType getIntroduction() {
        return introduction;
    }

    /**
     * Sets the value of the introduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntroductionType }
     *     
     */
    public void setIntroduction(IntroductionType value) {
        this.introduction = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChapterType }
     * 
     * 
     */
    public List<ChapterType> getChapter() {
        if (chapter == null) {
            chapter = new ArrayList<ChapterType>();
        }
        return this.chapter;
    }

    /**
     * Gets the value of the isAddenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAddenda() {
        return isAddenda;
    }

    /**
     * Sets the value of the isAddenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAddenda(String value) {
        this.isAddenda = value;
    }

}