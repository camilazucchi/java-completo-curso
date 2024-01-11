package membrosEstaticos.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double quantity, double dollarPrice) {
        return quantity * dollarPrice * (1.0 + IOF);
    }

}
