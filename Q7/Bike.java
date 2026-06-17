public class Bike extends Vehicle {
    int hours;
    Bike(String name, int hours) {
        super(name);
        this.hours = hours;
    }
    // Overriding method
    @Override
    public double calculateFee() {
        return hours * 5;
    }
}