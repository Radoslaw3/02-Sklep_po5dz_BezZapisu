package pliki;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;
//import org.codehaus.jackson.map.ObjectMapper;


import java.io.*;

public class PlikiJson implements OperacjePlikowe {

    // InputStream, OutputStream - pliki binarne
    // Reader (Scanner), Writer - pliki tekstowe

    public void zapisz(Sklep sklep) throws IOException {
// to byl kolejny babol ktory mnie blokowal przed zapisem poprawnym. Czyli zla biblioteka uzyta.
//        org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
        ObjectMapper mapper = new ObjectMapper();
        mapper
                .writerWithDefaultPrettyPrinter()   //tego nie moglem
                .writeValue(new File("sklep.json"), sklep);


    }

    public Sklep wczytaj() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Sklep sklep = mapper.readValue(new File("sklep.json"),Sklep.class);
        return sklep;
    }
}
