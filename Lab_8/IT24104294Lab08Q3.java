import java.util.Scanner;;
public class IT24104294Lab08Q3{
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        int[] numbers = new int[6];
        
        int count = 1;
        while (count<=6) {
            System.out.print("Enter a positve number ("+count+"/6): ");
            int num = inputRef.nextInt();

            if (num>0) {
                numbers[count-1] = num;
                count++;
            } else {
                System.out.println("ERROR: Please Enter ONLY Positive NUmbers");
            }
        }
        System.out.println("\nArray Content: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max<numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("\nThe Maximum Number Entered: "+max);
        inputRef.close();
    }
}