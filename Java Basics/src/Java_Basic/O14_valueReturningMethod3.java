package Java_Basic;

public class O14_valueReturningMethod3 {

    public static void main(String[] args) {
        //range between 1 and 100
        int value = 101;

        if (isValid(value))
        {
            System.out.println("The value is in range");
        }else {
            System.out.println("The value is not in range");
        }
    }
    /**
     * This is aValue Returning Method with a Boolean
     * @param number
     * @return
     */
    public static boolean isValid(int number)
    {
        return (number >= 1 && number <= 100);
    }

}
