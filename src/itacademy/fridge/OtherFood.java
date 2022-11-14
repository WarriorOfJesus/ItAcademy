package itacademy.fridge;

public class OtherFood {
    int count;
    String type;

    public OtherFood(int count, String type) {
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
            return "Type another food: " + type + " Amount of another food is " + count + " byte";
    }
}
