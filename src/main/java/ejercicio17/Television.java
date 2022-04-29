package ejercicio17;

public class Television extends Electrodomestico{
    double resolucion = 20;
    boolean sintonizadorTdt = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }


    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    @Override
    public double precioFinal() {
        double incrementoResolucion = 0;
        double incrementoTdt = 0;
        if(this.resolucion> 40) incrementoResolucion = super.precioFinal()*0.3;
        if(this.sintonizadorTdt) incrementoTdt = 50;
        return super.precioFinal()+incrementoResolucion+incrementoTdt;
    }
}
