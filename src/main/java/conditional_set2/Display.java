package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        int m, n;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("input the value of m:");
            m = sc.nextInt();
            if (m > 0) {
                n = 1;
            } else {
                n = -1;
            }
            System.out.println("The value of m: " + m + "");
            System.out.println("The value of n: " + n + "");
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}