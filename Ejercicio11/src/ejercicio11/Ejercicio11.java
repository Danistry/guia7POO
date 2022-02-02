package ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        //Creamos una instancia de la clase Date
        Date fechaHoy = new Date();
        
        //pedimos al usuario que ingrese la fecha actual
        System.out.print("Ingrese el dia: ");
        int day = keyboard.nextInt();
        
        System.out.print("Ingrese el mes: ");
        int month = keyboard.nextInt();
        
        System.out.print("Ingrese el año: ");
        int year = keyboard.nextInt();
        
        //y guardamos todo dentro del objeto date
        Date fechaActual = new Date(year, month, day);
        
        //imprimimos la fecha ingresada
        System.out.printf("La fecha ingresada es: %d/%d/%d \n", fechaActual.getDate(), fechaActual.getMonth(), fechaActual.getYear());
        
        //imprimimos la fecha actual
        System.out.printf("La fecha de hoy es: %d/%d/%d \n", fechaHoy.getDate(), fechaHoy.getMonth() + 1, fechaHoy.getYear() + 1900);
        
        //creamos una variable para guardar la diferencia de ambos años
        int diferenciasAnios = (fechaHoy.getYear() + 1900) - (fechaActual.getYear());
        
        if (fechaActual.getMonth() + 1 <= fechaHoy.getMonth()) {
            if (fechaActual.getMonth() + 1 == fechaHoy.getMonth()) {
                if (fechaActual.getDate() > fechaHoy.getDate()) {
                    diferenciasAnios--;
                }
            }else{
                diferenciasAnios--;
            }
        } 
        System.out.printf("La cantidad de años que hay entre ambas fechas es: %d \n" , diferenciasAnios);
    }

}
