package Java_Basic;

public class O14_valueReturningMethod2 {

    public static void main(String[] args) {

        String fullName = fullName("John", "Rambo");
        System.out.println(fullName);
    }

    /**
     * This is a Value Returning Method working with strings
     * @param name
     * @param surName
     * @return
     */
    public static String fullName(String name , String surName)
    {
        return name + " " + surName;
    }

}
