import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase principal que contiene el programa de gestión de la biblioteca.
 */
public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Map<String, Usuario> usuarios = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

/**
     * Método principal que inicia el programa.
     */
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el newline
            procesarOpcion(opcion);
        } while (opcion != 9);
    }

/**
     * Muestra el menú de opciones en la consola.
     */
    private static void mostrarMenu() {
        System.out.println("------- Biblioteca -------");
        System.out.println("1. Agregar publicación");
        System.out.println("2. Mostrar publicaciones");
        System.out.println("3. Buscar publicación por ID");
        System.out.println("4. Prestar publicación");
        System.out.println("5. Devolver publicación");
        System.out.println("6. Registrar usuario");
        System.out.println("7. Mostrar usuarios");
        System.out.println("8. Salir");
        System.out.print("Elige una opción: ");
    }

/**
     * Procesa la opción seleccionada por el usuario.
     *
     * @param opcion La opción seleccionada.
     */
    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarPublicacion();
                break;
            case 2:
                biblioteca.mostrarPublicaciones();
                break;
            case 3:
                buscarPublicacionPorID();
                break;
            case 4:
                prestarPublicacion();
                break;
            case 5:
                devolverPublicacion();
                break;
            case 6:
                registrarUsuario();
                break;
            case 7:
                mostrarUsuarios();
                break;
            case 8:
                System.out.println("Gracias por usar el sistema de la biblioteca.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
/**
     * Permite al usuario agregar una nueva publicación a la biblioteca.
     */
    private static void agregarPublicacion() {
        // Implementación detallada de cómo agregar una publicación
        System.out.println("Tipo de publicación (1. Libro, 2. Revista, 3. Artículo): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Materia: ");
        String materia = scanner.nextLine();

        System.out.print("Cantidad de ejemplares: ");
        int cantidadEjemplares = scanner.nextInt();
        scanner.nextLine();

        Publicacion publicacion = null;

        switch (tipo) {
            case 1:
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Editorial: ");
                String editorial = scanner.nextLine();
                publicacion = new Libro(id, titulo, materia, cantidadEjemplares, autor, editorial);
                break;
            case 2:
                System.out.print("Año: ");
                int ano = scanner.nextInt();
                System.out.print("Número: ");
                int numero = scanner.nextInt();
                publicacion = new Revista(id, titulo, materia, cantidadEjemplares, ano, numero);
                break;
            case 3:
                System.out.print("Árbitro: ");
                String arbitro = scanner.nextLine();
                publicacion = new Articulo(id, titulo, materia, cantidadEjemplares, arbitro);
                break;
        }

        if (publicacion != null) {
            biblioteca.agregarPublicacion(publicacion);
            System.out.println("Publicación agregada exitosamente.");
        } else {
            System.out.println("Error al agregar publicación.");
        }
    }
/**
     * Permite al usuario buscar una publicación por su ID.
     */
    private static void buscarPublicacionPorID() {
        // Implementación detallada de cómo buscar una publicación por ID
        System.out.print("Ingrese el ID de la publicación: ");
        String id = scanner.nextLine();
        Publicacion publicacion = biblioteca.buscarPublicacionPorId(id);
        if (publicacion != null) {
            System.out.println(publicacion);
        } else {
            System.out.println("Publicación no encontrada.");
        }
    }

/**
     * Permite al usuario prestar una publicación.
     */
    private static void prestarPublicacion() {
        // Implementación detallada de cómo prestar una publicación
        System.out.print("Ingrese su número de identidad: ");
        String idUsuario = scanner.nextLine();

        Usuario usuario = usuarios.get(idUsuario);
        if (usuario == null) {
            System.out.println("Usuario no registrado.");
            return;
        }

        System.out.print("Ingrese el ID de la publicación que desea prestar: ");
        String idPublicacion = scanner.nextLine();
        Publicacion publicacion = biblioteca.buscarPublicacionPorId(idPublicacion);
        if (publicacion != null) {
            publicacion.prestar();
            usuario.tomarPrestado();
            System.out.println("Publicación prestada con éxito.");
        } else {
            System.out.println("Publicación no disponible o no encontrada.");
        }
    }
/**
     * Permite al usuario devolver una publicación prestada.
     */
    private static void devolverPublicacion() {
        // Implementación detallada de cómo devolver una publicación
        System.out.print("Ingrese su número de identidad: ");
        String idUsuario = scanner.nextLine();

        Usuario usuario = usuarios.get(idUsuario);
        if (usuario == null) {
            System.out.println("Usuario no registrado.");
            return;
        }

        System.out.print("Ingrese el ID de la publicación que desea devolver: ");
        String idPublicacion = scanner.nextLine();
        Publicacion publicacion = biblioteca.buscarPublicacionPorId(idPublicacion);
        if (publicacion != null) {
            publicacion.devolver();
            usuario.devolverPrestado();
            System.out.println("Publicación devuelta con éxito.");
        } else {
            System.out.println("Error al devolver la publicación.");
        }
    }

/**
     * Permite al usuario registrar un nuevo usuario en la biblioteca.
     */
    private static void registrarUsuario() {
        // Implementación detallada de cómo registrar un usuario
        System.out.print("Número de identidad: ");
        String numeroIdentidad = scanner.nextLine();

        if (usuarios.containsKey(numeroIdentidad)) {
            System.out.println("El usuario con este número de identidad ya está registrado.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        Usuario usuario = new Usuario(numeroIdentidad, nombre, direccion);
        usuarios.put(numeroIdentidad, usuario);
        System.out.println("Usuario registrado con éxito.");
    }

/**
     * Muestra la lista de usuarios registrados en la biblioteca.
     */
    private static void mostrarUsuarios() {
        // Implementación detallada de cómo mostrar la lista de usuarios
        for (Usuario usuario : usuarios.values()) {
            System.out.println("Identidad: " + usuario.getNumeroIdentidad() + ", Nombre: " + usuario.getNombre() + ", Dirección: " + usuario.getDireccion());
        }
    }
}
