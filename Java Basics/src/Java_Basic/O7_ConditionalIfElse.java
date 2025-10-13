package Java_Basic;

import javax.swing.*;

public class O7_ConditionalIfElse {
    public static void main(String[] args) {

        int number;
        String input;
        input = JOptionPane.showInputDialog("Enter number:");
        number = Integer.parseInt(input);
        /*
        if (number == 5)
        {
            JOptionPane.showMessageDialog(null,"number is iqual to 5:");
        }
        else if( number > 10)
        {
            JOptionPane.showMessageDialog(null,"number is greater than 5:");
        }
        else if(number > 5)
        {
            JOptionPane.showMessageDialog(null,"number is less than 10:");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"number is less than 5.");
        }
        */

        //Write a number from 1 to 100
        if(number < 50 && number >= 45) //failed
        {
            JOptionPane.showMessageDialog(null,"Re-assestment");
        }
        else if(number < 45)
        {
            JOptionPane.showMessageDialog(null,"Failed");
        }
        else
        {
            if (number >= 75)
            {
                JOptionPane.showMessageDialog(null,"you have a distintion");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"you passed");
            }
        }


        System.exit(0);
    }
}
