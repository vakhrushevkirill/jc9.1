import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class JSONMapper {

    public JSONMapper() {

    }
    public List<Cat> catsMapper(InputStream inputStreamResponse){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Cat> cats = null;
        try {
            cats = objectMapper.readValue(
                    inputStreamResponse,
                    new TypeReference<List<Cat>>() {
                    });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cats;
    }
}