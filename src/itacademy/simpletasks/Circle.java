package itacademy.simpletasks;

public class Circle {
    int radius;
    String color;
    boolean isTransparent = false;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsTransparent() {
        return this.isTransparent;
    }

    public void setIsTransparent(boolean isTransparent) {
        this.isTransparent = isTransparent;
    }

    public double getLength() {
        return 2 * 3.14 * this.radius;
    }
    public double getSquareCircle(){
        return 3.14 * this.radius * this.radius;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public Circle(int radius, String color, boolean isTransparent){
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }
}
