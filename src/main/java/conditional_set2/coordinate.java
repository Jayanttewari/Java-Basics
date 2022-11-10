package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class coordinate {
    public static void main(String[] args) {
        int col1, col2;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the value of X and Y coordinate: ");
            col1 = sc.nextInt();
            col2 = sc.nextInt();
            if (col1 > 0 && col2 > 0) {
                System.out.println("The coordinate point" + col1 + "," + col2 + "lies in first quadrant");
            } else if (col1 < 0 && col2 > 0) {
                System.out.println("The coordinate point" + col1 + "," + col2 + "lies in second quadrant");
            } else if (col1 < 0 && col2 < 0) {
                System.out.println("The coordinate point" + col1 + "," + col2 + "lies in third quadrant");
            } else if (col1 > 0 && col2 < 0) {
                System.out.println("The coordinate point" + col1 + "," + col2 + "lies in fourth quadrant");
            } else if (col1 == 0 && col2 == 0) {
                System.out.println("The coordinate point" + col1 + "," + col2 + "lies at origin");
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}