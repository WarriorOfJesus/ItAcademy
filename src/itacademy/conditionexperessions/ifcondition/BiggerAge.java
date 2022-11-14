package itacademy.conditionexperessions.ifcondition;

import java.util.Scanner;

public class BiggerAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anton's age: ");
        byte antonAge = scanner.nextByte();
        System.out.println("Boris's age: ");
        byte borisAge = scanner.nextByte();
        System.out.println("Victor's age: ");
        byte victorAge = scanner.nextByte();
        if(antonAge == borisAge && antonAge == victorAge){
            System.out.println("they are all the same age");
        }else if (antonAge == borisAge && victorAge < antonAge) {
            System.out.println("Anton and Boris are older than Victor");
        } else if (victorAge == borisAge && antonAge < borisAge) {
            System.out.println(" Victor and Boris are older than Anton");
        } else if (antonAge == victorAge && borisAge < antonAge) {
            System.out.println(" Anton and Victor are older than Boris");
        } else if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Anton is older");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Boris is older");
        } else {
            System.out.println("Victor is older");
        }
    }
}
