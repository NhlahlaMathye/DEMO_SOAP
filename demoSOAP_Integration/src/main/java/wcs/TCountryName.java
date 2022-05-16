package wcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListOfCountryNamesByName", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class TCountryName {

    @XmlElement(name = "sISOCode", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    protected String isoCOde;
    @XmlElement(name = "sName", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    protected String name;

    public String getIsoCOde() {
        return isoCOde;
    }

    public void setIsoCOde(String isoCOde) {
        this.isoCOde = isoCOde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
