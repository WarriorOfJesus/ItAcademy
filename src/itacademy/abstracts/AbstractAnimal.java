package itacademy.abstracts;

public abstract class AbstractAnimal {
    private double weight;
    private int age;
    private String color;

    public AbstractAnimal(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    abstract void makeNoise();

    abstract void eat();

    abstract void run();

    abstract void sleep();
}
