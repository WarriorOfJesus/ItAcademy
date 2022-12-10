package itacademy.bread;

public class FrenchBaguette extends Bread {
    double length;
    int countOfScarring;

    public FrenchBaguette(double weight, double price, String produceCompany, double length, int countOfScarring) {
        super(weight, price, produceCompany);
        this.length = length;
        this.countOfScarring = countOfScarring;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCountOfScarring() {
        return countOfScarring;
    }

    public void setCountOfScarring(int countOfScarring) {
        this.countOfScarring = countOfScarring;
    }

    public void scarring(){
        super.bake();
        System.out.println("count of Scarring: " + countOfScarring);
        super.pack();
        System.out.println("Only in an eco-friendly package");
        System.out.println("Provencal baguette!!!");
    }


    @Override
    public String toString() {
        return super.toString() + ", length: " + length + ", count Of Scarring: " + countOfScarring;
    }
}
