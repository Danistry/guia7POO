
package ejercicio7;


public class Ejercicio7 {

    
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("").useLocale(Locale.US);

    int imc1;
    int imc2;
    int imc3;
    int imc4;
    int option;

    double quantityMajorities = 0;
    double quantityLowWeightIdealWeight = 0;
    double quantityIdealWeight = 0;

    boolean age1;
    boolean age2;
    boolean age3;
    boolean age4;

    // we create 4 objects of the person class
    Persona person = new Persona();
    Persona person2 = new Persona();
    Persona person3 = new Persona();
    Persona person4 = new Persona();

    // we invoke the method createPerson of the object person
    person.createPerson();
    person2.createPerson();
    person3.createPerson();
    person4.createPerson();

    imc1 = person.calculateMC();
    imc2 = person2.calculateMC();
    imc3 = person3.calculateMC();
    imc4 = person4.calculateMC();

    age1 = person.isOfLegalAge();
    age2 = person2.isOfLegalAge();
    age3 = person3.isOfLegalAge();
    age4 = person4.isOfLegalAge();

    do {
      System.out.println("---------MENU----------");
      System.out.println("1-See IMC of person 1 and if he is of legal age");
      System.out.println("2-See IMC of person 2 and if he is of legal age");
      System.out.println("3-See IMC of person 3 and if he is of legal age");
      System.out.println("4-See IMC of person 4 and if he is of legal age");
      System.out.println("5-Go out and see total percentages");
      option = keyboard.nextInt();

      switch (option) {
        case 1:
          if (imc1 == -1) {
            System.out.println("Person 1 is below his ideal weight");
            quantityLowWeightIdealWeight++;
          } else if (imc1 == 0) {
            System.out.println("Person 1 is at his ideal weight");
            quantityIdealWeight++;
          } else {
            System.out.println("person 1 is overweight");
          }
          if (age1) {
            System.out.println("is of legal age");
            quantityMajorities++;
          } else {
            System.out.println(" isnt of legal age");
          }
          break;
        case 2:
          if (imc2 == -1) {
            System.out.println("Person 2 is below his ideal weight");
            quantityLowWeightIdealWeight++;
          } else if (imc2 == 0) {
            System.out.println("Person 2 is at his ideal weight");
            quantityIdealWeight++;
          } else {
            System.out.println("person 2 is overweight");
          }
          if (age2) {
            System.out.println("is of legal age");
            quantityMajorities++;
          } else {
            System.out.println(" isnt of legal age");
          }
          break;
        case 3:
          if (imc3 == -1) {
            System.out.println("Person 3 is below his ideal weight");
            quantityLowWeightIdealWeight++;
          } else if (imc3 == 0) {
            System.out.println("Person 3 is at his ideal weight");
            quantityIdealWeight++;
          } else {
            System.out.println("person 3 is overweight");
          }
          if (age3) {
            System.out.println("is of legal age");
            quantityMajorities++;
          } else {
            System.out.println(" isnt of legal age");
          }
          break;
        case 4:
          if (imc4 == -1) {
            System.out.println("Person 3 is below his ideal weight");
            quantityLowWeightIdealWeight++;
          } else if (imc4 == 0) {
            System.out.println("Person 3 is at his ideal weight");
            quantityIdealWeight++;
          } else {
            System.out.println("person 3 is overweight");
          }
          if (age4) {
            System.out.println("is of legal age");
            quantityMajorities++;
          } else {
            System.out.println(" isnt of legal age");
          }
          break;
        case 5:
          break;
        default:
          System.out.println("Wrong Option");
      }

    } while (option != 5);

    System.out.printf(
        "The percentage of people with their weight below ideal is %.0f %%\n",
        (quantityIdealWeight / 4) * 100);
    System.out.printf(
        "The percentage of people with their ideal weight is %0.f %%\n",
        (quantityIdealWeight / 4) * 100);
    System.out.printf(
        "The percentage of people with their ideal weight is %.0f %%\n",
        ((4 - (quantityIdealWeight + quantityLowWeightIdealWeight)) / 4) * 100);
    System.out.printf(
        "The percentage of people of legal age is %.0f %%n", ((quantityMajorities) / 4) * 100);
    System.out.printf(
        "The percentage of people of legal age is %.0f %%n", ((4 - quantityMajorities) / 4) * 100);
  }
    }

}
