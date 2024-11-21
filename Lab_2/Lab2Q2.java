public class IT24104294Lab2Q2{
    public static void main(String[] args){
        // C = 2pi.R
        int perimeter = 40;
        double pi = 3.14;
        double radius;
        // 40 = 2pi.r
        // 40/2pi = r
        // radius = 40/2pi
        radius = perimeter/(2*pi);
        System.out.println("Radius of circular fence: "+ radius);
    }
}