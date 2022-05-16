package wss;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Language {

    @XmlElement(name = "Language", namespace = "http://www.oorsprong.org/websamples.countryinfo")
    private List<Language> language;

    public List<Language> getLanguage() {
        return language;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }
}
