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
        System.out.println("\n");
        mostrarRectangulo();
        System.out.println("\n");
        mostrarLibro();
    }

    Scanner scanner = new Scanner(System.in);

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
        Cuadrado cuadrado = new Cuadrado(20);
        Cuadrado cuadradoAuxiliar = cuadrado;
        System.out.println("El valor original del lado es: "+cuadrado.getLado());
        cuadradoAuxiliar.setLado(10);
        System.out.println("El valor nuevo del lado es: "+cuadrado.getLado());
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

    public void mostrarRectangulo(){
        Rectangulo rectangulo = new Rectangulo(20,5);
        Rectangulo rectanguloAuxiliar = rectangulo;
        System.out.println("Los valores originales son, base: "+rectangulo.getBase()+" y altura: "+rectangulo.getAltura());
        rectanguloAuxiliar.setAltura(80);
        rectanguloAuxiliar.setBase(15);
        System.out.println("Los valores nuevos son, base: "+rectangulo.getBase()+" y "+rectangulo.getAltura());
        rectanguloAuxiliar.calcularArea();
        rectanguloAuxiliar.calcularPerimetro();
        System.out.println("El area del rectangulo es: "+rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: "+rectangulo.getPerimetro());
    }

    public void mostrarLibro(){
        int opcion=0, opcion1=0;
        Libro libro = new Libro("Reyes de las Olas", 2005, "Diego Maldonado", false);
        Libro libroAuxiliar = libro;
        libro.mostrarInformacion();
        System.out.println("\n");
        System.out.println("¿Deseas prestar el libro?");
        System.out.println("1) Si");
        System.out.println("2) No");
        opcion = scanner.nextInt();
        libroAuxiliar.prestamo(opcion);
        System.out.println("¿Deseas devolver el libro?");
        System.out.println("1) Si");
        System.out.println("2) No");
        opcion1 = scanner.nextInt();
        if(opcion1==1){
            libroAuxiliar.devolver();
            libro.mostrarInformacion();
        }
        else{
            libro.mostrarInformacion();
        }
    }
}
