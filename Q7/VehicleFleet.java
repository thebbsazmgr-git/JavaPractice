import java.util.ArrayList;
public class VehicleFleet {
    static void main(String[] args) {
        // Creating ArrayList of Vehicle type
        ArrayList<Vehicle> fleet = new ArrayList<>();
        // Adding Bike and Bus objects
        fleet.add(new Bike("Mountain Bike", 4));
        fleet.add(new Bus("Tourist Bus", 2));
        fleet.add(new Bike("City Bike", 6));
        // Iterating through ArrayList
        for(Vehicle v : fleet) {
            System.out.println(
                    v.name + " Rental Fee = " + v.calculateFee()
            );
        }
    }
}
