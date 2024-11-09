import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

CPersona p1=new CPersona("Juan","87654321",20,"Masculino");

JSONexception jsone=new JSONexception();

ArchivosGestion.crearArchivo("persona.json");

//EJERCICIO 1

JSONObject obj= new JSONObject(jsone.crearobjetoJSON(p1));


jsone.grabarenArchivo(obj,"persona.json");

//EJERCICIO 2

        jsone.mostrarArchivo("persona.json");
    }
}