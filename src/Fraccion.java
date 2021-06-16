package src;
public class Fraccion {
    /**
     * Variables enteras que son atributos de la clase fraccion
     */
    private int numerador;
    private int denominador;

    /**
     * Constructor de la clase que pide como parametros el numerador y denominador
     * @param numerador
     * @param denominador
     */
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        if(denominador==0){
            this.denominador =1 ;
        }
        else{
            this.denominador = denominador;
        }
    }

    /**
     * Constructor por defecto
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor con un solo parametro
     * @param numerador
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Metodos getter y setter para aplicar encapsulamiento 
     * @return
     */
    public int getNumerador(){
        return numerador;
    }

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    public void setDenominador(int denominador){
        this.denominador = denominador;
    }

    /**
     * Metodo par calcular el multiplo comun
     * @return
     */
    private int mcd() {
        int numerador = Math.abs(this.numerador); //valor absoluto del numerador
        int denominador = Math.abs(this.denominador); //valor absoluto del denominador
        if (denominador == 0) {
            return numerador;
        }
        int resto;
        while (denominador != 0) {
            resto = numerador % denominador;
            numerador = denominador;
            denominador = resto;
        }
        return numerador;
    }

    /**
     * Metodo para simplificar fracciones
     */
    private void simplificar() {
        int mcd = mcd(); //se calcula el mcd de la fracción
        numerador /= mcd;
        denominador /= mcd;
    }

    /**
     * Metodo para sumar fracciones, el cual pide como parametro un objeto de tipo fraccion
     * @param fraccion
     * @return
     */
    public Fraccion sumar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador + this.denominador * fraccion.numerador;
        fraccionResultado.denominador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla                                                   
        return fraccionResultado;
    }

    /**
     * Metodo para restar fracciones, el cual pide como parametro un objeto de tipo fraccion
     * @param fraccion
     * @return
     */
    public Fraccion restar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador - this.denominador * fraccion.numerador;
        fraccionResultado.denominador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }
   
    /**
     *  Metodo para multiplicar fracciones el cual pide como parametro un objeto de la clase fraccion
     * @param fraccion
     * @return
     */
    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.numerador;
        fraccionResultado.numerador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }

    /**
     * Metodo para dividir fracciones, el cual recibe como parametro un objeto de tipo fraccion
     * @param fraccion
     * @return
     */
    public Fraccion dividir(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador;
        fraccionResultado.denominador = this.denominador * fraccion.numerador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }

    /**
     * Metodo to string para poder escribir las fracciones en consola
     */
    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }  
}
