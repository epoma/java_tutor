package Java_Basic;

import javax.swing.*;

public class O12_InputValidation {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Please enter a number from 1 to 100");
        int number = Integer.parseInt(input);

        while (number < 1 || number > 100)
        {
            JOptionPane.showMessageDialog(null,"That number is not valid");
            input = JOptionPane.showInputDialog("Please enter a correct number from 1 to 100");
            number = Integer.parseInt(input);
        }
            JOptionPane.showMessageDialog(null,"That number is correct");

        System.exit(0);
    }
}
