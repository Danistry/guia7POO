package ejercicio8;

public class Cadena {

    //attributes
    private String sentence;
    private int longitude;

    //constructor
    public Cadena() {
    }

    public Cadena(String sentence, int longitude) {
        this.sentence = sentence;
        this.longitude = longitude;
    }

    //getters
    public String getSentence() {
        return sentence;
    }

    public int getLongitude() {
        return longitude;
    }

    //setters
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    //Methods
    //this method display the vowels
    public void showVowels() {
        int vowelsCounter = 0;
        for (int i = 0; i < longitude; i++) {
            //refactor?
            if (this.sentence.toLowerCase().charAt(i) == 'a' || this.sentence.toLowerCase().charAt(i) == 'e' || this.sentence.toLowerCase().charAt(i) == 'i' || this.sentence.toLowerCase().charAt(i) == 'o' || this.sentence.toLowerCase().charAt(i) == 'u') {
                vowelsCounter++;
            }
        }
        System.out.printf("La cantidad de vocales es: %d \n", vowelsCounter);
    }

    //this method display the reversed sentence
    public void invertedPhrase() {
        String invertedPhases = "";

        for (int i = longitude - 1; i >= 0; i--) {
            invertedPhases = invertedPhases + sentence.charAt(i);
        }
        System.out.printf("La frase invertida es: %s \n", invertedPhases);
    }

    //this method counts the times a phrase is repeated
    public void repeatedLetter(String letter) {
        int lettersCounter = 0;

        for (int i = 0; i < longitude; i++) {
            if (sentence.substring(i, i + 1).equalsIgnoreCase(letter)) {
                lettersCounter++;
            }
        }
        System.out.printf("La letra ingresada se repitio %d veces \n", lettersCounter);

    }

    //this method compares the lengths of the sentence
    public void compareLongitude(String phrase) {
        if (phrase.length() == longitude) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Error! ambas frase no tienen la misma longitud");
        }
    }

    //this method joins 2 sentences
    public void joinSentences(String joinPhrase) {
        System.out.printf("La frase unida es %s \n", this.sentence.concat(joinPhrase));
    }

    //this method replaces a letter passed by parameter
    public void replacedCharacter(String letterReplaced) {
        System.out.printf("La frase original: %s \n", this.sentence);
        System.out.printf("Frase reemplazada: %s \n", this.sentence.replace("a", letterReplaced));
    }

    //this method returns a true or false if a letter is not found in the sentence
    public Boolean contain(String letter) {
        return this.sentence.contains(letter);
    }

}
