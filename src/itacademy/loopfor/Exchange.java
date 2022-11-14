package itacademy.loopfor;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency: ");
        String currency = scanner.nextLine();
        System.out.println("enter sum in som: ");
        double sumInSom = scanner.nextInt();
        double rate;
        rate = switch (currency) {
            case "USD" -> sumInSom * 69.5;
            case "EUR" -> sumInSom * 79.5;
            case "RUB" -> sumInSom * 1.05;
            case "KZT" -> sumInSom * 0.2;
            default -> sumInSom * 1;
        };
        System.out.println(rate);
    }

    String[] currency1 = new String[]{"USD", "EUR", "RUB", "KZT", "KGS"};
    double[] sumCurrency = new double[]{69.5, 79.5, 1.05, 0.2};


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
                    case "EUR" -> sum = count * eur / eur;
                    case "KZT" -> sum = count * eur / kzt;
                    case "RUB" -> sum = count * eur / rub;
                    default -> sum = count * eur / kgs;
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
        System.out.println(sum);
    }
}

