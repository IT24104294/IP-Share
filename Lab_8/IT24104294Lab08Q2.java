public class IT24104294Lab08Q2 {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30, 40, 50 };
        int[] B = { 34, 67, 12, 89, 12 };
        int[] C = new int[5];

        // Find Sum OF A and B
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print Element Of A Array
        System.out.println("\nA Array Contents: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");

        // Print Element Of B Array
        System.out.println("\nB Array Contents: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("");

        // Print Element Of C Array
        System.out.println("\nC Array Contents (A + B)");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("");
    }
}
