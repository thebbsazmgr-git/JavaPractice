public class ColdBox  extends StorageUnit implements Refrigirated{
    int temperature;
    // Constructor
    ColdBox(int id, double capacity, int temperature) {
        super(id, capacity);
        this.temperature = temperature;
    }
    // Implementing interface method
    public void adjustTemp(int t) {
        temperature = t;
        System.out.println("Temperature adjusted to " + temperature + "°C");
    }
    // Implementing abstract method
    void displayInfo() {
        System.out.println("Storage Unit ID: " + id);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}
