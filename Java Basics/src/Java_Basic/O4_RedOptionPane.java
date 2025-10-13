package Java_Basic;

import javax.swing.*;

public class O4_RedOptionPane {
    public static void main(String[] args) {

        String name;
        String surname;
        name = JOptionPane.showInputDialog("please enter your name: ");
        surname = JOptionPane.showInputDialog("please enter surname: ");
        JOptionPane.showMessageDialog(null, name +" "+ surname);

        int firstNum;
        int secondNum;
        String input;
        input = JOptionPane.showInputDialog("enter 1st number: ");
        firstNum = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("enter 2dn number: ");
        secondNum = Integer.parseInt(input);

        double average;
        average = (firstNum+secondNum)/2.0;
        JOptionPane.showMessageDialog(null,"the average is: "+average);

    }
}
