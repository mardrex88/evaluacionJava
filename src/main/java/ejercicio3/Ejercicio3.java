package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public double calcular(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio3 app = new Ejercicio3();

        System.out.println("Por favor ingrese el radio del circulo :");
        System.out.println("El Area del circulo es :"
                +app.calcular(Double.parseDouble(leer.nextLine())));

    }

}
