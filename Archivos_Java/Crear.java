// Importar la clase "File":
import java.io.File;
  
// Importar la clase "IOException" para manejar errores:
import java.io.IOException;
  
public class Crear {
    public static void main(String[] args)
    {
  
        try {
            File Archivo = new File("miarchivo.txt");
            if (Archivo.createNewFile()) {
                System.out.println("Archivo creado: "
                                   + Archivo.getName());
            }
            else {
                System.out.println("El archivo ya existe.");
            }
        }
        catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }
    }
}