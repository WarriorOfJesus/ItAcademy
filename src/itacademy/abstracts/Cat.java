package itacademy.abstracts;

public class Cat extends AbstractCats {
    private String name;
    private String nameOfOwner;
    private String address;

    public Cat(double weight, int age, String color, int numberOfClaws,
               double tailLength, int numberOfMoustaches, String name, String nameOfOwner, String address) {
        super(weight, age, color, numberOfClaws, tailLength, numberOfMoustaches);
        this.name = name;
        this.nameOfOwner = nameOfOwner;
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
        return "Cat{" +//еще можно было сделать через super.toString()
                "name='" + name + '\'' +
                ", name Of Owner='" + nameOfOwner + '\'' +
                ", address='" + address + '\'' +
                ", number Of Claws=" + getNumberOfClaws() + '\'' +
                ", tail Length=" + getTailLength() + '\'' +
                ", number Of Moustaches=" + getNumberOfMoustaches() + '\'' +
                ", weight=" + getWeight() + '\'' +
                ", age=" + getAge() + '\'' +
                ", color='" + getWeight() + '\'' +
                '}';
    }

    @Override
    void sharpenClaws() {
        System.out.println("Cat sharpen claws");
    }

    @Override
    void makeNoise() {
        System.out.println("Myau Myau Myau");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void run() {
        System.out.println("Cat is eating");

    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }
}
