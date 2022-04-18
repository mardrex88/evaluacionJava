package ejercicio4;

import java.util.Scanner;

public class Impuesto {

    public double precioFinal (double price, double iva){
        return price + (price*iva);
    }

    public static void main(String[] args) {
        final double IVA = 0.21;
        double price = 0;


        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precion del producto");
        price = Double.parseDouble(leer.nextLine());

        Impuesto app = new Impuesto();
        System.out.println("El precio final del producto es:" +app.precioFinal(price, IVA));
    }

}
