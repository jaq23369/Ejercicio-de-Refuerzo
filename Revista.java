/**
 * Clase que representa una revista en la biblioteca.
 */
public class Revista extends Publicacion {
    private int ano;
    private int numero;

    /**
     * Constructor para Revista.
     * @param id ID de la revista.
     * @param titulo Título de la revista.
     * @param materia Materia de la revista.
     * @param cantidadEjemplares Número de copias disponibles.
     * @param ano Año de publicación de la revista.
     * @param numero Número de edición de la revista.
     */
    public Revista(String id, String titulo, String materia, int cantidadEjemplares, int ano, int numero) {
        super(id, titulo, materia, cantidadEjemplares);
        this.ano = ano;
        this.numero = numero;
    }

    /**
     * @return el año de publicación de la revista.
     */
    public int getAno(){ 
        return ano; 
        }

    /**
     * Establece el año de publicación de la revista.
     * @param ano Año a establecer.
     */
    public void setAno(int ano){ 
        this.ano = ano; 
        }

    /**
     * @return el número de edición de la revista.
     */
    public int getNumero(){ 
        return numero; 
        }

    /**
     * Establece el número de edición de la revista.
     * @param numero Número a establecer.
     */
    public void setNumero(int numero){ 
        this.numero = numero; 
        }
}

