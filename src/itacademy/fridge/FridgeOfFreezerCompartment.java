package itacademy.fridge;

public class FridgeOfFreezerCompartment {
    double length;
    double width;
    int quantityShelves;

    public FridgeOfFreezerCompartment(double length, double width, int quantityShelves) {
        super();
        this.length = length;
        this.width = width;
        this.quantityShelves = quantityShelves;
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

    public void setQuantityShelves(int quantityShelves) {
        this.quantityShelves = quantityShelves;
    }

    public int getQuantityShelves() {
        return this.quantityShelves;
    }

    @Override
    public String toString() {
        return "\nlength freezer compartment: "+ length + "\nWidth freezer compartment: " + width +
                 "\nQuantity Shelves in the freezer compartment: " + quantityShelves;
    }
}
