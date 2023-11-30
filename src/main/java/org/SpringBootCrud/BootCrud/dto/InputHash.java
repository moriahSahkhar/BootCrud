package org.SpringBootCrud.BootCrud.dto;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@JacksonXmlRootElement(localName = "InputHash")
public class InputHash {

    //    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String id;

    //    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String hashAlgorithm;

    //    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute
    private String docInfo;

    @XmlValue
    //    @JacksonXmlText
    private String docHex;
}
