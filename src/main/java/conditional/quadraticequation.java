package Practice;
import javax.management.MBeanAttributeInfo;
import java.util.Scanner;
public class quadraticequation {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the value of a:");
            double a = input.nextDouble();
            System.out.println("enter the value of b:");
            double b = input.nextDouble();
            System.out.println("enter the value of c");
            double c = input.nextDouble();
            double d = b * b - 4.0 * a * c;
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("The roots are" + r1 + "and" + r2);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is" + r1);
            } else {
                System.out.println("roots are imaginery");
            }
        } catch (Exception e) {
            System.out.println("no solution");
        }



    }
}



