// Importar la clase "File":
import java.io.File;
  
// Importar la clase "IOException" para manejar errores:
import java.io.FileNotFoundException; 
  
// Importar la clase "Scanner" para leer archivos:
import java.util.Scanner; 
  
public class Leer {
    public static void main(String[] args)
    {
        try {
            File Archivo = new File("miarchivo.txt");
            Scanner Lector = new Scanner(Archivo);
            while (Lector.hasNextLine()) {
                String datos = Lector.nextLine();
                System.out.println(datos);
            }
            Lector.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }
    }
}