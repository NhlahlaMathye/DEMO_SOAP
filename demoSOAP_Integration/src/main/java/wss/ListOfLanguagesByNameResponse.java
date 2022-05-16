package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ListOfLanguagesByNameResponse", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOfLanguagesByNameResponse {

    @XmlElement(name = "ListOfLanguagesByNameResult")
    protected String listOfLanguagesByNameResult;
    @XmlElement(name = "tLanguage")
   protected ListOfLanguagesByName listOfLanguagesByName;


    public ListOfLanguagesByName getListOfLanguagesByName() {
        return listOfLanguagesByName;
    }

    public void setListOfLanguagesByName(ListOfLanguagesByName listOfLanguagesByName) {
        this.listOfLanguagesByName = listOfLanguagesByName;
    }

    public String getListOfLanguagesByNameResult() {
        return listOfLanguagesByNameResult;
    }

    public void setListOfLanguagesByNameResult(String listOfLanguagesByNameResult) {
        this.listOfLanguagesByNameResult = listOfLanguagesByNameResult;
    }
}
