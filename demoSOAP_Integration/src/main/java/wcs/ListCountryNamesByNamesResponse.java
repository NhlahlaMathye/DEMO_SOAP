package wcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListOfCountryNamesByNameResponse", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListCountryNamesByNamesResponse {

    @XmlElement(name = "ListOfCountryNamesByNameResult", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    protected ListCountryNamesByNamesResult listCountryNamesByNamesResult;

    public ListCountryNamesByNamesResult getListCountryNamesByNamesResult() {
        return listCountryNamesByNamesResult;
    }

    public void setListCountryNamesByNamesResult(ListCountryNamesByNamesResult listCountryNamesByNamesResult) {
        this.listCountryNamesByNamesResult = listCountryNamesByNamesResult;
    }
}
