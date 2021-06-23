package files;

import DTO.Materia;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fileReader {

    public fileReader() {}

    private JSONObject readFile(){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/materias.json"));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Materia> getListaMaterias(){
        List<Materia> listaMaterias;
        listaMaterias = new ArrayList<>();

        JSONObject fileObject = readFile();
        JSONArray materias = (JSONArray) fileObject.get("Materias");
        Iterator<JSONObject> iterator = materias.iterator();

        Gson gson = new Gson();
        while (iterator.hasNext()) {
            listaMaterias.add(gson.fromJson(iterator.next().toString(), Materia.class));
        }
        return listaMaterias;
    }
}
