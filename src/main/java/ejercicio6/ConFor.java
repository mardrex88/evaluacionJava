package ejercicio6;

import ejercicio5.Numero;

public class ConFor extends Numero {

    public static void main(String[] args) {
        Numero app = new Numero();
        String mensaje;
     /*  while (x < 101){
            if(app.isPar(x)){
                System.out.println(String.valueOf(x).concat(" Es Par"));
            } else {
                System.out.println(String.valueOf(x).concat(" Es Impar"));
            }
            x++;
        }*/
        for(int i=1; i<=100; i++){
            if(app.isPar(i)){
                System.out.println(String.valueOf(i).concat(" Es Par"));
            } else {
                System.out.println(String.valueOf(i).concat(" Es Impar"));
            }
        }
    }
}
