
abstract class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public abstract double calculatePay();
    public String getName() {
        return name;
    }
}
