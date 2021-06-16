package src;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
    }

    public Principal(){
        mostrarContador();
    }

    public void mostrarContador(){
        Contador contador = new Contador(1);
        Contador contadorAuxiliar = contador;
        System.out.println("Contador inicia en: "+contador.getContador());
        contadorAuxiliar.setContador(10);
        System.out.println("Valor cambiado desde contador auxiliar: "+contador.getContador());
        contador.incrementoContador();
        contador.incrementoContador();
        System.out.println("El numero del contador se incremento, ahora vale: "+contador.getContador());
        contador.decrementoContador();
        System.out.println("El numero del contador se decremento, ahora vale: "+contador.getContador());
    }
}
