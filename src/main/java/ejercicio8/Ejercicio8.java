package ejercicio8;

import ejercicio9.Ejercicio9;

import java.util.Scanner;

public class Ejercicio8 {

    public String leer(){
        System.out.println("Por favor ingrese un dia de la semana");
        String resp = new Scanner(System.in).nextLine();
       return  resp;
    }
    public static void main(String[] args) {

        Ejercicio8 app = new Ejercicio8();
        switch (app.leer()){
            case "Sabado":
            case " domingo":
                System.out.println("no es un dia laboral");
                break;
            default:
                System.out.println("Es un dia laborar");
        }

    }
}
