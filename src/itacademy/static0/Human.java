package itacademy.static0;

public class Human {
    private String name;
    private double weight;
    private String sex;
    private static int count;

    public Human(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
        count = count;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
