import java.util.Scanner;

public class IT24104294Lab03Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 52345
		System.out.print("Enter a five-digit number: ");
		int value = input.nextInt();
		input.close();
		int digit1 = value / 10000; // 5
		value = value % 10000; // 2345

		int digit2 = value / 1000; // 2
		value = value % 1000; // 345

		int digit3 = value / 100; // 3
		value = value % 100; // 45

		int digit4 = value / 10; // 4
		value = value % 10; // 5

		int digit5 = value / 1; // 5
		value = value % 1;

		System.out.println("");
		System.out.print(digit1 + " ");
		System.out.print(digit2 + " ");
		System.out.print(digit3 + " ");
		System.out.print(digit4 + " ");
		System.out.print(digit5 + " ");
	}
}