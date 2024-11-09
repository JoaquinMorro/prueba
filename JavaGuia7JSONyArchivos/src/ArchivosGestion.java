import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArchivosGestion {

    public static void crearArchivo(String archivo){
        File file=new File(archivo);

        try{
            PrintWriter salida=new PrintWriter(file);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("El archivo se creo correctamente");
    }
}
