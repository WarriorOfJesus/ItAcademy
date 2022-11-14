package itacademy.simpletasks;

public class Engine {
    String name;
    double power;

    public Engine(String name, double power){
        this.name = name;
        this.power = power;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPower(double power){
        this.power = power;
    }
    public double getPower(){
        return this.power;
    }

    @Override
    public String toString() {
        return " Engine Name: " + name + "\n Power: " + power;
    }
}
