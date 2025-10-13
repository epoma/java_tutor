package Java_Basic;

import javax.swing.*;

public class O12_UserControlledLoop {
    public static void main(String[] args) {


        String input = JOptionPane.showInputDialog("How high should I go to square the number ?");
        int maxValue = Integer.parseInt(input);// 4 times

        System.out.println("Number   Number Squared");
        System.out.println("_______________________");

        for (int number = 1; number <= maxValue; number++)
        {
         System.out.println(number + "\t\t\t" + number*number);
        }

        System.exit(0);
    }
}
