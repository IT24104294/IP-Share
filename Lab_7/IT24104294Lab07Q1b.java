import java.util.Scanner;;

public class IT24104294Lab07Q1b {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student "+student);
            double avg;
            int totalMark = 0;
            String grade = "";

            System.out.print("Enter marks : ");
            int mark1 = inputRef.nextInt();
            int mark2 = inputRef.nextInt();
            int mark3 = inputRef.nextInt();
            int mark4 = inputRef.nextInt();

            totalMark = mark1+mark2+mark3+mark4;
            avg = (double)totalMark / 4;
            System.out.println("\nAverage is : " + avg);

            if (avg > 75) {
                grade = "Distintction";
            } else if (avg > 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade Is: " + grade+"\n");
        }
        inputRef.close();
    }
}
