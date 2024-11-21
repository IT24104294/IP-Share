import java.util.Scanner;
public class IT24104294Lab4Q1{
    public static void main(String args[]){
        String result;
        System.out.print("Enter a number: ");
        Scanner inputRef = new Scanner(System.in);
        int number = inputRef.nextInt();
        if (number>0){
            result = "Positive";
            System.out.println("The number is: " + result);
        }else if (number == 0){
            result = "Zero";
            System.out.println("The number is: " + result);
        }
        else{
            result = "Negative";
            System.out.println("The number is: " + result);
        }
    }
}