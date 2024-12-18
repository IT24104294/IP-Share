import java.util.Scanner;
public class IT24104294Lab08Q4 {
    public static void main(String[] args) {
        Scanner inputRef = new Scanner(System.in);
        int[] studentsArray = new int[8];


        int count = 0;
        while (count<8) {
            System.out.print("Enter Student ID for Student "+(count+1)+": ");
            int studentID = inputRef.nextInt();
            if (studentID>0) {
                studentsArray[count] = studentID;
                count++;
            }else{
                System.out.println("ERROR: Please Enter ONLY Positive Numbers");
            }
        }
        
        System.out.print("\nEnter a Student ID to Search: ");

        int searchStudentID = inputRef.nextInt();
        boolean isStudentFound = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i]==searchStudentID) {
                isStudentFound = true;
                break;
            }else{
                isStudentFound = false;
            }
        }
        if (isStudentFound) {
            System.out.println("\nStudent Is Available");
        }else{
            System.out.println("\nStudent Is Not Available");
        }
    }
}
