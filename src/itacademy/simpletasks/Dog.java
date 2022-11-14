package itacademy.simpletasks;

public class Dog {
    String name;
    String breedOfDogs;
    String sex;
    int age;
    double weight;

    public Dog(String name, String breed, String sex, int age, double weight) {
        this.name = name;
        this.breedOfDogs = breed;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreedOfDogs() {
        return this.breedOfDogs;
    }

    public void setBreedOfDogs(String breed) {
        this.breedOfDogs = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
}
