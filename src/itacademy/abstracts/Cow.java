package itacademy.abstracts;

public class Cow extends AbstractAnimal {
    private String name;
    private String nameOfOwner;
    private String address;

    public Cow(double weight, int age, String color, String name, String nameOfOwnere, String address) {
        super(weight, age, color);
        this.name = name;
        this.nameOfOwner = nameOfOwnere;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    void makeNoise() {
        System.out.println("MUU mUUU MUUU");
    }

    @Override
    void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    void run() {
        System.out.println("Cow is running");
    }

    @Override
    void sleep() {
        System.out.println("Cow is sleeping");
    }
}
