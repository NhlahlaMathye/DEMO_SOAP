package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListOfLanguagesByName", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)

public class ListOfLanguagesByName {

    @XmlElement(name = "ISOCode")
    protected String isoCode;
    @XmlElement(name = "Name")
    protected String name;

    public String _return()
    {
        return "" + name + "" + isoCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
