package ejercicio11;

import java.util.*;

public class Ejercicio11 {
    private Map<String,Integer> countVocals;

    public void llenarMap(){
        countVocals = new HashMap<>();
        countVocals.put("a",0);
        countVocals.put("e",0);
        countVocals.put("i",0);
        countVocals.put("o",0);
        countVocals.put("u",0);
    }

    public void contarCaracteres(String texto){
        System.out.println(texto.length());
    }


    public static int contarCaracter(String text, String vocal){
        int posicion, contador = 0;
            posicion = text.indexOf(vocal);
        while (posicion != -1) {
            contador++;
            posicion = text.indexOf(vocal, posicion + 1);
        }
        System.out.println(vocal.concat(" => ").concat(String.valueOf(contador)));
     return contador;
    }

    public static void main(String[] args) {
        Scanner readText = new Scanner(System.in);
        String text;
        Ejercicio11 app = new Ejercicio11();

        System.out.println("Por favor ingrese un texto");

        text = readText.nextLine();
        app.contarCaracteres(text);
        app.llenarMap();
        app.countVocals.forEach((k,v) -> v = app.contarCaracter(text,k));
    }
}
