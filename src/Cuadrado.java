package src;
/**
 * Clase cuadrado que se encuentra dentro del paquete src
 */
public class Cuadrado {
    /**
     * Variables enteras para almacenar el lado, el perimetro y el area
     */
    private int lado;
    private int area;
    private int perimetro;

    /**
     * Constructor que pide como parametros los valores enteros de lado
     * @param lado
     */
    public Cuadrado(int lado){
        this.lado = lado;
    }

    /**
     * Metodos getter y setter para poder aplicar correctamente el encapsulamiento
     * @param base
     */
    public void setLado(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }

    public int getArea(){
        return area;
    }

    public int getPerimetro(){
        return perimetro;
    }

    /**
     * Metodos para calcular el area y el perimetro del cuadrado
     */
    public void area(){
        this.area = this.lado*this.lado;
    }

    public void perimetro(){
        this.perimetro = 4*this.lado;
    }

}
