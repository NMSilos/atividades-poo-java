package entities;

public class CurrencyConverter {

    public static double reaisToPay(double dollarExchangeRate, double dollarsToBuy){
        double tax = (dollarExchangeRate * dollarsToBuy) * 0.06;
        return (dollarExchangeRate * dollarsToBuy) + tax;
    }

}
