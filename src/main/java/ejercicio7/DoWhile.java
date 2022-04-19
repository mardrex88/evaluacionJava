package ejercicio7;

import java.util.Scanner;

public class DoWhile {

    public boolean isMayor(int numero){
        if(numero > 0 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        DoWhile app = new DoWhile();

        do {
            System.out.println("Ingrese un Numero");
            numero = Integer.parseInt(leer.nextLine());
       ;
        }while(!app.isMayor(numero));
        System.out.println("El numero ingresado es mayor a Cero");
    }
}
