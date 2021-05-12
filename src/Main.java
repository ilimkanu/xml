import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new XmlMapper();
        Geoplugin xml = mapper.readValue("<Geoplugin><geoplugin_request>193.106.51.186</geoplugin_request><geoplugin_status>200</geoplugin_status></Geoplugin>", Geoplugin.class);
        System.out.println(xml);
    }
}
