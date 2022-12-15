package itacademy.static0;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Petya", 35.5, "man");
        Human human2 = new Human("Sanya", 30.5, "man");
        Human human3 = new Human("Masha", 76.5, "woman");
        System.out.println(human);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(Human.getCount());
    }
}
