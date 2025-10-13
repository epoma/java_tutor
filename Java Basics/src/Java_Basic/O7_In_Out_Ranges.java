package Java_Basic;

import javax.swing.*;

public class O7_In_Out_Ranges {
    public static void main(String[] args) {

        int number;
        String input;
        input = JOptionPane.showInputDialog("Enter number:");
        number = Integer.parseInt(input);

        //Write a number from 1 to 100
        if(number >= 30 && number <= 60)
        {
            JOptionPane.showMessageDialog(null,"Inside Range");
        }
            else
            {
                JOptionPane.showMessageDialog(null,"Ouside Range");
            }

            if(number < 30 || number > 60)
            {
                JOptionPane.showMessageDialog(null, "FOR || Outside Range");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"FOR || Inside Range");
            }


        System.exit(0);
    }
}

