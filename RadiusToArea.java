import java.util.Scanner;
public class RadiusToArea
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Radius to Area Calculator");
        System.out.println("-------------------------");
        System.out.println("Input the circle's radius.");
        double r = sc.nextDouble();
        double a = Math.pow(r, 2) * Math.PI;
        System.out.println("The Area of this circle is: " + a); 
        
    }
}
