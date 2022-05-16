package wcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ListOfCountryNamesByNameResult", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListCountryNamesByNamesResult {

    @XmlElement(name = "tCountryCodeAndName", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    List<TCountryName> tCountryNames;

    public List<TCountryName> gettCountryNames() {
        return tCountryNames;
    }

    public void settCountryNames(List<TCountryName> tCountryNames) {
        this.tCountryNames = tCountryNames;
    }
}
