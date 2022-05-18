// Importar la clase "File":
import java.io.File;
  
// Importar la clase "IOException" para manejar errores:
import java.io.IOException;

// Importar el escritor, clase "FileWriter":
import java.io.FileWriter; 
  
 
public class Escribir {
    public static void main(String[] args)
    {
        try {
            // Si cambio es_apendice, puedo añadir lineas, sino sobreescribo.
            boolean es_apendice = true;
            FileWriter Escritor = new FileWriter("miarchivo.txt", es_apendice);            
            
            Escritor.write("Es facil escribir a un archivo.\n");
            Escritor.close();
            System.out.println("Texto escrito en archivo.");
        }
        catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }
    }
}