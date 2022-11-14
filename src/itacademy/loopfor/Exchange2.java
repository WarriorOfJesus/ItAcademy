package itacademy.loopfor;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exchange2 {
    static String[] currency = {"USD", "EUR", "RUB", "KZT", "KGS"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum;
        do {
            System.out.println("available currencies: "+ Arrays.toString(currency));
            System.out.print("enter the first currency: ");
            String theFirstCurrency = scanner.nextLine();
            System.out.print("enter the second currency: ");
            String theSecondCurrency = scanner.nextLine();
            System.out.print("enter sum in " + theFirstCurrency + ": ");
            sum = scanner.nextDouble();
            //get(theFirstCurrency, theSecondCurrency, sumInSom);
            getCurrentCurrencyRate(theFirstCurrency,theSecondCurrency, sum);
            scanner.nextLine();
        }while(sum != 0);

    }

    static void get(String first, String second, double sum) {
        double[] sumCurrency = {69.05, 79.05, 1.05, 0.2, 1.0};
        double remains;
        if (Objects.equals(first, currency[0]) && Objects.equals(second, currency[1])) {
            remains = sum * sumCurrency[0];
            sum = remains / sumCurrency[1];
        }else if(Objects.equals(first, currency[0]) && Objects.equals(second, currency[2])){
            remains = sum * sumCurrency[0];
            sum = remains / sumCurrency[2];
        }else if(Objects.equals(first, currency[0]) && Objects.equals(second, currency[3])) {
            remains = sum * sumCurrency[0];
            sum = remains / sumCurrency[3];
        }else if(Objects.equals(first, currency[0]) && Objects.equals(second, currency[4])){
            remains = sum * sumCurrency[0];
            sum = remains / sumCurrency[4];
        }else if (Objects.equals(first, currency[1]) && Objects.equals(second, currency[0])) {
            remains = sum * sumCurrency[1];
            sum = remains / sumCurrency[0];
        }else if(Objects.equals(first, currency[1]) && Objects.equals(second, currency[2])){
            remains = sum * sumCurrency[1];
            sum = remains / sumCurrency[2];
        }else if(Objects.equals(first, currency[1]) && Objects.equals(second, currency[3])) {
            remains = sum * sumCurrency[1];
            sum = remains / sumCurrency[3];
        }else if(Objects.equals(first, currency[1]) && Objects.equals(second, currency[4])){
            remains = sum * sumCurrency[1];
            sum = remains / sumCurrency[4];
        }else if (Objects.equals(first, currency[2]) && Objects.equals(second, currency[0])) {
            remains = sum * sumCurrency[2];
            sum = remains / sumCurrency[0];
        }else if(Objects.equals(first, currency[2]) && Objects.equals(second, currency[1])){
            remains = sum * sumCurrency[2];
            sum = remains / sumCurrency[1];
        }else if(Objects.equals(first, currency[2]) && Objects.equals(second, currency[3])) {
            remains = sum * sumCurrency[2];
            sum = remains / sumCurrency[3];
        }else if(Objects.equals(first, currency[2]) && Objects.equals(second, currency[4])){
            remains = sum * sumCurrency[2];
            sum = remains / sumCurrency[4];
        }else if (Objects.equals(first, currency[3]) && Objects.equals(second, currency[0])) {
            remains = sum * sumCurrency[3];
            sum = remains / sumCurrency[0];
        }else if(Objects.equals(first, currency[3]) && Objects.equals(second, currency[1])){
            remains = sum * sumCurrency[3];
            sum = remains / sumCurrency[1];
        }else if(Objects.equals(first, currency[3]) && Objects.equals(second, currency[2])) {
            remains = sum * sumCurrency[3];
            sum = remains / sumCurrency[2];
        }else if(Objects.equals(first, currency[3]) && Objects.equals(second, currency[4])){
            remains = sum * sumCurrency[3];
            sum = remains / sumCurrency[4];
        }else if (Objects.equals(first, currency[4]) && Objects.equals(second, currency[0])) {
            remains = sum * sumCurrency[4];
            sum = remains / sumCurrency[0];
        }else if(Objects.equals(first, currency[4]) && Objects.equals(second, currency[1])){
            remains = sum * sumCurrency[4];
            sum = remains / sumCurrency[1];
        }else if(Objects.equals(first, currency[4]) && Objects.equals(second, currency[2])) {
            remains = sum * sumCurrency[4];
            sum = remains / sumCurrency[2];
        }else if(Objects.equals(first, currency[4]) && Objects.equals(second, currency[3])){
            remains = sum * sumCurrency[4];
            sum = remains / sumCurrency[3];
        }
        System.out.printf("%.2f\n",sum);
    }
    static void getCurrentCurrencyRate(String fromCurrencyCode, String toCurrencyCode, double count) {
        double usd = 69.5;
        double eur = 79.5;
        double kzt = 0.2;
        double rub = 1.05;
        double kgs = 1.0;
        double rate;
        double sum = 0;
        switch (fromCurrencyCode) {
            case "USD" -> {
                switch (toCurrencyCode) {
                    case "USD" -> sum = count;
                    case "EUR" -> sum = count * usd / eur;
                    case "KZT" -> sum = count * usd / kzt;
                    case "RUB" -> sum = count * usd / rub;
                    default -> sum = count * usd / kgs;
                }
            }
            case "EUR" -> {
                switch (toCurrencyCode) {
                    case "EUR" -> sum = count;
                    case "USD" -> sum = count * eur / usd;
                    case "KZT" -> sum = count * eur / kzt;
                    case "RUB" -> sum = count * eur / rub;
                    default -> sum = count * eur / kgs;
                }
            }
            case "KZT" -> {
                switch (toCurrencyCode) {
                    case "KZT" -> sum = count;
                    case "EUR" -> sum = count * kzt / eur;
                    case "USD" -> sum = count * kzt / usd;
                    case "RUB" -> sum = count * kzt / rub;
                    default -> sum = count * kzt / kgs;
                }
            }
            case "RUB" -> {
                switch (toCurrencyCode) {
                    case "RUB" -> sum = count;
                    case "EUR" -> sum = count * rub / eur;
                    case "USD" -> sum = count * rub / usd;
                    case "KZT" -> sum = count * rub / kzt;
                    default -> sum = count * rub / kgs;
                }
            }
            case "KGS" -> {
                switch (toCurrencyCode) {
                    case "RUB" -> sum = count * rub / kgs;
                    case "EUR" -> sum = count * kgs / eur;
                    case "USD" -> sum = count * kgs / usd;
                    case "KZT" -> sum = count * kgs / kzt;
                    default -> sum = count;
                }
            }

        };
        System.out.printf("%.2f\n",sum);
    }
}

/*

*/
