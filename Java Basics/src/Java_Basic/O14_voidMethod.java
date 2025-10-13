package Java_Basic;

public class O14_voidMethod {

    public static void main(String[] args) {

        printAverage(150,200);

    }

    /**
     * This is Void Method
     * @param val1
     * @param val2
     */
    public static void printAverage(int val1, int val2) {
            double average = (val1 + val2) / 2.0;
            System.out.println("The Average is: " + average);
        }


}
