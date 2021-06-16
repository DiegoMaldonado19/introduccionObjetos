package src;
/**
 * Clase contador que se encuentra dentro de paquete src
 */
public class Contador {
    /**
     * Variable entera para guardar un numero para utilizarlo como contador
     */
    private int contador = 0;


    /**
     * Constructor con parametros para asignar un valor de inicio a nuestro contador
     * @param numeroInicio
     */
    public Contador(int numeroInicio){
        this.contador = numeroInicio;
    }

    /**
     * Constructor vacio, para asignar una constante a nuestro contador
     */
    public Contador(){
        this.contador = 19;
    }

    /**
     * Constructor copia, para asignar los valores de otro objeto del tipo contador a nuestro contador
     * @param contador
     */
    public Contador(Contador contador){
        this.contador = contador.getContador();
    }

    /**
     * Metodos getter y setter para poder aplicar encapsulamiento a nuestras variables privadas
     */
    public void setContador(int numeroInicio){
        this.contador = numeroInicio;
    }

    public int getContador(){
        return contador;
    }

    /**
     * Metodos para generar un decremento o incremento al valor de nuestro contador
     */
    public void decrementoContador(){
        contador--;
    }

    public void incrementoContador(){
        contador++;
    }
}
