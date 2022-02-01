

package ejercicio5;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        //creamos una variable para guardar la opcion
        int opcionMenu;
        //creamos una instancia de la clase Cuenta
        Cuenta cuenta = new Cuenta();

        //creamos una cuenta
        cuenta.cuenta();

        do {
            System.out.println("");
            System.out.println("-----------MENU--------------");
            System.out.println("1-Ingresar dinero: ");
            System.out.println("2-Retirar dinero: ");
            System.out.println("3-Extraccion rapida: ");
            System.out.println("4-Consultar saldo: ");
            System.out.println("5-Consultar datos de la cuenta: ");
            System.out.println("6-salir: ");
            System.out.println("");
            opcionMenu = keyboard.nextInt();

            //creamos un Switch para cada opcion del menu
            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese dinero en su cuenta: ");
                    cuenta.ingresar(keyboard.nextDouble());
                    break;
                case 2:
                    System.out.print("Ingrese dinero a retirar: ");
                    cuenta.retirar(keyboard.nextDouble());
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 6:
                    System.out.println("Saliendo del Menu...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcionMenu != 6);
    }
}

