package itacademy.fridge;

import jdk.jshell.JShell;

import java.util.Arrays;

public class Fridge {
    String name;
    FridgeBody body;
    FridgeOfDoors[] doors;
    FridgeOfRubberSeal rubberSeal;
    FridgeOfFreezerCompartment freezerCompartment;
    TheFreezer theFreezer;
    ShelvesOfRefrigerator[] shelves;

    public Fridge(String name, FridgeBody body, FridgeOfDoors[] doors, FridgeOfRubberSeal rubberSeal, FridgeOfFreezerCompartment freezerCompartment, TheFreezer theFreezer, ShelvesOfRefrigerator[] shelves) {
        this.name = name;
        this.body = body;
        this.doors = doors;
        this.rubberSeal = rubberSeal;
        this.freezerCompartment = freezerCompartment;
        this.theFreezer = theFreezer;
        this.shelves = shelves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBody(FridgeBody body) {
        this.body = body;
    }

    public FridgeBody getBody() {
        return this.body;
    }

    public void setDoors(FridgeOfDoors[] doors) {
        this.doors = doors;
    }

    public FridgeOfDoors[] getDoors() {
        return this.doors;
    }

    public void setRubberSeal(FridgeOfRubberSeal rubberSeal) {
        this.rubberSeal = rubberSeal;
    }

    public FridgeOfRubberSeal getRubberSeal() {
        return this.rubberSeal;
    }

    public void setFreezerCompartment(FridgeOfFreezerCompartment freezerCompartment) {
        this.freezerCompartment = freezerCompartment;
    }

    public FridgeOfFreezerCompartment getFreezerCompartment() {
        return this.freezerCompartment;
    }

    public void setTheFreezer(TheFreezer theFreezer) {
        this.theFreezer = theFreezer;
    }

    public TheFreezer theFreezer() {
        return this.theFreezer;
    }

    public void setShelves(ShelvesOfRefrigerator[] shelves) {
        this.shelves = shelves;
    }

    public ShelvesOfRefrigerator[] getShelves() {
        return this.shelves;
    }

    @Override
    public String toString() {
        return "Name Fridge: " + name + "\nBody: " +
                body + "\nDoors: " + Arrays.toString(doors) + "\nRubber Seal: " +
                rubberSeal + "\nfreezer Compartment: " + freezerCompartment +
                "\nThe Freezer: " + theFreezer + "\nshelves: " + Arrays.toString(shelves);
    }
}
