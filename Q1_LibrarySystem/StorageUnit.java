abstract class StorageUnit {
    int id;
    double capacity;
    // Constructor
    StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    abstract void displayInfo();
}
