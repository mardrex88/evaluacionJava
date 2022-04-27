package ejercicio15;

import java.util.Scanner;

public class menu {


    public static void main(String[] args) {
        int option = 0;
        String msg="";
        String options ="1-NUEVO ACTOR \n"+
                "2-BUSCAR ACTOR\n"+
                "3-ELIMINAR ACTOR\n"+
                "4-MODIFICAR ACTOR\n"+
                "5-VER TODOS LOS ACTORES\n"+
                "6-VER PELICULAS DE LOS ACTORES\n"+
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+
                "8-SALIR";
        msg = "Ingrese una opcion";
        do {
            switch (option){
                case 0:
                    msg = "Bienvenido Ingrese una opcion";
                    break;
                case 1:case 2:case 3:case 4:case 5:case 6:case 7:
                    msg = "Ingrese otra opcion";
                    break;

                default:
                    msg = "No has ingresado una opcion correcta intenta de nuevo";
                    break;
            }
            System.out.println(options);
            System.out.println(msg);
            option = Integer.parseInt(new Scanner(System.in).nextLine());


        }while (option!=8);

    }
}
