/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.*;

public class Persona {

    // attributes
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;

    // constructor
    public Persona() {
    }

    public Persona(String name, int age, String gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods
    // this method will create a new person object
    public void createPerson(int number) {
        Scanner keyboard = new Scanner(System.in, "ISO-8859-1").useDelimiter("").useLocale(Locale.US);

        System.out.printf("enter your name person %d \n: ", number);
        name = keyboard.nextLine();

        System.out.printf("enter your age person %d \n: ", number);
        age = keyboard.nextInt();

        System.out.print("what is your gender?");
        System.out.print("M-for men");
        System.out.print("W-for women");
        System.out.print("O-for others");
        gender = keyboard.nextLine().toUpperCase();
        while (!(gender.equals("W") || gender.equals("M") || gender.equals("O"))) {
            System.out.print("ERROR! you have entered a different genre try again: ");
            gender = keyboard.nextLine().toUpperCase();
        }
        this.gender = gender;

        System.out.printf("enter your weight person %d \n: ", number);
        weight = keyboard.nextDouble();

        System.out.print("enter your height: ");
        height = keyboard.nextDouble();
    }

    // this method will calculate the right weight
    public int calculateMC() {
        // this variable contains the result of dividing the weight by squared the height
        double weightHeight = this.weight / Math.pow(this.height, 2);

        if (weightHeight < 20) {
            return -1;
        } else if (weightHeight >= 20 && weightHeight <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // this method will return a Boolean value if the age is greater than 18
    public boolean isOfLegalAge() {
        return age >= 18;
    }
}
