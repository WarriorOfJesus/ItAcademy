package itacademy.simpletasks;

public class Car {
    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public Engine getEngine(){
        return this.engine;
    }

}
