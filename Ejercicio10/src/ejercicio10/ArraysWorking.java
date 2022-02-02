package ejercicio10;

public class ArraysWorking {

    //attributes
    private double[] arrayOne = new double[50];
    private double[] arrayTwo;

    //constructors
    public ArraysWorking(double[] arrayTwo) {
        this.arrayTwo = arrayTwo;
    }

    public ArraysWorking() {
    }

    //getters
    public double[] getArrayOne() {
        return arrayOne;
    }

    public double[] getArrayTwo() {
        return arrayTwo;
    }

    //setters
    public void setArrayOne(double[] arrayOne) {
        this.arrayOne = arrayOne;
    }

    public void setArrayTwo(double[] arrayTwo) {
        this.arrayTwo = arrayTwo;
    }

    //methods
    //este metodo llenara de numeros aleatorios el primer array
    public void llenarArrayOne() {
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;
        }
    }

    //ordena e imprime los elementos del primer array
    public void ordenarArrayOne() {
        //transformamos el array a un string para poder imprimirlo
        String arraysString = java.util.Arrays.toString(arrayOne);
        System.out.printf("Arreglo 1 con numeros aleatorios: %s \n", arraysString);

        //ordenamos dicho array
        System.out.print("Arreglo ordenado: ");
        java.util.Arrays.sort(arrayOne);
        System.out.print(java.util.Arrays.toString(arrayOne));

    }

    //este metodo copiara los primeros 20 elementos del primer array
    //y los pasara al segundo
    public void arrayTwoOrderAndFill() {
        arrayTwo = java.util.Arrays.copyOfRange(arrayOne, 0, 20);
        System.out.print("Arreglo 2 combinado: ");
        java.util.Arrays.fill(arrayTwo, 10, 20, 0.5);
        System.out.print(java.util.Arrays.toString(arrayTwo));
    }
}
