package Java_Basic;

public class O14_valueReturningMethod1 {

    public static void main(String[] args) {

        double average = getAverage(30,30);
        System.out.println("The average is: "+ average);
    }

    /**
     * This is Value Returning Method working with numbers
     * @param val1
     * @param val2
     * @return
     */
    public  static double getAverage(int val1, int val2)
    {
        return (val1 + val2) / 2.0;
    }


}
