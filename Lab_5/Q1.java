import java.util.Scanner;;
public class IT24104294Lab5Q1{
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        int max, min;
        // First Value
        System.out.print("Enter the first Integer: ");
        int num1 = inputRef.nextInt();
        // Second Value
        System.out.print("Enter the second Integer: ");
        int num2 = inputRef.nextInt();
        // Third Value
        System.out.print("Enter the third Integer: ");
        int num3 = inputRef.nextInt();
        
        max = num1;
        min = num1;
        // MAX
        if (num2>max){
            max = num2;
        }
        if (num3>max) {
            max = num3;
        }
        // MIN
        if (num2<min) {
            min = num2;
        }
        if (num3<min) {
            min = num3;
        }
        System.out.println("\nUser Entered numbers are: " + num1+" "+num2+" "+num3);
        System.out.println("The Smallest number is: " + min);
        System.out.println("The Largest number is: " + max);
        inputRef.close();
    }
}