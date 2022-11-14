package itacademy.fridge;

public class Vegetables {
    double weight;
    String type;

    public Vegetables(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
    @Override
    public String toString() {
        return "Type vegetable: " + type + " Amount of vegetables is " + weight + " kilogram";
    }

}
