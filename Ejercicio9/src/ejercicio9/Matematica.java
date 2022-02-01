package ejercicio9;

public class Matematica {

    //attributes
    private double number1;
    private double number2;

    //constructors
    public Matematica() {
    }

    public Matematica(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //getters
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    //setters
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    //methods
    
    //este metodo devolvera cual de los 2 numeros es mas grande
    public void devolverMayor() {
        if (number1 > number2) {
            System.out.printf("El numero1 %.2f es mayor a el numero2 %.2f \n ", number1, number2);
        } else if (number1 == number2) {
            System.out.printf("El numero1 %.2f es igual a numero2 %.2f \n ", number2, number1);
        } else {
            System.out.printf("El numero2 %.2f es mayor a el numero1 %.2f \n ", number2, number1);
        }

    }

    //este metodo devuelve la potencia de ambos numeros dependiendo del mayor que resulte
    public void calcularPotencia(){
       
        if(number1 > number2){
            System.out.printf("La potencia de numero1:%.0f elevado a el numero2:%.0f, es: %d \n",number1, number2,(int)Math.pow((int)number1, (int)number2));
        }else{
            System.out.printf("La potencia de numero2:%.0f elevado a el numero1:%.0f, es: %d \n",number2, number1,(int)Math.pow((int)number2, (int)number1));
        }
    }
    
    public void calculaRaiz(){
        double valorAb1 = Math.sqrt(Math.abs(number1));
        double valorAb2 = Math.sqrt(Math.abs(number2));
        if(number1 < number2){
            System.out.printf("La raiz de %.2f numero1 es: %.2f \n", number1, valorAb1);
        }else{
            System.out.printf("La raiz de %.2f numero2 es: %.2f \n", number2, valorAb2);
        }
    }
}
