package itacademy.abstracts;

public abstract class AbstractCats extends AbstractAnimal {
    private int numberOfClaws;
    private double tailLength;
    private int numberOfMoustaches;

    public AbstractCats(double weight, int age, String color, int numberOfClaws, double tailLength, int numberOfMoustaches) {
        super(weight, age, color);
        this.numberOfClaws = numberOfClaws;
        this.tailLength = tailLength;
        this.numberOfMoustaches = numberOfMoustaches;
    }


    public int getNumberOfClaws() {
        return numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getNumberOfMoustaches() {
        return numberOfMoustaches;
    }

    public void setNumberOfMoustaches(int numberOfMoustaches) {
        this.numberOfMoustaches = numberOfMoustaches;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AbstractCats{" +
                "numberOfClaws=" + numberOfClaws +
                ", tailLength=" + tailLength +
                ", numberOfMoustaches=" + numberOfMoustaches +
                '}';
    }
    abstract void sharpenClaws();
}
