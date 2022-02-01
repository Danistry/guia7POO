
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;
public class Circunferencia {

    //atributos
    private long radio;

    //constructor
    public Circunferencia(long radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    //getter
    public long getRadio() {
        return radio;
    }

    //setter
    public void setRadio(long radio) {
        this.radio = radio;
    }

    //metodo para calcular la circunferencia
    public void crearCircunferencia() {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.print("Ingrese el Radio: ");
        radio = keyboard.nextInt();
    }

    //metodo area
    public void area() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area es: %.2f \n", area);
    }

    //metodo perimetro
    public void perimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.printf("El perimetro es: %.2f \n", perimetro);
    }
}
