public class DeviceManagerMain {
    static void main(String[] args) {
        // Creating array of ElectronicDevice objects
        ElectronicDevice[] devices = {
                new Printer(),
                new Scanner()
        };
        // Looping through array using polymorphism
        for (ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}
