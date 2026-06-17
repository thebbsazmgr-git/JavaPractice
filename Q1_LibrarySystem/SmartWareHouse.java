public class SmartWareHouse {
    static void main(String[] args) {
        ColdBox bb = new ColdBox(1,500,5);
        bb.displayInfo();
        bb.adjustTemp(2);
        bb.displayInfo();
    }
}
