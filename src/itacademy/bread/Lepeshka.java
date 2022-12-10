package itacademy.bread;

public class Lepeshka extends Bread {
    double radius;

    public Lepeshka(double weight, double price, String produceCompany, double radius) {
        super(weight, price, produceCompany);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void patterns() {
        super.bake();
        System.out.println("flatbread with kyrgyz pattern");
    }

    public void varnishing() {
        super.pack();
        System.out.println("and also applied varnishing");
    }


    @Override
    public String toString() {
        return super.toString() + ", radius: " +
                radius;
    }
}
