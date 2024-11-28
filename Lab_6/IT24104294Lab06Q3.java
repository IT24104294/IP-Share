import java.util.Scanner;

public class IT24104294Lab06Q3 {
    public static void main(String[] args) {
        // Step 1: Get the squares of all the values
        // Step 2: Calculate the average of the obtained squares
        // Step 3: Finally, take the square root of the average

        Scanner inputRef = new Scanner(System.in);
        double meanOfSquares, rms;

        double sumOfSquares = 0;

        System.out.println("Enter Positive Integer(Terminate  input with -99)");

        System.out.print("Enter a number: ");
        int number = inputRef.nextInt();

        int i = 1;
        while (true) {
            if (number==-99){
                break;
            }
            if (number > 0) {
                sumOfSquares += Math.pow(number, 2);
                System.out.print("Enter a number: ");
                number = inputRef.nextInt();
                i = i + 1;
            }else{ 
                System.out.println("Plaease enter a positive integer or -99 to terminate");
                System.out.print("Enter a number: ");
                number = inputRef.nextInt();
            }
        }
        meanOfSquares = sumOfSquares/(i-1);
        rms  = Math.sqrt(meanOfSquares);

        System.out.println("\nThe Root Mean Square (RMS) is: "+ rms);
        inputRef.close();
    }
}