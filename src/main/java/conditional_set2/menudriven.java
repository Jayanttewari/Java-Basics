package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class menudriven {
    public static void main(String[] args) {
        try {

            int choice, r, l, w, b, h;
            float area = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input 1 for area of circle");
            System.out.println("Input 2 for area of rectangle");
            System.out.println("Input 3 for area of triangle");
            System.out.print("Input your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input radious of the circle : ");
                    r = sc.nextInt();
                    area = (float) (3.14 * r * r);
                    break;
                case 2:
                    System.out.print("Input length and width of the rectangle : ");
                    l = sc.nextInt();
                    w = sc.nextInt();
                    area = l * w;
                    break;
                case 3:
                    System.out.print("Input the base and hight of the triangle :");
                    b = sc.nextInt();
                    h = sc.nextInt();
                    area = (float) (.5 * b * h);
                    break;
            }
            System.out.printf("The area is : %f", area);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}