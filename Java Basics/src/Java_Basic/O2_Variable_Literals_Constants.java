package Java_Basic;

public class O2_Variable_Literals_Constants {

    public static void main(String[] args) {
        //Variable Integers
        int firstNum = 11;
        int secondNum = 20;
        double average;
        average = (double)(firstNum + secondNum) / 2;
        System.out.println( "the average is: " + average);
        //Variable Strings
        String name = "Edgar";
        String surName ="Poma";
        System.out.println("Mi name is: " +name +" "+ surName);
        //Variable Booleans
        boolean value = true;
        System.out.println(value);
        //Variable Char
        char letter = 'J';
        System.out.println("The letter is: " + letter);
    }
}
