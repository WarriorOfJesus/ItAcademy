package itacademy.interface1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = {new Duck("Duck1"), new Duck("Duck2"),
                new Duck("Duck3"), new Duck("Duck4"), new Duck("Duck5"),
                new Turtle("Turtle1"), new Turtle("Turtle2"), new Turtle("Turtle3"), new Turtle("Turtle4"),
                new Turtle("Turtle5"), new Shark("Shark1"), new Shark("Shark2"), new Shark("Shark3"), new Shark("Shark4"), new Shark("Shark5")};
        System.out.println(Arrays.toString(oceanarium));
        Shark[] oceanariumForSharks = new Shark[5];
        Turtle[] oceanariumForTurtles = new Turtle[5];
        Duck[] oceanariumForDuck = new Duck[5];
        int turtleCounter = 0;
        int duckCounter = 0;
        int sharkCounter = 0;
        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Shark) {
                oceanariumForSharks[sharkCounter] = (Shark) oceanarium[i];
                sharkCounter++;
            } else if (oceanarium[i] instanceof Turtle) {
                oceanariumForTurtles[turtleCounter] = (Turtle) oceanarium[i];
                turtleCounter++;
            } else if (oceanarium[i] instanceof Duck) {
                oceanariumForDuck[duckCounter] = (Duck) oceanarium[i];
                duckCounter++;
            }/*
            if (oceanarium[i] instanceof Turtle) {
                ((Turtle) oceanarium[i]).postponeEgg();
            }*/
        }
        System.out.println(Arrays.toString(oceanariumForSharks));
        System.out.println(Arrays.toString(oceanariumForTurtles));
        System.out.println(Arrays.toString(oceanariumForDuck));


        /*Swimable turtles1 = new Turtle("Pasha", "marine");
        Swimable turtles2 = new Turtle("Pasha", "marine");
        Swimable turtles3 = new Turtle("Pasha", "marine");
        Swimable turtles4 = new Turtle("Pasha", "marine");
        Swimable turtles5 = new Turtle("Pasha", "marine");
        Swimable shark1 = new Shark("Shark1", "");
        Swimable shark2 = new Shark("Shark1", "");
        Swimable shark3 = new Shark("Shark1", "");
        Swimable shark4 = new Shark("Shark1", "");
        Swimable shark5 = new Shark("Shark1", "");
        Swimable dug1 = new Duck("Dug1", "dug tra tra");
        Swimable dug2 = new Duck("Dug2", "dug tra tra");
        Swimable dug3 = new Duck("Dug3", "dug tra tra");
        Swimable dug4 = new Duck("Dug4", "dug tra tra");
        Swimable dug5 = new Duck("Dug5", "dug tra tra");*/
    /*    Swimable[] container = new Swimable[2]; // {new Shark(), new Turtle() } // и так далее)
        container[0] = turtles1;
        container[1] = shark1;*/

       /* System.out.println("Is swim? " + Oceanable.isSwim);
        System.out.println(Oceanable.oceanArctic);
        System.out.println(Oceanable.oceanAtlan);
        System.out.println(Oceanable.oceanIndian);
        System.out.println(Oceanable.oceanQuiet);*/
        /*for (int i = 0; i < container.length; i++) {
            if (container[i] instanceof Shark) {
                ((Shark) container[i]).hunt();
            }
        }*/
    }
}
