import java.util.Scanner;

public class IT24104294Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total;  // Initiate total variable

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();
        System.out.print("Enter the number of OT hours: ");
        double OT_hours = input.nextDouble();
        System.out.print("Enter the OT hourly rate: ");
        double OT_hours_rate = input.nextDouble();
        
        double OT_Amount = OT_hours * OT_hours_rate;
        total = monthlySalary + OT_Amount;

        System.out.println("\nThe total salary including OT is: "+total);
        input.close();
    }
}