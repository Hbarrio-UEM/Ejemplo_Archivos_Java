 
public class TodoJunto {
    public static void main(String[] args)
    {    
        // Al estar en el mismo directorio, podemos llamar a las 
        // clases que hemos creado directamente:
        Crear Creador = new Crear();
        Escribir Escritor = new Escribir();
        Leer Lector = new Leer();
        Borrar Borrador = new Borrar();
        
        // No se deberia llamar al metodo main, no es del todo correcto.
        // Pero se puede.
        Creador.main(null);
        Escritor.main(null);
        Lector.main(null);
        Borrador.main(null);
    }
}