import java.util.Scanner;;
public class IT24104294Lab06Q2b {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        String values = "";
        int number= 0;
        System.out.println("Please enter 10 numbers: ");
        int count = 1;
        while (count<=10) {
            System.out.print("Enter number "+count+": ");
            number = inputRef.nextInt();
            values = values+String.valueOf(number)+" ";
            count++;
        }
        System.out.println("\nThe numbers you entered are: \n" + values);
        
        inputRef.close();
    }
}
