/**
 * Clase abstracta que representa una publicación genérica en la biblioteca.
 * Define las características comunes de todas las publicaciones.
 */
public abstract class Publicacion implements Prestable {

    /** Identificador único de la publicación. */
    protected String id;

    /** Título de la publicación. */
    protected String titulo;

    /** Materia o tema de la publicación. */
    protected String materia;

    /** Cantidad total de ejemplares de la publicación disponibles en la biblioteca. */
    protected int cantidadEjemplares;

    /** Estado de disponibilidad de la publicación. */
    protected boolean estado;

    /**
     * Constructor que inicializa una nueva publicación.
     * 
     * @param id Identificador único de la publicación.
     * @param titulo Título de la publicación.
     * @param materia Materia o tema de la publicación.
     * @param cantidadEjemplares Cantidad total de ejemplares disponibles.
     */
    public Publicacion(String id, String titulo, String materia, int cantidadEjemplares) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = (cantidadEjemplares > 0);
    }

    // Getters y setters 

    /**
     * Obtiene el ID de la publicación.
     * 
     * @return id de la publicación.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID de la publicación.
     * 
     * @param id ID de la publicación.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el título de la publicación.
     * 
     * @return título de la publicación.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la publicación.
     * 
     * @param titulo Título de la publicación.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la materia de la publicación.
     * 
     * @return materia de la publicación.
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Establece la materia de la publicación.
     * 
     * @param materia Materia de la publicación.
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Obtiene la cantidad de ejemplares disponibles.
     * 
     * @return cantidad de ejemplares.
     */
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    /**
     * Establece la cantidad de ejemplares disponibles.
     * 
     * @param cantidadEjemplares Cantidad de ejemplares.
     */
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    /**
     * Verifica si hay ejemplares disponibles.
     * 
     * @return verdadero si hay ejemplares, falso de lo contrario.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado de disponibilidad.
     * 
     * @param estado Estado de disponibilidad.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
      /**
     * Implementa el método prestar de la interfaz Prestable.
     * Reduce la cantidad de ejemplares disponibles y ajusta el estado si es necesario.
     */
    public void prestar() {
       if (this.cantidadEjemplares > 0) {
        this.cantidadEjemplares--;
        this.estado = this.cantidadEjemplares > 0; // Actualiza el estado en función de la cantidad de ejemplares.
        }
    }


    @Override
      /**
     * Implementa el método prestar de la interfaz Prestable.
     * Reduce la cantidad de ejemplares disponibles y ajusta el estado si es necesario.
     */
    public void devolver() {
       this.cantidadEjemplares++;
    this.estado = true; // Siempre será verdadero después de devolver.

    }

    @Override
      /**
     * Retorna una representación en cadena de texto de la publicación.
     * Incluye los principales atributos para su identificación.
     * 
     * @return Cadena representando a la publicación.
     */
    public String toString() {
     return "ID: " + id + ", Título: " + titulo + ", Materia: " + materia + ", Ejemplares: " + cantidadEjemplares;
    }
}

