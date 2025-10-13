package Java_Basic;

public class O6_DecisionStructures {
    public static void main(String[] args) {
        //variables
        int x = 5;
        int y = 6;
        int p = 7;
        // simple expresions
        boolean  expresion1 = x == y;//false
        System.out.println("Expresion 1: " + expresion1);

        boolean  expresion2 = x < y;//true
        System.out.println("Expresion 2: " + expresion2);

        boolean  expresion3 = x > p;//false
        System.out.println("Expresion 3: " + expresion3);

        // for a operator && || not
        boolean expresion4 = x > y && y < p;//false
        System.out.println("Expresion 4: " + expresion4);

        boolean expresion5 = x > y || y < p; //false
        System.out.println("Expresion 5: " + expresion5);

        boolean expresion6 = !(x < y);//false
        System.out.println("Expresion 6: " + expresion6);


    }
}
