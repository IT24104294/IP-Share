import java.util.Scanner;
public class IT24104294Lab4Q3{
    public static void main(String args[]){
        Scanner inputRef = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = inputRef.nextInt();
        String result;
        result = (number>0) ? "Positive" : (number<0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
    }
}