package src;
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        if(denominador==0){
            this.denominador =1 ;
        }
        else{
            this.denominador = denominador;
        }
    }

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

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

    private void simplificar() {
        int mcd = mcd(); //se calcula el mcd de la fracción
        numerador /= mcd;
        denominador /= mcd;
    }

    public Fraccion sumar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador + this.denominador * fraccion.numerador;
        fraccionResultado.denominador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla                                                   
        return fraccionResultado;
    }

    public Fraccion restar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador - this.denominador * fraccion.numerador;
        fraccionResultado.denominador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }
   
    //multiplicar fracciones
    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.numerador;
        fraccionResultado.numerador = this.denominador * fraccion.denominador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }

    //dividir fracciones
    public Fraccion dividir(Fraccion fraccion) {
        Fraccion fraccionResultado = new Fraccion();
        fraccionResultado.numerador = this.numerador * fraccion.denominador;
        fraccionResultado.denominador = this.denominador * fraccion.numerador;
        fraccionResultado.simplificar();  //se simplifica antes de devolverla
        return fraccionResultado;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }  
}
