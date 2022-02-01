/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {
    //atributos

    private double numero1;
    private double numero2;

    //constructor
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    //setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //metodo para crear una operacion
    public void crearOperacion() {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.print("Ingrese un numero: ");
        numero1 = keyboard.nextInt();

        System.out.print("Ingrese otro numero: ");
        numero2 = keyboard.nextInt();

    }

    //metodos operaciones
    //suma
    public double suma() {
        return numero1 + numero2;
    }

    //resta
    public double resta() {
        return numero1 - numero2;
    }

    //multiplicacion
    public double multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    //division
    public double division() {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

}
