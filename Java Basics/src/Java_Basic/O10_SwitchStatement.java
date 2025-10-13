package Java_Basic;

import javax.swing.*;

public class O10_SwitchStatement {
    public static void main(String[] args) {

        int number;
        String input = JOptionPane.showInputDialog("Please enter number´s 1, 2, or 3");
        number = Integer.parseInt(input);

        switch (number)
        {
            case 1: JOptionPane.showMessageDialog(null, "You entered 1");
            break;
            case 2: JOptionPane.showMessageDialog(null,"You entered 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "You entered 3");
            break;
            default: JOptionPane.showMessageDialog(null,"You entered a diff. number");
        }

        char letter;
        input = JOptionPane.showInputDialog("please enter a letter a, b, or c");
        letter = input.charAt(0);
        switch (letter){
            case 'A':
            case 'a': JOptionPane.showMessageDialog(null,"you entered a");
            break;
            case 'B':
            case 'b': JOptionPane.showMessageDialog(null,"you entered b");
            break;
            case 'C':
            case 'c': JOptionPane.showMessageDialog(null,"you entered c");
            break;
            default: JOptionPane.showMessageDialog(null,"you entered a diff letter");

        }

        System.exit(0);
    }
}
