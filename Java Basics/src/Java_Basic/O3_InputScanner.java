package Java_Basic;

import java.util.Scanner;

public class O3_InputScanner {
    public static void main(String[] args) {
        //first part with integer
        int num1;
        int num2;
        double average;
        Scanner kb= new Scanner(System.in);
        System.out.println("please enter a number: ");
        num1 = kb.nextInt();
        System.out.println("please enter another number: ");
        num2 = kb.nextInt();
        average = (num1 + num2) / 2.0;
        System.out.println("the average is: " + average);

        // second part with a string now
        kb.nextLine();
        String name;
        String surName;
        System.out.println("please enter your name: ");
        name = kb.nextLine();
        System.out.println("please enter your surname: ");
        surName = kb.nextLine();
        System.out.println("Your name is: " +name +" "+ surName);
    }
}
