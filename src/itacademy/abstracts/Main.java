package itacademy.abstracts;

public class Main {
    public static void main(String[] args) {
        AbstractAnimal cat = new Cat(55.0, 6, "jsgh", 6, 5.0, 4, "Volodya", "Sashka", "Maratova 79");
        AbstractAnimal tiger = new Tiger(555.0, 4, "red", 40, 58.0, 4, "Tiger", "kind special tiger");
        AbstractAnimal cow = new Cow(600.0, 13, "white","Marta", "Sashka", "Maratova 79"  );
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println(cow);
        cat.makeNoise();
        tiger.makeNoise();
        cow.makeNoise();

    }

}
