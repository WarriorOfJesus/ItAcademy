package itacademy.interface1;

import java.sql.SQLOutput;

public class Shark implements Swimable {
    private String name;
    private String kindOfShark;

    public Shark(String name) {
        this.name = name;
    }

    public Shark(String name, String kindOfShark) {
        this.name = name;
        this.kindOfShark = kindOfShark;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfShark() {
        return kindOfShark;
    }

    public void setKindOfShark(String kindOfShark) {
        this.kindOfShark = kindOfShark;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", kindOfShark='" + kindOfShark + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Shark is Swimming");
    }

    @Override
    public void makeASound() {
        System.out.println("Shark is making a sound!");
    }

    public void hunt() {
        System.out.println("Shark is Hunting");
    }
}
