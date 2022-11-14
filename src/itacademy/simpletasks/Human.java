package itacademy.simpletasks;

public abstract class Human {
    int age;
    String name;
    double weight;

    public Human(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String result = "Age: " + age+
                "\nName: " + name +"\nWeight: "  + weight;
        return result;
    }
}

    /*public Human(int age, String name, double weight){
        this.age = age;
        this.name = name;
        this.weight = weight;*/
   /* public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
}*/
