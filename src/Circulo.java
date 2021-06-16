package src;
/**
 * Clase circulo que se encuentra dentro del paquete src
 */
public class Circulo {
    /**
     * Variables double para poder almacenar el radio, area y perimetro
     */
    private double radio;
    private double area;
    private double perimetro;

    /**
     * Constructor, que pide como parametro el radio de nuestro circulo
     * @param radio
     */
    public Circulo(double radio){
        this.radio = radio;
    }

    /**
     * Metodos getter y setter para aplicar encapsulamiento 
     * @param radio
     */
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    /**
     * Metodos para calcular area y perimetro
     */
    public void calcularArea(){
        this.area = (Math.PI)*(this.radio*this.radio);
    }

    public void calcularPerimetro(){
        this.perimetro = (2*Math.PI)*(this.radio);
    }
}
