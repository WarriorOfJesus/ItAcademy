package itacademy.bread;

public class Lavash extends Lepeshka {
    double thickness;

    public Lavash(double weight, double price, String produceCompany, double radius, double thickness) {
        super(weight, price, produceCompany, radius);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void lavashIsPacked() {
        super.pack();
        System.out.println("I am lavash, I was baked");
        System.out.println("Elite lavash from Dilijan");
    }

    @Override
    public String toString() {
        return super.toString() + ", thickness: " + thickness;
    }
}
