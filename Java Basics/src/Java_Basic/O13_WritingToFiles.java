package Java_Basic;

import java.io.IOException;
import java.io.PrintWriter;

public class O13_WritingToFiles {
    public static void main(String[] args) throws IOException

    {
        //create a file & open a file
        //if file exist it will replace
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();
    }
}
