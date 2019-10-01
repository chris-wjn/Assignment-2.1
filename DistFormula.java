import java.util.Scanner;
public class DistFormula
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.println("Input the x coordinate of point 1.");
        double x1 = sc.nextDouble();
        System.out.println("Input the y coordinate of point 1.");
        double y1 = sc.nextDouble();
        System.out.println("Input the x coordinate of point 2.");
        double x2 = sc.nextDouble();
        System.out.println("Input the y coordinate of point 2.");
        double y2 = sc.nextDouble();
        
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between these two points is: " + distance);
    }
}
