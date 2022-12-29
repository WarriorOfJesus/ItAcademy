package itacademy.interface1;

import java.util.Random;
import java.util.Scanner;

public class Turtle implements Usable {
    private Random random;
    private String name;
    private String kindOfTurtles;

    public Turtle(String name) {
        this.name = name;
    }

    public Turtle(String name, String kindOfTurtles) {
        this.name = name;
        this.kindOfTurtles = kindOfTurtles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfTurtles() {
        return kindOfTurtles;
    }

    public void setKindOfTurtles(String kindOfTurtles) {
        this.kindOfTurtles = kindOfTurtles;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", kindOfTurtles='" + kindOfTurtles + '\'' +
                '}';
    }

    public void postponeEgg() {
        int countEgg = 10; /*his.random.nextInt(20);*/
        System.out.println("Turtle postpone " + countEgg + " eggs");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }

    @Override
    public void makeASound() {
        System.out.println("Turtle is making a sound");
    }

    @Override
    public void useAll() {

    }

    @Override
    public void wearingAShel() {

    }

    /*public Swimable getSwimibale(){
        Swimable swimable = new Turtle("Pasha", "marine");  //return new Turtle("Pasha", "marine");
            return swimable;
        }*/
}

/*    @Override
    public void postponeEgg() {
        System.out.println("the turtle swims");
    }

    @Override
    public void swim() {
        System.out.println("the turtle wears a shell");
    }

    @Override
    public void wearingAShel() {
        System.out.println("the turtle lays eggs");
    }*/
