public class IT24104294Lab2Q1{
    public static void main(String[] args){
        // perimeter = 2*(len+(len*3/4))
        // 100 = 2(len+0.75len)
        // 100 = 2len+1.50len
        // 100 = 3.5len

        // perimeter = 3.5len
        // len = perimeter/3.5
        // len = perimeter/perimeterCoefficient
        int perimeter = 100;

        double width_ratio = 0.75;
        double perimeterCoefficient = 3.5;
        
        double len = perimeter/perimeterCoefficient;
        double width = len*width_ratio;
        System.out.println("Length of fence: "+ len);
        System.out.println("Width of fence: "+ width);
    }
}