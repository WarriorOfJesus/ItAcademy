package itacademy.fridge;

import java.util.Arrays;

public class ShelvesOfRefrigerator {
    Meat[] meat;
    Vegetables[] vegetables;
    OtherFood[] otherFood;

    public ShelvesOfRefrigerator(Meat[] meat, Vegetables[] vegetables, OtherFood[] otherFood) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.otherFood = otherFood;
    }

    public ShelvesOfRefrigerator(OtherFood[] otherFood) {
        this.otherFood = otherFood;
    }

    public ShelvesOfRefrigerator(Meat[] meat) {
        this.meat = meat;
    }

    public ShelvesOfRefrigerator(Vegetables[] vegetables) {
        this.vegetables = vegetables;
    }

    public void setMeat(Meat[] meat) {
        this.meat = meat;
    }

    public Meat[] getMeats() {
        return this.meat;
    }

    public void setVegetables(Vegetables[] vegetables) {
        this.vegetables = vegetables;
    }

    public Vegetables[] getVegetables() {
        return this.vegetables;
    }

    public void setAnotherFoods(OtherFood[] OtherFoods) {
        this.otherFood = OtherFoods;
    }

    public OtherFood[] getAnotherFoods() {
        return this.otherFood;
    }

    @Override
    public String toString() {
        if (meat != null && vegetables != null && otherFood != null) {
            return "\nMeat: " + Arrays.toString(meat) + "\nVegetable: " + Arrays.toString(vegetables) +
                    "\nOther Food: " + Arrays.toString(otherFood);
        } else if (meat != null && vegetables != null) {
            return "\nMeat: " + Arrays.toString(meat) + "\nVegetable: " + Arrays.toString(vegetables);
        } else if (meat != null && otherFood != null) {
            return "\nMeat: " + Arrays.toString(meat) + "\nOther Food: " + Arrays.toString(otherFood);
        } else if (vegetables != null && otherFood != null) {
            return "\nVegetable: " + Arrays.toString(vegetables) + "\nOther Food: " + Arrays.toString(otherFood);
        } else if (meat != null) {
            return "\nMeat: " + Arrays.toString(meat);
        } else if (vegetables != null) {
            return "\nVegetable: " + Arrays.toString(vegetables);
        } else if (otherFood != null) {
            return "\nOther Food:" + Arrays.toString(otherFood);
        } else
            return "\nThere's nothing on this shelf";
    }
}
