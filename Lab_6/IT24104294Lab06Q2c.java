import java.util.Scanner;

public class IT24104294Lab06Q2c {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        String values = "";
        int number= 0;
        int sum = 0;
        double avg = 0;
        System.out.println("Please enter 10 numbers: ");
        int count = 1;
        while (count<=10) {
            System.out.print("Enter number "+count+": ");
            number = inputRef.nextInt();
            sum+=number;
            values = values+String.valueOf(number)+" ";
            count++;
        }
        avg = sum/10;
        System.out.println("\nThe numbers you entered are: \n" + values);
        
        System.out.println("\nSum of the numbers : "+sum);
        System.out.println("Average of the numbers: "+avg);
        inputRef.close();
    }
}
