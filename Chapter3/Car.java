package Chapter3;

public class Car {

    private String model;
    private String year;
    private double price;
    private double discount;
    private double netAmount;

    public Car(String model, String year, double price, double discount) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;
        discount = (price / 100) * discount;

        netAmount = price - discount;

    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public double getPrice() {
        if (price > 0)
            return price;
        return 0;
    }
    public double getDiscount() {
        return discount;
    }
    public double getNetAmount() {
        return netAmount;
    }
}
