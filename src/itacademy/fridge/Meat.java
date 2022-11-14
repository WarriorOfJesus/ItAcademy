package itacademy.fridge;

public class Meat {
    int count;
    String type;

    public Meat(int count, String type) {
        this.count = count;
        this.type = type;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Type meat: " + type + " Amount of meat is " + count + " byte";
    }
}
