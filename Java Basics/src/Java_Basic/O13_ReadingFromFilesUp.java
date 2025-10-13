package Java_Basic;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class O13_ReadingFromFilesUp {
    public static void main(String[] args) throws IOException
    {
        File file = new File("OutputFile.txt");
        if (file.exists()){

            Scanner inputFile = new Scanner(file);
                while(inputFile.hasNext()){
                    System.out.println(inputFile.nextLine());
                }

            inputFile.close();
        }
        else{
            JOptionPane.showMessageDialog(null, "Te file does´nt exist");
        }



    }




}
