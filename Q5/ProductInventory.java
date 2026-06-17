public class ProductInventory {
    static void main(String[] args) {
        Electronics[] inventory = {
                new Electronics("Laptop",100000),
                new Electronics("Mobile",20000),
                new Electronics("airpod",2000)
        };
        //Applying 10% discount to all product
        for(Electronics e: inventory){
            e.applyDiscount(10.0);
        }
    }

}
