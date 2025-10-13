package Java_Basic;

public class O20_HighestAndLowest {

    public static void main(String[] args) {

        int [] numbers = {2,4,6,80,10,12,15,1};
        int highest = numbers[0];

        for(int i = 1; i < numbers.length; i ++)
        {
            if(numbers [i] > highest)
            {
                highest = numbers[i];
            }
        }
        System.out.println("The highest values is: " + highest);
            //For the lowest
            int lowest = numbers[0];
            for(int i = 1; i < numbers.length; i ++)
            {
                if (numbers [i] < lowest)
                {
                    lowest =numbers[i];
                }
            }
        System.out.println("The lowest value is: " + lowest);
    }


}
