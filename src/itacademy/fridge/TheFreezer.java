package itacademy.fridge;

public class TheFreezer {
    double length;
    double width;
    int quantityShelves;

    public TheFreezer(double length, double width, int quantityShelves) {
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
        String result =  "\nlength the freezer : "+ length + "\nWidth the freezer : " + width +
                "\nQuantity Shelves in the freezer: " + quantityShelves;
        return result;
    }
}
