package ejercicio16;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String name;

        Integer edad;

        String sexo;
        Double peso ;

        Double altura;

        System.out.println("Ingrese Nombre");
        name = read.nextLine();
        System.out.println("Ingrese edad");
         edad = Integer.parseInt(read.nextLine());
        System.out.println("Ingrese sexo");
         sexo  = read.nextLine();
        System.out.println("Ingrese peso");
         peso = Double.parseDouble(read.nextLine());
        System.out.println("Ingrese altura");
         altura = Double.parseDouble(read.nextLine());

        Persona persona1 = new Persona(name,edad,sexo,peso,altura);
        persona1.getPesoIdeal();
        System.out.println("Ingrese Nombre");
         name = read.nextLine();
        System.out.println("Ingrese edad");
         edad = Integer.parseInt(read.nextLine());
        System.out.println("Ingrese sexo");
         sexo  = read.nextLine();
        System.out.println("Ingrese peso");
         peso = Double.parseDouble(read.nextLine());
        System.out.println("Ingrese altura");
         altura = Double.parseDouble(read.nextLine());
        Persona persona2 = new Persona(name,edad,sexo);
        persona2.getPesoIdeal();
        Persona persona3 = new Persona();
        System.out.println("Ingrese Nombre");
         name = read.nextLine();
        System.out.println("Ingrese edad");
         edad = Integer.parseInt(read.nextLine());
        System.out.println("Ingrese sexo");
         sexo  = read.nextLine();
        System.out.println("Ingrese peso");
         peso = Double.parseDouble(read.nextLine());
        System.out.println("Ingrese altura");
         altura = Double.parseDouble(read.nextLine());
        persona3.setNombre(name);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        persona3.getPesoIdeal();




    }
}
