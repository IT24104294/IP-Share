import java.util.Scanner;
public class IT24104294Lab4Q2{
	public static void main(String args[]){
	Scanner inputRef = new Scanner(System.in);

	System.out.print("Please enter exam marks (out of 100): ");
	int exam_mark = inputRef.nextInt();
	if (exam_mark<=100 && exam_mark >= 0){
		exam_mark = exam_mark;
	}else{
		System.out.println("Invalid input for exam marks. Terminating Program.");
		return;
	}

	System.out.print("Please enter lab marks (out of 100): ");
	int lab_mark = inputRef.nextInt();
	if (lab_mark<=100 && lab_mark >= 0){
		lab_mark = lab_mark;
	}else{
		System.out.println("Invalid input for lab marks. Terminating Program.");
		return;
	}

	System.out.print("Please enter precentage given for the exam: ");
	double exam_precentage = inputRef.nextDouble();

	System.out.print("Please enter precentage given for the lab: ");
	double lab_precentage = inputRef.nextDouble();

	if (lab_precentage+exam_precentage!=100){
		System.out.println("The precentage must add up to 100. Terminating Program.");
		return;
	}
	double _exam = exam_mark*(exam_precentage/100);
	double _lab = lab_mark*(lab_precentage/100);

	double final_mark = _exam+_lab;

	System.out.println("\nFinal exam mark is: "+ final_mark);
	}
}