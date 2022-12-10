package itacademy.phone;

public class TheThirdSimCard {
    private String name;
    private double balance;
    public TheThirdSimCard(String name, double balance){
        this.name = name;
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

    public void balanceWithdrawal3(String operation) {
        System.out.println("your balance before the operation :" + this.balance);
        switch (operation){
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

    @Override
    public String toString() {
        return "the Third Sim Card: " +
                ", name: " + name +
                ", balance: " + balance ;
    }
}
