import java.util.Scanner;

public class IT24104294Lab5Q3 {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        final double PRICE = 48000.0;
        double total = 0;
        double discount = 0.0;
        System.out.print("Enter Start Date(1 - 31): ");
        int start_date = inputRef.nextInt();
        System.out.print("Enter End Date(1 - 31): ");
        int end_date = inputRef.nextInt();

        if (start_date < 1 | start_date > 31) {
            System.out.print("ERROR: Days must be between 1 and 31");
        } else if (end_date < 1 | end_date > 31) {
            System.out.print("ERROR: Days must be between 1 and 31");
        } else if (start_date > end_date) {
            System.out.print("ERROR: Start Date must be less than End date");
        } else {
            int reservedDate = end_date - start_date;

            System.out.println("\nRoom charges per day: " + PRICE);
            System.out.println("Number of days reserved: " + reservedDate);

            total = PRICE*reservedDate; // Initial Price

            if (reservedDate >= 3) {
                discount = 0.1;
            } else if (reservedDate > 5) {
                discount = 0.2;
            }else{
                discount = 0;
            }

            total = total - (total * discount); // Amount after discount
            System.out.println("Total amount to be paid: " + total);
        }
        inputRef.close();
    }
}
