package Java_Basic;

public class O11_Loops {
    public static void main(String[] args) {

        int x = 0; // loop control variable
        //the while loop
        while (x < 2) //called pre test loop
        {
            System.out.println("while print");
            x++;
        }
        System.out.println("");

        //the do-while loop
        int y = 0;
        do {
            System.out.println("do while print");
            y++;
        } while (y < 2);//called post-test loop
        System.out.println("");

        //the do-for loop
        for (int i = 1; i < 5; i++)//called pre test loop
        {
            System.out.println("I love you " + i + " times");
        }



    }
}
