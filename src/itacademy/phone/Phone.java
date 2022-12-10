package itacademy.phone;

import java.util.Objects;
import java.util.Scanner;

public class Phone {
    private TheFirstSimCard oshka;
    private   String[] oshkaCode = {"0701", "0702", "0703", "0704", "0705", "0706", "0707", "0708", "0709"};
    private TheSecondSimCard megaCome;
    private String[] megaComeCode = {"0551", "0552", "0553", "0554", "0555", "0556", "0557", "0558", "0559"};
    private String[] beelineCode = {"0501", "0502", "0503", "0504", "0505", "0506", "0507", "0508", "0509"};

//    private TheThirdSimCard beeline;


    public Phone(TheFirstSimCard oshka, TheSecondSimCard megaCome, TheThirdSimCard beeline) {
        this.oshka = oshka;
        this.megaCome = megaCome;
//        this.beeline = beeline;

    }

    public Phone(TheFirstSimCard oshka, TheSecondSimCard megaCome) {
        this.oshka = oshka;
        this.megaCome = megaCome;
    }


    public TheFirstSimCard getOshka() {
        return oshka;
    }

    public void setOshka(TheFirstSimCard oshka) {
        this.oshka = oshka;
    }

    public TheSecondSimCard getMegaCome() {
        return megaCome;
    }

    public void setMegaCome(TheSecondSimCard megaCome) {
        this.megaCome = megaCome;
    }

//    public TheThirdSimCard getBeeline() {
//        return beeline;
//    }
//
//    public void setBeeline(TheThirdSimCard beeline) {
//        this.beeline = beeline;
//    }


    public String[] getMegaComeCode() {
        return megaComeCode;
    }

    public void setMegaComeCode(String[] megaComeCode) {
        this.megaComeCode = megaComeCode;
    }

    public String[] getOshkaCode() {
        return oshkaCode;
    }

    public void setOshkaCode(String[] oshkaCode) {
        this.oshkaCode = oshkaCode;
    }


    void choose() {
        Scanner scanner = new Scanner(System.in);
        String name;
        String name2;
        String calling = "Call";
        String sms = "SMS";
        String internetLogin = "internet login";
        String choose;
        do {
            choose = scanner.nextLine();
            System.out.println(choose);
            if (calling.equals(choose)) {
                System.out.println("Enter the number: ");
                name = scanner.nextLine();
                for (String i : oshkaCode) {
                    if (name.substring(0, 4).equals(i)) {
                        System.out.println("you are calling on Oshka!");
                    }
                }
                for (String i : megaComeCode) {
                    if (name.substring(0, 4).equals(i)) {
                        System.out.println("you are calling on megaCome!");
                    }
                }
                for (String i : beelineCode) {
                    if (name.substring(0, 4).equals(i)) {
                        System.out.println("you are calling on Beeline!");
                    }
                }
                chooseSimCard(choose);
                System.out.println("you calling subscriber: " + name);
            } else if (sms.equals(choose)) {
                System.out.println("Enter the number: ");
                name2 = scanner.nextLine();
                for (String i : oshkaCode) {
                    if (name2.substring(0, 4).equals(i)) {
                        System.out.println("you are writing SMS on Oshka!");
                    }
                }
                for (String i : megaComeCode) {
                    if (name2.substring(0, 4).equals(i)) {
                        System.out.println("you are writing SMS on megaCome!");
                    }
                }
                for (String i : beelineCode) {
                    if (name2.substring(0, 4).equals(i)) {
                        System.out.println("you are calling on Beeline!");
                    }
                }
                System.out.println("Enter the SMS: ");
                name = scanner.nextLine();
                System.out.println("you have sent a message to this subscriber: " + name2);
                System.out.println("you wrote SMS:" + name);
                chooseSimCard(choose);
            } else if (internetLogin.equals(choose)) {
                System.out.println("You are logged in to the Internet");
                chooseSimCard(choose);
            } else {
                printChoose2();
                System.out.println("you entered incorrectly, try again) ");
                System.out.println("type <<that's all>> to finish");
                System.out.print("Enter here: ");
            }
//                scanner.nextLine();
        } while (!choose.equals("that's all"));
    }

    //            name.substring(0, 4)
    public void printChoose2() {
        System.out.println();
        System.out.println("what do you wanna  choose?");
        System.out.println("{Call, SMS,  internet login}");
    }

    public void printChoose() {
        System.out.println();
        System.out.println("what do you wanna  choose?");
        System.out.println("{Call, SMS,  internet login}");
        System.out.print("Enter here: ");
    }

    public void chooseSimCard(String operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 (Oshka) or 2 (MegaCome)");
        System.out.print("select the sim card:");
        String simCard = scanner.nextLine();
        if (simCard.equals("1")) {
            oshka.balanceWithdrawal1(operation);
            System.out.println("check the balance =)");
        } else if (simCard.equals("2")) {
            megaCome.balanceWithdrawal2(operation);
            System.out.println("check the balance =)");
        }
        //scanner.nextLine();
    }


    @Override
    public String toString() {
        String rate = """
                Услуга       \tБилайн  \tО  \tМегаком
                Звонок 1 мин: \t|1 сом|\t|1 сом|\t|1 сом|
                1 СМС:        \t|5    |\t|5    |\t|5    |
                Internet 1 гб: \t|10   |\t|10   |\t|10   |""";
        return "The first sim card Oshka! = " + oshka +
                "\nThe Second sim card MegaCome = " + megaCome + "\n" + rate;
    }
}
