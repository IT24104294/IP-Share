import java.util.Scanner;

public class IT24104294Lab07Q3 {
    public static void main(String[] args) {
        final double DISCOUNT = 0.05;
        Scanner inputRef = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCustomer "+i);
            System.out.print("Enter total bill amount: ");
            double amount = inputRef.nextInt();
            System.out.print("Enter mode of payment (C for cash, O for Other): ");
            char method = inputRef.next().toUpperCase().charAt(0);

            switch (method) {
                case 'C':
                    System.out.println("Discount is:  "+(amount*DISCOUNT));
                    amount = amount - (amount*DISCOUNT);
                    System.out.println("Amount to be paid: "+amount);
                    break;
                case 'O':
                        System.out.println("No Discount Applicable");
                        System.out.println("Amount to be paid: "+amount);
                        break;
                default:
                    System.out.println("Payment Mode Is Not Valid");
                    break;
            }
        }
        inputRef.close();
    }
}