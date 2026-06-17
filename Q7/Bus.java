public class Bus extends Vehicle{
    int days;
    Bus(String name, int days) {
        super(name);
        this.days = days;
    }
    // Overriding method
    @Override
    public double calculateFee() {
        return days * 100; // $100 per day
    }
}
