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

        System.out.printf("\nВ %s фаренгейтах ~%.2f градусів по Цельсію.", fahrenheit, celsius);

    }

    private static double convFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
