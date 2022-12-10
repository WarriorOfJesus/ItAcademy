package itacademy;

public class Main {
    public static void main(String[] args) {
        Person human1 = new Person("Volodia", 95.7, 17);

        System.out.println(human1);
        human1.runPerson();
        System.out.println();
        human1.eat();
        System.out.println();
        human1.read();
    }
}
