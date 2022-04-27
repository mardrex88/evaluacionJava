package ejercicio12;

import java.util.Scanner;

public class Diferencia  {

    private static void getDiferences( String s1,  String s2) {
        String dif = "";
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        for (int i = 0; i < char2.length ; i++) {
            boolean aux = false;
            for (int j = 0; j < char1.length ; j++) {
                if (char1[j]  ==  char2[i]){
                    aux = true;
                }
            }
            if(!aux){
                dif =  dif.concat(String.valueOf(char2[i]));
            }
        }
        System.out.println(dif);
    }

        private static boolean  mayorA(String a, String b){
            if(a.length()>b.length()){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        String s1 = read.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String s12 = read.nextLine();
        if(s1.length()<=s12.length()){
            getDiferences(s1,s12);
        }else{
            getDiferences(s12,s1);
        }
    }
}
