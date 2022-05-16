package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ListOfLanguagesByNameResult", namespace = "http://www.oorsprong.org/websamples.countryinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOfLanguagesByNameResult {

    @XmlElement(name = "tLanguage", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    protected List<TLanguage> TLanguages;

    public List<TLanguage> getTLanguages() {
        return TLanguages;
    }

    public void setTLanguages(List<TLanguage> TLanguages) {
        this.TLanguages = TLanguages;
    }
}
