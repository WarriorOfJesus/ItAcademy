package itacademy.interface1;

public class Duck implements Swimable{
    private String name;
    private String nameOfKind;

    public Duck(String name, String nameOfKind) {
        this.name = name;
        this.nameOfKind = nameOfKind;
    }

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfKind() {
        return nameOfKind;
    }

    public void setNameOfKind(String nameOfKind) {
        this.nameOfKind = nameOfKind;
    }

    @Override
    public void swim() {
        System.out.println("DUG is swimming ");
    }

    @Override
    public void makeASound() {
        System.out.println("Duck is making a sound");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", nameOfKind='" + nameOfKind + '\'' +
                '}';
    }
}
