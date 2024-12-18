import java.util.Scanner;
public class IT24104294Lab08Q1a {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Enter 5 Numbers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number "+i+": ");
            int num = inputRef.nextInt();
            myArray[i-1] = num;
        }

        System.out.println("\nArray in Reverse Order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i]+" ");
        }

        inputRef.close();
    }
}