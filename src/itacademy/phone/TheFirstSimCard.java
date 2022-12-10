package itacademy.phone;

public class TheFirstSimCard {
    private String name;
    private String yourNumber;
    private double balance;

    public TheFirstSimCard(String name, String yourNumber, double balance) {
        this.name = name;
        this.yourNumber = yourNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getYourNumber() {
        return yourNumber;
    }

    public void setYourNumber(String yourNumber) {
        this.yourNumber = yourNumber;
    }

    public double checkingTheBalance() {
        if (this.balance == 0d) {
            System.out.println("you don't have balance...");
            System.out.println("Replenishment Of The Balance");
        }
        return 0;
    }

    public void balanceWithdrawal1(String operation) {
        System.out.println("your balance before the operation :" + this.balance);
        switch (operation) {
            case "Call":
                this.balance -= 1;
                break;
            case "SMS":
                this.balance -= 5;
                break;
            case "internet login":
                this.balance -= 10;
                break;
        }
        System.out.println("your balance after the operation : " + this.balance);
    }

    public void oshkaReplenishmentOfTheBalance50() {
        this.balance += 50;
        System.out.println("the balance is replenished! Oshka!");
        System.out.println("your balance right now:" + this.balance);
    }

    @Override
    public String toString() {
        return
                " name: " + name + ", Your number: " + yourNumber +
                        ", balance: " + balance;
    }
}
