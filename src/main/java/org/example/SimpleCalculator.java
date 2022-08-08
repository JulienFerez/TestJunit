package org.example;

public class SimpleCalculator {

    public int add(int numberOne, int numberTwo){
        int somme = numberOne + numberTwo ;
        System.out.println(somme);
        return somme;
    }

    public int subtraction(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public int multiplication(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public int division(int numberOne, int numberTwo){
        return numberOne/numberTwo;

    }

}
