
package ejercicio6;

public class Cafetera {

    // atributos
    private int capacidadMaxima;
    private int cantidadActual;

    // contructores
    public Cafetera() {
        
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    // getters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    // setter
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // metodo llenar Cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("Cafetera Llena");
    }

    // metodo servir taza
    public void servirTaza(int tamanioDeLaTaza) {
        // condicionamos si la cantidad de cafe que queda es igual a 0
        if (cantidadActual == 0) {
            System.out.println("no hay cafe disponible para servir");
        } else if (cantidadActual <= tamanioDeLaTaza) {
            // la cantidad actual se guardara en la taza
            tamanioDeLaTaza = cantidadActual;
            // y en la cafetera quedata 0
            cantidadActual = 0;
            System.out.printf(
                    "La taza no se ha llenado por completo, solo se con %d \n", tamanioDeLaTaza);
        } else {
            System.out.println("La taza se lleno completamente");
            cantidadActual -= tamanioDeLaTaza;
        }
    }

    // metodo para vaciar la Cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // metodo para agregar Cafe
    public void agregarCafe(int cantidadCafe) {

        //
        if ((cantidadCafe + cantidadActual) > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println(
                    "sobro" + ((cantidadCafe + cantidadActual) - capacidadMaxima) + " de cafe");
        } else {
            System.out.println("Cafe Agregado");
            cantidadActual += cantidadCafe;
        }
    }
}
