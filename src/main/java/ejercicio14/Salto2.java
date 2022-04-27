package ejercicio14;

import java.util.Scanner;

public class Salto2 {

    public static void main(String[] args) {

        int numero;
        System.out.println("ingrese un numero menos a 1000");
        numero = Integer.parseInt( new Scanner(System.in).nextLine()) ;

        while (numero<=1000){
            System.out.println(numero);
            numero += 2;
        }
    }
}
