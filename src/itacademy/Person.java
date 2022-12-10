package itacademy;

public class Person {
    String name;
    double weight;
    int age;

    Person(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    double setWeight() {
        return this.weight;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void runPerson() {
        System.out.println(name + " is running");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void read() {
        System.out.println(name + " is reading");
    }

    @Override
    public String toString() {
        return "name: " + name + "  Age: " + age + " Weight: " + weight;
    }
}