package itacademy.abstracts;

public class Tiger extends AbstractCats {
    private String name;
    private String kindOfTigers;

    public Tiger(double weight, int age, String color, int numberOfClaws,
                 double tailLength, int numberOfMoustaches, String name, String kindOfTigers) {
        super(weight, age, color, numberOfClaws, tailLength, numberOfMoustaches);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfTigers() {
        return kindOfTigers;
    }

    public void setKindOfTigers(String kindOfTigers) {
        this.kindOfTigers = kindOfTigers;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", kindOfTigers='" + kindOfTigers + '\'' +
                "numberOfClaws=" + getNumberOfClaws() +
                ", tailLength=" + getTailLength() +
                ", numberOfMoustaches=" + getNumberOfMoustaches() +
                '}';
    }

    @Override
    void sharpenClaws() {
        System.out.println("Tiger sharpen claws ");
    }

    @Override
    void makeNoise() {
        System.out.println("rrrrr rrr rrr arrr");
    }

    @Override
    void eat() {
        System.out.println("Tiger is eating grass");
    }

    @Override
    void run() {
        System.out.println("Tiger is running");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is sleeping");
    }

}
