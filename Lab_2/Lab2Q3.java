public class IT24104294Lab2Q3 {
    public static void main(String[] args) {
        // hypotenuse(c^2) = a^2+b^2
        // c^2 = a^2+b^2
        // c = sqrt(a^2+b^2)
        int sideA = 3;
        int sideB = 4;
        double sideC = Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));
        System.out.println("Length of hypotenuse: "+sideC);
    }
}