package com.jumedev.conversordemonedas.main;

import com.jumedev.conversordemonedas.models.Apirequest;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       Scanner scanner = new Scanner(System.in);
        int userChoice = 1;

        while (userChoice != 0) {
            ShowMenu();
            System.out.print("Select an option: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> converter("USD", "EUR", scanner);
                case 2 -> converter("EUR", "USD", scanner);
                case 3 -> converter("USD", "DOP", scanner);
                case 4 -> converter("DOP", "USD", scanner);
                case 5 -> converter("EUR", "DOP", scanner);
                case 6 -> converter("DOP", "EUR", scanner);
                case 0 -> System.out.println("Thanks for preferring CashPort as your Currency-Converter!");
                default -> System.out.println("Select a valid option");
            }
        }
    }
    public static void ShowMenu() {
        System.out.println("""
                
                **************************************************************
                Welcome to CashPort, the fastest money converter in the world!
                **************************************************************
                
                Select an option from below:
                
                1. USD to EUR
                2. EUR TO USD
                3. USD to DOP
                4. DOP to USD
                5. EUR to DOP
                6. DOP to EUR
                0. Exit
                """);
    }

    public static void converter(String from, String to, Scanner scanner) {
        System.out.print("Insert amount to convert: ");
        double amount = scanner.nextDouble();
        double resultado = Apirequest.getExchangeRate(from, to);

        if (resultado == -1) {
            System.out.println("can't get trade right now. Try later.");
            return;
        }
        System.out.printf("%.2f %s equivalen a %.2f %s\n", amount, from, amount * resultado, to);
    }

}
