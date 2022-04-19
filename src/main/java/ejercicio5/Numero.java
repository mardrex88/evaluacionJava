package ejercicio5;

public class Numero {
    public Boolean isPar (int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args) {

    int x=1;
    Numero app = new Numero();

    while (x < 101){
        if(app.isPar(x)){
                System.out.println(String.valueOf(x).concat(" Es Par"));
            } else {
                System.out.println(String.valueOf(x).concat(" Es Impar"));
            }
        x++;
    }

    }

}
