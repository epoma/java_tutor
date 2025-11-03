package ClasesAndObjects;

// The House class represents a simple model of a house with basic attributes
public class House {
    // --- Properties (Attributes) ---
    private int nrofWindows;   // Number of windows in the house
    private int nrOfDoors;     // Number of doors in the house
    private String typeOfRoof; // Type or material of the roof (e.g., "tile", "metal")
    private String typeOfWall; // Type or material of the wall (e.g., "brick", "wood")

    // --- Default Constructor ---
    // Initializes a House object with default values
    public House() {
        nrOfDoors = 0;
        nrofWindows = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }

    // --- Parameterized Constructor ---
    // Allows creating a House with specific values for each property
    public House(int nrofWindows, int nrOfDoors, String typeOfRoof, String typeOfWall) {
        this.nrofWindows = nrofWindows;
        this.nrOfDoors = nrOfDoors;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWall = typeOfWall;
    }

    // --- Getters ---
    // Methods that return the values of private attributes

    public int getNrofWindows() {
        return nrofWindows;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    // --- Setters ---
    // Methods that allow modifying the private attributes

    public void setNrofWindows(int nrofWindows) {
        this.nrofWindows = nrofWindows;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
}
