package ClasesAndObjects;

public class DriverClass {

   public static void main() {
        House house = new House(10,2,"Tiles","Brick");
        house.setNrOfDoors(3);
        house.setTypeOfWall("Plaster");

       System.out.println("This is a House and it has: ");
       System.out.println("Number of windows: " + house.getNrofWindows());
       System.out.println("Number of doors: " + house.getNrOfDoors());
       System.out.println("The type of roof is: " + house.getTypeOfRoof());
       System.out.println("The type of wall is: " + house.getTypeOfWall());

    }
}
