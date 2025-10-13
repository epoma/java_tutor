package Java_Basic;

import javax.swing.*;

public class O9_CompareStrings {
    public static void main(String[] args) {

        String name1 = JOptionPane.showInputDialog("Enter a name 1: ");
        String name2 = JOptionPane.showInputDialog("Enter a name 2: ");
        /*
        if (name1 == name2){
            System.out.println("Both names are equal");
        }else {
            System.out.println("They are not the same");
        }
        */
        //Proper method equals()
        /*if (name1.equals(name2)){
            System.out.println("Names are equal");
        }else {
            System.out.println("Names are not equal");
        }*/

        //Proper method compareTo()
        if (name1.compareTo(name2)== 0){
            System.out.println("name 1 is equal to name 2");
        }
        if (name1.compareTo(name2)<0){
            System.out.println("name 1 is first and name 2 is second");
        }
        if (name1.compareTo(name2)>0){
            System.out.println("name 2 is first and name 1 is second");
        }



        System.exit(0);
    }
}
