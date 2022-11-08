package Practice.src.main.java.conditional;
import java.util.*;

public class EquilsoScalene {
    public static void main(String[] args) {
        double side1, side2, side3;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three side triangle");
            side1 = sc.nextDouble();
            side2 = sc.nextDouble();
            side3 = sc.nextDouble();
            if (side1 == side2 && side2 == side3) {
                System.out.println("equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("isosceles triangle");
            } else {
                System.out.println("scalene triangle");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
