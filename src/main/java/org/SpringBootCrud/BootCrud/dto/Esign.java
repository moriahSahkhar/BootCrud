package org.SpringBootCrud.BootCrud.dto;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@XmlRootElement(name = "Esign")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JacksonXmlRootElement(localName = "Esign")
//@XmlRootElement(name = "Esign")
public class Esign {

    @XmlAttribute
//    @JacksonXmlProperty(isAttribute = true)
    private String ver;

    //    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String sc;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private Date ts;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String txn;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String ekycId;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String ekycIdType;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String aspId;

//    @JacksonXmlProperty(isAttribute = true, localName = "AuthMode")
    @XmlAttribute
    private String authMode;

//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String responseSigType;


//    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String responseUrl;

//    @JacksonXmlProperty(localName = "Docs")
    @XmlElement(name = "Docs")
    private Docs docs;

////    @JacksonXmlProperty(localName = "Signature")
    @XmlElement(name = "Signature")
    private String signature;

}
