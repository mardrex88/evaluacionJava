package ejercicio10;

import ejercicio8.Ejercicio8;

import java.util.Scanner;

public class Ejercicio10  {

    public static void main(String[] args) {

        System.out.println("ingrese una frase");
        String text = String.valueOf(new Scanner(System.in).nextLine());
        String newText;
        System.out.println(text);
        newText =  text.replace(" ","");
        System.out.println(newText);
    }
}
