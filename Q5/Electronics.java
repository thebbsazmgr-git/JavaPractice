public class Electronics implements Discountable{
    String name;
    double price;
    //Constructor
    Electronics(String name, double price){
        this.name = name;
        this.price = price;

    }
    //Implementing applyDiscount method
    public void applyDiscount(double pct){
        double discount = price * pct / 100;
        price = price - discount;
        System.out.println(name + " after " + pct + "% discount = " + price);
    }
}
