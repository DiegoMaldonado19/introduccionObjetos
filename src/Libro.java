package src;
/**
 * Clase libro que se encuentra en el paquete src
 */
public class Libro {
    /**
     * Variables privadas para almacenar los atributos de un libro
     * Su nombre, su anio de publicacion, su autor y si su estado en libreria
     */
    private String nombre;
    private int anioPublicacion;
    private String autor;
    private boolean prestado;

    /**
     * Constructor libro, que pide el nombre del libro, el anio de publicacion, el autor y si esta prestado
     * @param nombre
     * @param anioPublicacion
     * @param autor
     * @param prestado
     */
    public Libro(String nombre, int anioPublicacion, String autor, boolean prestado){
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.prestado = prestado;
    }

    /**
     * Getters y setters para aplicar encapsulamiento en programa
     */
    public String getNombre(){
        return nombre;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public String getAutor(){
        return autor;
    }

    public boolean isPrestado(){
        return prestado;
    }

    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }

    /**
     * Metodo para prestar libro, que recibe la opcion ingresada por el usuario
     * @param opcion
     */
    public void prestamo(int opcion){
        if(opcion==1){
            this.prestado = true;
        }
        else if(opcion==2){
            this.prestado = false;
        }
        else{
            System.out.println("Ingrese una opcion correcta");
        }
    }

    /**
     * Metodo para devolver un libro 
     */
    public void devolver(){
        this.prestado = false;
    }

    /**
     * Metodo para mostrar la informacion del libro en consola
     */
    public void mostrarInformacion(){
        System.out.println("\n");
        System.out.println("Informacion del libro");
        System.out.println("El nombre del libro es: "+this.nombre);
        System.out.println("El anio de publicacion es: "+this.anioPublicacion);
        System.out.println("El autor es: "+this.autor);
        if(this.prestado==false){
            System.out.println("EL libro está disponible");
        }
        else if(this.prestado==true){
            System.out.println("El libro está prestado");
        }
    }
}
