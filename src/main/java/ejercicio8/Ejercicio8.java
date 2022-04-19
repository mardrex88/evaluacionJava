package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String text;

        System.out.println("Por favor ingrese un dia de la semana");
        text = leer.nextLine();

        switch (text){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
            case " domingo":
                System.out.println("no es un dia laboral");
        }

    }
}
