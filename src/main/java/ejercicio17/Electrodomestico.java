package ejercicio17;

public class Electrodomestico {

    double precioBase = 100;
    String color = "Blanco";
    char consumoEnergetico ='F'; // Solo letras entre la A y la F
    double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = 'F';
        this.color ="Blanco";
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double PrecioBase() {
        return precioBase;
    }

    public String Color() {
        return color;
    }

    public char ConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double Peso() {
        return peso;
    }


    public char comprobarConsumoEnergetico(char letra){
        char[] idEnergetico = {'A','B','C','D','E'};
        for (int i = 0; i < idEnergetico.length; i++) {
            if(Character.toUpperCase(letra) == idEnergetico[i]){
                return idEnergetico[i];
            }
        }
        return 'F';
    }
    public String comprobarColor(String color){
        String[] colores = {"Blanco","Rojo","Negro","Azul","Gris"};
        for (int i = 0; i < colores.length; i++) {
            if(colores[i].toUpperCase().equals(color.toUpperCase())){
                return colores[i];
            }
        }
        return "Blanco";
    }
    public double precioFinal(){

        double preciFinal = this.precioBase + getPrecioConsumo() + getPrecioPeso();

        return preciFinal;
    }

    public double getPrecioConsumo(){
        double precio = 0 ;
        switch (this.consumoEnergetico){
            case 'A':
                precio = 100;
                break;
            case 'B':
                precio = 80;
                break;
            case 'C':
                precio = 60;
                break;
            case 'D':
                precio = 50;
                break;
            case 'E':
                precio = 30;
                break;
            default:
                precio = 10;
                break;

        }
        return precio;
    }
    public double getPrecioPeso(){
        if(0 <= this.peso && this.peso < 20 ) return 10;
        if(20 <= this.peso && this.peso < 50 ) return 50;
        if(50 <= this.peso && this.peso < 80 ) return 80;
        return 100;
    }
}
