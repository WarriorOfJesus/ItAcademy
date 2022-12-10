package itacademy.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheFirstSimCard oshka = new TheFirstSimCard("Oshka!", "0707310648", 100d);
        TheSecondSimCard megaCome = new TheSecondSimCard("MegaCome", "0553350111", 15d);
        Phone phone = new Phone(oshka, megaCome);
        System.out.println(phone);

        phone.printChoose();
        phone.choose();
        oshka.oshkaReplenishmentOfTheBalance50();
        System.out.println(phone);


    }
}
