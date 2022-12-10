package itacademy.bread;

public class Bread {
    double weight;
    double price;
    String produceCompany;

    public Bread(double weight, double price, String produceCompany) {
        this.weight = weight;
        this.price = price;
        this.produceCompany = produceCompany;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduceCompany() {
        return produceCompany;
    }

    public void setWeight(String produceCompany) {
        this.produceCompany = produceCompany;
    }

    void bake() {
        System.out.println("The bread is ready!");
    }

    void pack() {
        System.out.println("The bread is packed");
    }

    @Override
    public String toString() {
        return "weight: " + weight + ", price: " + price + ", produce Company: " +
                produceCompany;
    }
}
