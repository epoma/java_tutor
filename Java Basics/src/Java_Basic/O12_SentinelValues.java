package Java_Basic;

import javax.swing.*;

public class O12_SentinelValues {
    public static void main(String[] args) {

        int value;
        int doubleValue;

        String input = JOptionPane.showInputDialog("Please enter a value to make it double: " + "(0 to stop)");
        value = Integer.parseInt(input);

        while (value !=0)
        {
            doubleValue = value * 2;
            JOptionPane.showMessageDialog(null,"" +value+" Double is: "+ doubleValue);

            input = JOptionPane.showInputDialog("Please enter a value to double" + "(0 to stop)");
            value = Integer.parseInt(input);

        }


    System.exit(0);
    }
}
