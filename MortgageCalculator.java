import java.util.Scanner;
public class MortgageCalculator
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mortgage Calculator");
        System.out.println("-------------------");
        System.out.println("Input principle amount");
        double p = sc.nextDouble();
        System.out.println("Input rate (%)");
        double r = sc.nextDouble();
        System.out.println("Input time (in years)");
        double t = sc.nextDouble();
        
        double amount = Math.pow((1 + (r/100)), t) * p;
        System.out.println("The final amount is: " + amount);
    }
}
