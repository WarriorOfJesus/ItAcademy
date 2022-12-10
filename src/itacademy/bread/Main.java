package itacademy.bread;

public class Main {
    public static void main(String[] args) {
        Lepeshka lepeshka = new Lepeshka(200, 25.0, "KGZ", 20.5);
        System.out.println(lepeshka);
        Lavash lavash = new Lavash(200, 50.0, "KGZ", 30.5, 2.0);
        System.out.println(lavash);
        FrenchBaguette baguette = new FrenchBaguette(300, 30.0, "Armenia", 40.0, 20);
        System.out.println(baguette);

        System.out.println();
        lepeshka.patterns();
        lepeshka.varnishing();
        System.out.println();
        lavash.lavashIsPacked();
        System.out.println();
        baguette.scarring();

    }
}
