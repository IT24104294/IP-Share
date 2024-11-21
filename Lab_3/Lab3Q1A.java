import java.util.Scanner;
public class IT24104294Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new scanner object
        double total; // Initiate total variable

        System.out.print("Enter the price of 1Kg of rice: ");
        double price = input.nextDouble(); // Get the price

        System.out.print("Enter the number of kilograms you want to buy: ");
        double amount = input.nextDouble(); // Get the amount

        total = price * amount;
        System.out.println("\nThe total amount is: " + total);
        input.close(); // close the scanner
    }
}