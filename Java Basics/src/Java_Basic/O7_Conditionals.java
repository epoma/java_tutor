package Java_Basic;

import javax.swing.*;

public class O7_Conditionals {
    public static void main(String[] args) {

        int number;
        String input;
        input = JOptionPane.showInputDialog("Enter number:");
        number = Integer.parseInt(input);

        if (number == 5) {
            JOptionPane.showMessageDialog(null,"number is equal:");
        }
        if (number < 5){
            JOptionPane.showMessageDialog(null,"number is less than 5");
        }
        if (number > 5){
            JOptionPane.showMessageDialog(null,"number is greater than 5");
        }
        if (number > 10){
            JOptionPane.showMessageDialog(null,"number is greater than 10");
        }

        System.exit(0);

    }
}
