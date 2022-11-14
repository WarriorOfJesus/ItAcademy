package itacademy.fridge;

public class MainFridge {
    public static void main(String[] args) {
        String material = "Stainless steel";
        FridgeBody body = new FridgeBody(material, 175.0, 50.0, 80.5);
//        body.setMaterial("");

        FridgeOfDoors countOfDoors = new FridgeOfDoors(1);
        FridgeOfDoors[] doors = new FridgeOfDoors[1];
        doors[0] = countOfDoors;

        FridgeOfRubberSeal rubberSeal = new FridgeOfRubberSeal(true);

        FridgeOfFreezerCompartment freezerCompartment = new FridgeOfFreezerCompartment(120.5, 46.0, 5);

        TheFreezer theFreezer = new TheFreezer(54.5, 46.0, 2);

        Meat meatType = new Meat(1, "beef");
        Meat[] meat = new Meat[1];
        meat[0] = meatType;

        Vegetables vegetablesType = new Vegetables(3.0, "tomato");
        Vegetables[] vegetables = new Vegetables[1];
        vegetables[0] = vegetablesType;


        OtherFood anotherFood = new OtherFood(3, "Other Food");
        OtherFood[] otherFood = new OtherFood[1];
        otherFood[0] = anotherFood;

//        ShelvesOfRefrigerator shelvesFor = new ShelvesOfRefrigerator(meat, vegetables, otherFood);
        ShelvesOfRefrigerator[] shelves = new ShelvesOfRefrigerator[3];
        shelves[0] = new ShelvesOfRefrigerator(meat);
        shelves[1] = new ShelvesOfRefrigerator(vegetables);
        shelves[2] = new ShelvesOfRefrigerator(otherFood);
//        shelves[0].setMeat(new Meat[]{new Meat(2, "Chicken")});

        Fridge fridge = new Fridge("LG", body, doors, rubberSeal, freezerCompartment, theFreezer, shelves);
        System.out.println(fridge);

    }

}
