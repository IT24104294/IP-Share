import java.util.Scanner;;
public class IT24104294Lab07Q1a{
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        double avg;
        int totalMark = 0;
        String grade = "";
        System.out.println("Enter marks for four subjects:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter subject mark "+i+": ");
            int mark = inputRef.nextInt();
            totalMark = totalMark+mark;
        }
        avg = totalMark/4;
        System.out.println("\nAverage is : "+avg);
        if (avg>75) {
            grade = "Distintction";
        }else if (avg>50){
            grade = "Credit";
        }else{
            grade = "Fail";
        }
        System.out.println("Overall Grade Is: "+ grade);
        inputRef.close();
    }
}