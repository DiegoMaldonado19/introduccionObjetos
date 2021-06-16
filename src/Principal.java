package src;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
    }

    public Principal(){
        mostrarContador();
        System.out.println("\n");
        mostrarCuadrado();
        System.out.println("\n");
        mostrarCirculo();
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

    public void mostrarCuadrado(){
        Cuadrado cuadrado = new Cuadrado(20, 5);
        Cuadrado cuadradoAuxiliar = cuadrado;
        System.out.println("Los valores originales son, base: "+cuadrado.getBase()+" y altura: "+cuadrado.getAltura());
        cuadradoAuxiliar.setBase(10);
        cuadradoAuxiliar.setAltura(30);
        System.out.println("Los valores nuevos son, base: "+cuadrado.getBase()+" y altura: "+cuadrado.getAltura());
        cuadradoAuxiliar.area();
        cuadradoAuxiliar.perimetro();
        System.out.println("El area del cuadrado es: "+cuadrado.getArea());
        System.out.println("El perimetro del cuadrado es: "+cuadrado.getPerimetro());
    }

    public void mostrarCirculo(){
        Circulo circulo = new Circulo(25.6);
        Circulo circuloAuxiliar = circulo;
        System.out.println("El radio original es de: "+circulo.getRadio());
        circuloAuxiliar.setRadio(15.5);
        System.out.println("El radio nuevo es de: "+circulo.getRadio());
        circuloAuxiliar.calcularArea();
        circuloAuxiliar.calcularPerimetro();
        System.out.println("El area del circulo es: "+circulo.getArea());
        System.out.println("El perimetro del circulo es: "+circulo.getPerimetro());
    }
}
