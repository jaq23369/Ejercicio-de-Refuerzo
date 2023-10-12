/**
 * Clase que representa un artículo en la biblioteca.
 */
public class Articulo extends Publicacion {
    private String arbitro;

    /**
     * Constructor para Articulo.
     * @param id ID del artículo.
     * @param titulo Título del artículo.
     * @param materia Materia del artículo.
     * @param cantidadEjemplares Número de copias disponibles.
     * @param arbitro Árbitro o revisor del artículo.
     */
    public Articulo(String id, String titulo, String materia, int cantidadEjemplares, String arbitro) {
        super(id, titulo, materia, cantidadEjemplares);
        this.arbitro = arbitro;
    }

    /**
     * @return el árbitro o revisor del artículo.
     */
    public String getArbitro(){ 
        return arbitro; 
        }

    /**
     * Establece el árbitro o revisor del artículo.
     * @param arbitro Árbitro a establecer.
     */
    public void setArbitro(String arbitro){ 
        this.arbitro = arbitro; 
        }
}

