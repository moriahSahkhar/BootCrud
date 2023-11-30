package org.SpringBootCrud.BootCrud.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@JacksonXmlRootElement(localName = "Docs")
public class Docs {

    @XmlElement(name = "InputHash")
//    @JacksonXmlProperty(localName = "InputHash")
    private InputHash inputHash;
}
