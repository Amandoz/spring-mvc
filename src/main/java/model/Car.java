package model;

public class Car {
    private String name;
    private int mileage;
    private double price;

    public Car(String name, int mileage, double price) {
        this.name = name;
        this.mileage = mileage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car " +
                "name = " + name +
                "\nmileage ="  + mileage +
                "\nprice = " + price + "\n";
    }
}
