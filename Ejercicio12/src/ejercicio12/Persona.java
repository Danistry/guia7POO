package ejercicio12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    //attributes
    private String nombre;
    private Date birthday;

    //constructor
    public Persona() {
    }

    public Persona(String name, Date birthday) {
        this.nombre = nombre;
        this.birthday = birthday;
    }

    //getters
    public String getName() {
        return nombre;
    }

    public Date getBirthday() {
        return birthday;
    }

    //setters
    public void setName(String name) {
        this.nombre = nombre;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //methods
    public void crearPersona() {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fecha = new Date();

        System.out.print("Ingrese su nombre: ");
        nombre = keyboard.next();

        System.out.print("Ingrese su dia de nacimiento: ");
        int day = keyboard.nextInt();

        System.out.print("Ingrese el mes de su nacimiento: ");
        int month = keyboard.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int year = keyboard.nextInt();

        fecha.setDate(day);
        fecha.setMonth(month);
        fecha.setYear(year);
        this.birthday = fecha;
    }

    public void calcularEdad() {
        Date fechaHoy = new Date();
        //creamos una variable para guardar la diferencia de ambos años
        int diferenciasAnios = (fechaHoy.getYear() + 1900) - (birthday.getYear());

        if (fechaHoy.getMonth() + 1 <= birthday.getMonth()) {
            if (fechaHoy.getMonth() + 1 == birthday.getMonth()) {
                if (fechaHoy.getDate() > birthday.getDate()) {
                    diferenciasAnios--;
                }
            } else {
                diferenciasAnios--;
            }
        }
        System.out.printf("%s tiene %d años \n", this.nombre, diferenciasAnios);
    }

    public boolean menorQue(int edad) {
        Date fechaActual = new Date();
        int diferenciaAnios = (fechaActual.getYear() + 1900) - birthday.getYear();
        if (fechaActual.getMonth() + 1 <= birthday.getMonth()) {
            if (fechaActual.getMonth() + 1 == birthday.getMonth()) {
                if (birthday.getDate() > fechaActual.getDate()) {
                    diferenciaAnios--;
                }
            }

        } else {
            diferenciaAnios--;
        }

        return edad < diferenciaAnios;

    }

    public void mostrarPersona() {
        System.out.printf("\n El nombre de la persona es : %s ha nacido el : %d/%d/%d \n", nombre, birthday.getYear(), birthday.getMonth(), birthday.getDate());
    }
}


