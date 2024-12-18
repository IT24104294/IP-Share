import java.util.Scanner;
public class IT24104294Lab08Q1b {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers: ");
        // Store user input numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number "+i+": ");
            int num = inputRef.nextInt();
            myArray[i-1] = num;
        }
        // Print Element OF Array
        System.out.println("\nmyArray Contents: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println("");
        // Find Even NUmbers
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            int num = myArray[i];
            if (num%2==0) {
                evenArray[index] = num;
                index++;
            }
        }
        // print Even Numbers
        System.out.println("\nevenArray Contents: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i]+" ");
        }
        inputRef.close();
    }
}
