package itacademy.simpletasks;

import itacademy.Computer;

public class Main1 {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.cpu = 6;
        pc.motherBoard = "Asus";
        pc.bP = 450;
        pc.body = "Asus";
        System.out.println(pc);
    }
}
