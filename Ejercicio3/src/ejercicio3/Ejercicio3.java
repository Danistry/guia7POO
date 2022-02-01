
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        //creamos una instancia
        Operacion operacion = new Operacion();

        //crear la operacion
        operacion.crearOperacion();

        //suma
        System.out.printf("El resultado de la suma es: %.2f \n", operacion.suma());

        //resta
        System.out.printf("El resultado de la resta es: %.2f \n", operacion.resta());

        //multiplicacion
        if (operacion.multiplicacion() == 0) {
            System.out.print("ERROR, se intento multiplicar por 0");
        } else {
            System.out.printf("El resultado de la multiplicacion es: %.2f \n", operacion.multiplicacion());

        }

        //division
        if (operacion.division() == 0) {
            System.out.println("Error, se intento multiplicar por 0");
        } else {
            System.out.printf("El resultado de la division es: %.2f \n", operacion.division());
        }
    }
}
