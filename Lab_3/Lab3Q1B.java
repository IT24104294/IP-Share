import java.util.Scanner;

public class IT24104294Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new scanner object
        double total; // Initiate total variable
        double discount = 0.1; // Initiate discount variable

        System.out.print("Enter the price of 1Kg of rice: ");
        double price = input.nextDouble(); // Get the price

        System.out.print("Enter the number of kilograms you want to buy: ");
        double amount = input.nextDouble(); // Get the amount

        total = price * amount;
        double totalAfterDiscount = total-total*discount;
        System.out.println("\nThe total amount is: " + totalAfterDiscount);
        input.close(); // close the scanner
    }
}