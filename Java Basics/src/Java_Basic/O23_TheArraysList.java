package Java_Basic;
import java.util.ArrayList;

public class O23_TheArraysList {

     static void main()
    {
        //Standard Java arrays are of a fixed length. After arrays are created
        //they can not grow or shrink, which means you must know it in advance
        //how many elements an array can hold

        //Arrays list ae created with initial size, when this size is exceeded
        //the collection is automatically enlarged. When objects are removed
        //the array may be shrunk

        ArrayList<String>names = new ArrayList<>();
        names.add("James");//0
        names.add("Peter");//1
        names.add("John");//2

        names.add("jake");//4
        names.add(3, "Paul");//3
        names.add(1,"Peters");//1
        names.remove(0);

        for (int i = 0; i < names.size(); i++ )
        {
            System.out.println(names.get(i));
        }
    }
}
