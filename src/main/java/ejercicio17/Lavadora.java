package ejercicio17;

public class Lavadora extends Electrodomestico {


    final double cargaDefault = 35;
    double carga = cargaDefault;
    public Lavadora() {
        this.carga = cargaDefault;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        if(this.carga> 30){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}