package ejercicio17;

import java.util.ArrayList;

public class StartApp {
    public static void main(String[] args) {

        double countElectrodomesticos = 0;
        double countLavadoras = 0;
        double countTelevisiones = 0;

        ArrayList<Electrodomestico> listElectrodomesticos = new ArrayList<>();
        listElectrodomesticos.add(new Electrodomestico());
        listElectrodomesticos.add(new Lavadora());
        listElectrodomesticos.add(new Television());
        listElectrodomesticos.add(new Electrodomestico(150, 7));
        listElectrodomesticos.add(new Lavadora(100, "Azul", 'A', 10, 8));
        listElectrodomesticos.add(new Television(120, 6));
        listElectrodomesticos.add(new Electrodomestico(100, "Azul", 'E', 10));
        listElectrodomesticos.add(new Lavadora(120, 6));
        listElectrodomesticos.add(new Television(100, "Azul", 'D', 10, 25, true));
        listElectrodomesticos.add(new Television(110, "Morado", 'H', 2, 50, false));

        for (int i = 0; i < listElectrodomesticos.size(); i ++) {
            countElectrodomesticos += listElectrodomesticos.get(i).precioFinal();
            System.out.println("Precio Base: ".concat(String.valueOf(listElectrodomesticos.get(i).precioBase)));
            System.out.println("Precio Final: ".concat(String.valueOf(listElectrodomesticos.get(i).precioFinal())));
            if (listElectrodomesticos.get(i) instanceof Lavadora){
                countLavadoras +=listElectrodomesticos.get(i).precioFinal();
            }else if(listElectrodomesticos.get(i) instanceof Television) {
                countTelevisiones += listElectrodomesticos.get(i).precioFinal();
            }
        }
        System.out.println("******************************************************");
        System.out.println("Total Electrodomesticos: $".concat(String.valueOf(countElectrodomesticos)));
        System.out.println("Total lavadoras: $".concat(String.valueOf(countLavadoras)));
        System.out.println("Total Televisiones: $".concat(String.valueOf(countTelevisiones)));

    }
}

