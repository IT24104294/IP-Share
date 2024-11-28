import java.util.Scanner;
public class IT24104294Lab06Q1 {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = inputRef.nextInt();
        
        
        System.out.println("\nThe square of " + number + " is : " + Math.pow(number, 2));
        System.out.println("The square root of " + number + " is : " + Math.sqrt(number));

        inputRef.close();
    }
}
