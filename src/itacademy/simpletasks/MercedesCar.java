package itacademy.simpletasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MercedesCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle(3, "green", true);
        Dog dog = new Dog("Alpha", "German shepherd", "Women", 2, 24.5);
        Dog dog2 = new Dog("Sharik","boy", 3);
        Dog dog3 = new Dog();

        //System.out.println(dog.age);
        dog.setName("Sharik");
        String name = dog2.getName( );
        dog.setBreedOfDogs("Alabay");
        dog.setSex("boy");
        dog.setAge(3);
        dog.setWeight(30.8);
        System.out.println("name of dog: " + dog.getName());
        System.out.println("breed of dog: " + dog.getBreedOfDogs());
        System.out.println("sex of dog: " + dog.getSex());
        System.out.println("age of the dog: " + dog.getAge());
        System.out.println("weight of the dog: " + dog.getWeight());

        System.out.println(circle1.getColor());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getIsTransparent());
        System.out.println("Square Circle before : " + circle1.getSquareCircle());
        System.out.println("Length before: " + circle1.getLength());
        System.out.println("Enter number for increase number to n times:");
        int n = scanner.nextInt();
        circle1.setRadius(circle1.getRadius() * n);
        System.out.println("Square Circle after : " + circle1.getSquareCircle());
        System.out.println("Length after: " + circle1.getLength());
        Circle[] circles = new Circle[100];
        Circle[] circles2 = new Circle[100];
        Random random = new Random();
        for (int i = 0, j = 0; i < 100; i++) {
            circles[i] = new Circle(random.nextInt(100), "red", i % 2 == 0);
        if (circles[i].getRadius() % 3 == 0) {
            circles2[j] = circles[i];
            System.out.println(circles2[j].getRadius());
            j++;
        }
        }
    }
}
/*
        Mercedes car = new Mercedes();
        Rectangle rectangle1= new Rectangle();
        rectangle1.a = 10;
        rectangle1.b = 15;
        int square = rectangle1.a * rectangle1.b;


        Rectangle rectangle2 = new Rectangle();
        rectangle2.a = 10;
        rectangle2.b = 15;
        int square2 = rectangle1.a * rectangle1.b;

        Rectangle rectangle3 = new Rectangle();
        rectangle3.a = 10;
        rectangle3.b = 15;
        System.out.println();
*/
       /* car.engine = 2.3;
        car.doors = 4;
        car.body = "W124";
        car.wheels = 5;
        car.battery = 300;
        car.interior = "Black";*/
//        System.out.println("Name car:" + car.body + "\n" + "Engine:" + car.engine + "\n" +
//                "Quantity doors:" + car.doors + "\n" + "Quantity wheels:" +
//                car.wheels + "\n" + "Interior:" + car.interior);
        /*car.setBattery(300);
        System.out.println("Size battery: " + car.getBattery());
        car.setEngine(2.3);
        System.out.println("Engine: " + car.getEngine());
        car.setBody("W124");
        System.out.println("Name car: " + car.getBody());
        car.setDoors(4);
        System.out.println("Quantity doors: " + car.getDoors());
        car.setWheels(5);
        System.out.println("Quantity wheels: " + car.getWheels());
        car.setInterior("Black");
        System.out.println("Interior: " + car.getInterior());*/
//        Human firstHuman = new Human(20,"Max");
//        Human seconHuman = new Human(17, "Alex", 74.5);