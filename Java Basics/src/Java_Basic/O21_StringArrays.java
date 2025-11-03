package Java_Basic;

public class O21_StringArrays {

    public static void main(String[] args) {
        String [] names = getNames();
        for(int i = 0; i < names.length; i++){
            if(names [i] != null)
            {
                //System.out.println(names[i].charAt(1));
                System.out.println(names[i]);
            }

        }
    }
    public static String [] getNames(){
        String [] names = new String[5];
        names[0] = "John";
        names[1] = "Peter";
        names[2] = "Rambo";
        names[3] = "Carlos";
        return names;
    }





}
