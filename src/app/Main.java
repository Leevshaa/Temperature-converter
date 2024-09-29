package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.print("***Конвертер температури***" + "\nВведіть температуру в Фаренгейтах: ");
        fahrenheit = scanner.nextDouble();

        celsius = convFahrenheitToCelsius(fahrenheit);

        System.out.printf("\nВ %s градусах по Фаренгейту ~%.2f градусів по Цельсію.", fahrenheit, celsius);
        System.out.print("\nВведіть температуру в Цельсіях: ");
        celsius = scanner.nextDouble();

        fahrenheit = convCelsiusToFahrenheit(celsius);

        System.out.printf("\nВ %s градусах по Цельсію ~%.2f градусів по Фаренгейту.", celsius, fahrenheit);

    }

    private static double convFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convCelsiusToFahrenheit (double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
