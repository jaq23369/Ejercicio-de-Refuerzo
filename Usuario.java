/**
 * Representa un usuario de la biblioteca.
 * Esta clase gestiona la información personal del usuario y las interacciones con las publicaciones.
 */
public class Usuario {

    /** Número de identidad del usuario, utilizado como identificador único. */
    private String numeroIdentidad;

    /** Nombre completo del usuario. */
    private String nombre;

    /** Dirección física del usuario. */
    private String direccion;

    /** 
     * Contador que lleva un registro de la cantidad de publicaciones prestadas actualmente al usuario.
     * Su valor no debe superar un límite predefinido (por ejemplo, 5). 
     */
    private int cantidadPublicacionesPrestadas;

    /**
     * Constructor principal de la clase Usuario.
     * Inicializa los atributos con los valores proporcionados y establece la cantidad de publicaciones prestadas en 0.
     * 
     * @param numeroIdentidad Número de identidad del usuario.
     * @param nombre Nombre completo del usuario.
     * @param direccion Dirección física del usuario.
     */
    public Usuario(String numeroIdentidad, String nombre, String direccion) {
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPublicacionesPrestadas = 0; // Inicialmente, el usuario no tiene publicaciones prestadas.
    }

    /**
     * Incrementa el contador de publicaciones prestadas al usuario.
     * Este método debería ser invocado cuando un usuario toma una publicación en préstamo.
     */
    public void tomarPrestado() {
        this.cantidadPublicacionesPrestadas++;
    }

    /**
     * Decrementa el contador de publicaciones prestadas al usuario.
     * Este método debería ser invocado cuando un usuario devuelve una publicación.
     */
    public void devolverPrestado() {
        if (this.cantidadPublicacionesPrestadas > 0) {
            this.cantidadPublicacionesPrestadas--;
        }
    }

    /**
     * @return el número de identidad del usuario.
     */
    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    /**
     * Establece un nuevo número de identidad para el usuario.
     * 
     * @param numeroIdentidad El nuevo número de identidad a asignar.
     */
    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    /**
     * @return el nombre completo del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     * 
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la dirección del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece una nueva dirección para el usuario.
     * 
     * @param direccion La nueva dirección a asignar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return la cantidad de publicaciones que el usuario tiene prestadas en este momento.
     */
    public int getCantidadPublicacionesPrestadas() {
        return cantidadPublicacionesPrestadas;
    }

    /**
     * Establece la cantidad de publicaciones prestadas al usuario.
     * Este método puede ser útil para resetear el contador o asignar un valor específico, pero debe usarse con precaución.
     * 
     * @param cantidad La cantidad de publicaciones prestadas a establecer.
     */
    public void setCantidadPublicacionesPrestadas(int cantidad) {
        this.cantidadPublicacionesPrestadas = cantidad;
    }

    @Override
    /**
     * Retorna una representación en cadena de texto del usuario.
     * 
     * @return Cadena representando la información principal del usuario.
     */
    public String toString() {
        return "ID: " + numeroIdentidad + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Publicaciones Prestadas: " + cantidadPublicacionesPrestadas;
    }
}
