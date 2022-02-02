package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        //creamos una instancia
        Persona persona = new Persona();

        //Crearemos un menu para mostrar las opciones
        int opciones;
        boolean edadPersona;

        //creamos a la persona
        persona.crearPersona();
        do {
            System.out.println("-------MENU-------");
            System.out.print("1-Calcular edad de la persona...");
            System.out.print("2-Ingrese edad a comparar...");
            System.out.print("3-Mostrar los datos de la persona...");
            System.out.println("4-Salir del Menu");
            opciones = keyboard.nextInt();

            switch (opciones) {
                case 1:
                    persona.calcularEdad();
                    break;
                case 2:
                    System.out.print("Ingrese una edad para comparar: ");
                    edadPersona = persona.menorQue(keyboard.nextInt());
                    if (edadPersona) {
                        System.out.println("La edad ingresada es menor que la de la persona");
                    } else {
                        System.out.println("La edad ingresada es mayor que la de la persona");
                    }
                    break;
                case 3:
                    persona.mostrarPersona();
                    break;
                case 4:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opciones != 4);
    }

}
