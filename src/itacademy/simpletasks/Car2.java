package itacademy.simpletasks;

public class Car2 {
    public static void main(String[] args) {
        Engine engine = new Engine("K500", 450);
        Car car = new Car(engine);

//        Engine engine2 = car.getEngine();
        System.out.println(car.getEngine());


    }
}