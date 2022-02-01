
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        //creanmos una instancia de la clase cadena 
        Cadena chain = new Cadena();
        
        System.out.print("Ingrese una frase: ");
        chain.setSentence(keyboard.next());
        chain.setLongitude(chain.getSentence().length());
        
        
        //llamamos al metodo que enseña las vocales
        chain.showVowels();
        
        //llamamos al metodo que invierte las palabras
        chain.invertedPhrase();
        
        //con esto contamos la cantidad de veces que se repite x letra
        System.out.print("Ingrese una letra a buscar en la frase ingresada: ");
        String letter = keyboard.next();
        chain.repeatedLetter(letter);
        
        //este metodo compara ambas frases si son iguales o no
        System.out.print("Ingrese una frase nuevamente: ");
        String phrase = keyboard.next();
        chain.compareLongitude(phrase);
        
        //este metodo unira ambas frases
        System.out.print("Ingrese una frase a unir: ");
        String joinPhrase = keyboard.next();
        chain.joinSentences(joinPhrase);
        
        //este metodo reemplazara una letra ingresada por el usuario, reemplazando las letras "a"
        System.out.print("Ingrese una letra que reemplazara: ");
        String letterReplaced = keyboard.next();
        chain.replacedCharacter(letterReplaced);
        
        //este metodo buscara en la frase si contiene una letra ingresa o no
        System.out.print("Ingrese una letra a corroborar: ");
        String letterExist = keyboard.next();
        System.out.println(chain.contain(letterExist));
    }

}
