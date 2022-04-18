package ejercicio2;

import ejercicio1.Mayor;

import java.util.Scanner;

public class Ejercicio2 extends Mayor {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner leer = new Scanner(System.in);

        Ejercicio2 app = new Ejercicio2();

        System.out.println("Por favor ingrese un dato para el numero1");
        numero1 = leer.nextInt();
        System.out.println("Por favor ingrese un dato para el numero2");
        numero2 = leer.nextInt();

        app.esMayor(numero1,numero2);
        app.esMenor(numero1,numero2);
        app.sonIguales(numero1,numero2);

    }

}
