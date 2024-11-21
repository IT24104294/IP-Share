import java.util.Scanner;

public class IT24104294Lab5Q2 {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        String prize = "";
        System.out.print("Enter the number of members introduced: ");
        int numOfMembers = inputRef.nextInt();
        if (numOfMembers >= 0) {
            switch (numOfMembers) {
                case 0:
                    prize = "none";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umberalla";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    ;
                    prize = "Headphone";
                    break;
            }
            if (prize != "none") {
                System.out.print("\nPrize is a: " + prize);
            } else {
                System.out.print("No Prize");
            }
        } else {
            System.out.print("Input must be a number 0 or greater");
        }
        inputRef.close();
    }
}
