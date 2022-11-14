package itacademy.fridge;

public class FridgeBody {
    String material;
    double length;
    double width;
    double weight;

    public FridgeBody(String material, double length, double width, double weight) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "\nMaterial: " + material + "\nLength: " + length +
                "\nWidth: " + width + "\nWeight: " + weight;
    }
}
