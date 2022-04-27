package ejercicio16;

public class Persona {

    String nombre;
    int edad;
    String sexo = "Hombre";
    String dni;
    double peso;
    double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularIMC(){
        /*alculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta
        fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número
        entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función
        devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
        la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores*/
    }

    public void esMayorDeEdad(){
        // indica si es mayor de edad, devuelve un booleano.
    }

    public void comprobarSexo(char sexo){
        //comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
    }

    @Override
    public String toString(){
      //  devuelve toda la información del objeto.
        return "";
    }

    public void generaDNI(){

    } /*genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente.
    Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil.
    No será visible al exterior.*/
}
