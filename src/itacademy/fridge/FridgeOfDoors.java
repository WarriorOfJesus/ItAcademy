package itacademy.fridge;

public class FridgeOfDoors {
    int quantity;

    public FridgeOfDoors(int quantity){
        this.quantity = quantity;
    }
    public void setMaterial(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Number of refrigerator doors: " + quantity;
    }
}
