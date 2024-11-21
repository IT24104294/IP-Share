import java.util.Scanner;
public class IT24104294Lab03Q3{
	public static void main(String[] args){
		int amount = 0;
		int count5000 = 0;
		int count1000 = 0;
		int count500 = 0;
		int count200 = 0;
		int count100 = 0;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Rupee amount: ");
		amount = input.nextInt();
		input.close();

		count5000 = amount/5000; // 5000
		amount = amount%5000;

		count1000 = amount/1000; // 1000
		amount = amount%1000;

		count500 = amount/500; // 500
		amount = amount%500;

		count200 = amount/200; // 200
		amount = amount%200;

		count100 = amount/100; // 100
		amount = amount%100;

		count50 = amount/50; // 50
		amount = amount%50;

		count20 = amount/20; // 20
		amount = amount%20;

		count10 = amount/10; // 10
		amount = amount%10;

		count5 = amount/5; // 5
		amount = amount%5;

		count2 = amount/2; // 2
		amount = amount%2;

		count1 = amount/1; // 1
		amount = amount%1;

		System.out.println("");

		System.out.println("5000 Notes - "+ count5000);
		System.out.println("1000 Notes - "+ count1000);
		System.out.println("500 Notes - "+ count500);
		System.out.println("200 Notes - "+ count200);
		System.out.println("100 Notes - "+ count100);
		System.out.println("50 Notes - "+ count50);
		System.out.println("20 Notes - "+ count20);
		System.out.println("10 Coins - "+ count10);
		System.out.println("05 Coins - "+ count5);
		System.out.println("02 Coins - "+ count2);
		System.out.println("01 Coins - "+ count1);
	}
}