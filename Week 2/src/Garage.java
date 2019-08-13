import java.util.ArrayList;

public class Garage {

    String owner;
    static ArrayList<Vehicle> garage;
    String location;
    String doorColour;

    public Garage(String owner, ArrayList<Vehicle> vehicles, String location, String doorColour){
        this.owner = owner;
        this.garage = vehicles;
        this.location = location;
        this.doorColour = doorColour;
    }
    public static void main(String [] args){
        garage = new ArrayList<>();
        Car myCar = new Car(1500, "red", "car", "Mclaren", "Raj");
        Motocycle myCyle = new Motocycle(1000, "blue", "motorcycle", "ducati", "Raj");
        garage.add(myCar);
        garage.add(myCyle);
        Garage myGarage = new Garage("Raj", garage, "Glasgow", "Red" );

    }

    public String getOwner() {
        return owner;
    }

    public static ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public String getLocation() {
        return location;
    }

    public String getDoorColour() {
        return doorColour;
    }



    }

