import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONexception extends RuntimeException {

    public JSONObject crearobjetoJSON(CPersona persona) {
        JSONObject obj1 = new JSONObject();
        try {

            obj1.put("nombre", persona.getNombre());
            obj1.put("dni", persona.getDni());
            obj1.put("edad", persona.getEdad());
            obj1.put("sexo", persona.getSexo());

        }catch (JSONexception e){
            e.printStackTrace();
        }
        return obj1;
    }

    public static void grabarenArchivo (JSONObject obj1,String archivo){
try {
    FileWriter file = new FileWriter(archivo);
    file.write(obj1.toString());
    file.close();
} catch (IOException e) {
    e.printStackTrace();
}
    }

    public static JSONTokener leer(String archivo){
        JSONTokener tokener=null;

        try{
            tokener=new JSONTokener(new FileReader(archivo));
        }catch(FileNotFoundException e){e.printStackTrace();
        }
return tokener;
    }

    public void mostrarArchivo(String archivo){
        JSONObject obj=new JSONObject(JSONUtiles.leer(archivo));
        CPersona persona=new CPersona();
        try{


            persona.setNombre(obj.getString("nombre"));
            persona.setDni(obj.getString("dni"));
            persona.setEdad(obj.getInt("edad"));
            persona.setSexo(obj.getString("sexo"));

persona.toString();
        } catch (JSONexception e) {
            e.printStackTrace();
        }
    }
}
