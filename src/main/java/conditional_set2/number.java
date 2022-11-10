package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number");
            int input = in.nextInt();
            if (input > 0) {
                System.out.println("number is positive");
            } else if (input < 0) {
                System.out.println("number is negative");
            } else {
                System.out.println("number is zero");
            }
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}
