// Importamos la clase archivo
import java.io.File; 
  
public class Borrar {
    public static void main(String[] args)
    {
        File Archivo = new File("miarchivo.txt");
        if (Archivo.delete()) {
            System.out.println("El archivo borrado era : " + Archivo.getName());
        }
        else {
            System.out.println("Imposible borrar archivo.");
        }
    }
}