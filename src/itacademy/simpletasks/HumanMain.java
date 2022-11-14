package itacademy.simpletasks;

public class HumanMain {
    public static void main(String[] args) {
        Person person = new Person("Igor'",  30, 102.5, "USA", "male", 192.5 );
        System.out.println(person);
        Person human = new Person("Petya", 16, 70.5, "Kanada", "male", 177.0 );
        System.out.println(human);
    }
}
