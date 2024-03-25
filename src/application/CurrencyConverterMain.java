package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarExchangeRate = sc.nextDouble();

        System.out.print("How many dollar to be bought? ");
        double dollarsToBuy = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f",
                CurrencyConverter.reaisToPay(dollarExchangeRate, dollarsToBuy));

        sc.close();

    }
}
