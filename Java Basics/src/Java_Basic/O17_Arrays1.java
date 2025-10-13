package Java_Basic;

public class O17_Arrays1 {
    public static void main(String[] args) {
        //declaring an array method 1
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        //print array method 1
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }


    }
}
