package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListOfLanguagesByNameResponse", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOfLanguagesByNameResponse {

    @XmlElement(name = "ListOfLanguagesByNameResult", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    protected ListOfLanguagesByNameResult listOfLanguagesByNameResult;


    public ListOfLanguagesByNameResult getListOfLanguagesByNameResult() {
        return listOfLanguagesByNameResult;
    }

    public void setListOfLanguagesByNameResult(ListOfLanguagesByNameResult listOfLanguagesByNameResult) {
        this.listOfLanguagesByNameResult = listOfLanguagesByNameResult;
    }
}
