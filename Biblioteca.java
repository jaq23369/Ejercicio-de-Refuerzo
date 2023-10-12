import java.util.ArrayList;
import java.util.List;

/**
 * Representa una biblioteca con su conjunto de publicaciones.
 */
public class Biblioteca {

    /** 
     * Lista que almacena las publicaciones disponibles en la biblioteca.
     */
    private List<Publicacion> publicaciones;

    /**
     * Constructor de la clase Biblioteca.
     * Inicializa la lista de publicaciones como una lista vacía.
     */
    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    /**
     * Agrega una nueva publicación a la lista de publicaciones de la biblioteca.
     * 
     * @param publicacion Publicación que se desea agregar a la biblioteca.
     */
    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    /**
     * Busca y retorna una publicación en la biblioteca según su ID.
     * 
     * @param id El identificador único de la publicación que se quiere buscar.
     * @return Retorna la publicación con el ID proporcionado si se encuentra, de lo contrario retorna null.
     */
    public Publicacion buscarPublicacionPorId(String id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId().equals(id)) {
                return publicacion;
            }
        }
        return null;
    }

    /**
     * Muestra la información de todas las publicaciones disponibles en la biblioteca.
     * La información se imprime en la consola.
     */
    public void mostrarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }
}

