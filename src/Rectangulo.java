package src;
/**
 * Clase Rectangulo que se ubica dentro del paquete src
 */
public class Rectangulo {
    /**
     * Variables enteras para almacenar la base, la altura, el perimetro y el area
     */
    private int base;
    private int altura;
    private int area;
    private int perimetro;

    /**
     * Constructor que pide como parametros los valores enteros de base y altura
     * @param base
     * @param altura
     */
    public Rectangulo(int base, int altura){
        if(base==altura){
            System.out.println("Los valores de base y altura, no pueden ser iguales");
        }
        else if(base!=altura){
            this.base = base;
            this.altura = altura;
        }
    }

    /**
     * Metodos getter y setter para poder aplicar correctamente el encapsulamiento
     * @param base
     */
    public void setBase(int base){
        this.base = base;
    }

    public int getBase(){
        return base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getAltura(){
        return altura;
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
    public void calcularArea(){
        this.area = this.base*this.altura;
    }

    public void calcularPerimetro(){
        this.perimetro = (this.base*2)+(this.altura*2);
    }

}
