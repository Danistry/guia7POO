/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
     //atributos
    private double base;
    private double height;

    //constructor
    public Rectangulo() {

    }

    public Rectangulo(double base, double heiht) {
        this.base = base;
        this.height = heiht;
    }

    //getter
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    //setter
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //metodo operacion
    public void crearOperacion() {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.print("Ingrese la base: ");
        base = keyboard.nextInt();

        System.out.print("Ingrese altura: ");
        height = keyboard.nextInt();
    }

    //Metodo superficie
    public void superficieRectangulo() {
        double surface;
        surface = base * height;
        System.out.println("la base es: " + surface);
    }

    //metodo perimetro
    public void perimetroRectangulo() {
        double perimeter;
        perimeter = ((base * height) / 2);
        System.out.println("el perimetro es: " + perimeter);
    }

    //metodo mostrarRectangulo
    public void mostrarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
