package ejercicio9;


public class Ejercicio9 {

    
    public static void main(String[] args) {
     
        
        //creamos una instancia de la clase Matematica
        Matematica matematica = new Matematica();
        
        
        //generaremos ambos numeros con el metodo random
        matematica.setNumber1(Math.floor(Math.random() * (10- 1 + 1) + 1));
        matematica.setNumber2(Math.floor(Math.random() * (10- 1 + 1) + 1));
        
        
        //invocamos para saber cual es mayor
        matematica.devolverMayor();
        
        //invocamos para saber cual es la potencia
        matematica.calcularPotencia();
        
        //para calcular la raiz cuadrado invocamos al metodo
        matematica.calculaRaiz();
    }

}
