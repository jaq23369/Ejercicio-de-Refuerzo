/**
 * Representa un libro específico en la biblioteca.
 * Esta clase extiende a Publicacion e introduce atributos específicos de los libros.
 */
public class Libro extends Publicacion {

    /** Autor o autores del libro. */
    private String autor;

    /** Editorial que publicó el libro. */
    private String editorial;

    /**
     * Constructor principal de la clase Libro.
     * 
     * @param id Identificador único del libro.
     * @param titulo Título del libro.
     * @param materia Materia o tema del libro.
     * @param cantidadEjemplares Cantidad total de ejemplares disponibles.
     * @param autor Autor o autores del libro.
     * @param editorial Editorial que publicó el libro.
     */
    public Libro(String id, String titulo, String materia, int cantidadEjemplares, String autor, String editorial) {
        super(id, titulo, materia, cantidadEjemplares);
        this.autor = autor;
        this.editorial = editorial;
    }

    /**
     * @return el autor o autores del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor o autores del libro.
     * 
     * @param autor Nuevo autor o autores del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return la editorial que publicó el libro.
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece la editorial que publicó el libro.
     * 
     * @param editorial Nueva editorial para el libro.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
