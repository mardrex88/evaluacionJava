package ejercicio6;

import ejercicio5.Numero;

public class ConFor extends Numero {

    public static void main(String[] args) {
        Numero app = new Numero();

        for(int i=1; i<=100; i++){
            if(app.isPar(i)){
                System.out.println(String.valueOf(i).concat(" Es Par"));
            } else {
                System.out.println(String.valueOf(i).concat(" Es Impar"));
            }
        }
    }
}
