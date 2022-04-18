package ejercicio1;

import java.util.Scanner;

public class Mayor {

    public void esMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("el numero 1 es mayor que el numero2");
        }
    }
    public void esMenor(int numero1, int numero2) {
        if (numero1 < numero2) {
            System.out.println("El numero2 es Mayor al numer1");
        }
    }
    public void sonIguales(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.println("El numero1 es Igual al numero2");
        }
    }
    public static void main(String[] args) {
       int numero1 = 15;
       int numero2 =15;

       Mayor isMayor = new Mayor();
       isMayor.esMayor(numero1,numero2);
       isMayor.esMenor(numero1,numero2);
       isMayor.sonIguales(numero1,numero2);
    }

}