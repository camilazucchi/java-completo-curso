package membrosEstaticos.util;

public class ConversorTemperatura {

    public static double converteCelsiusFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double converteFahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}
