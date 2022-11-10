package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        int m, n;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number");
            m = s.nextInt();
            System.out.println("Enter the second number");
            n = s.nextInt();
            if (m == n) {
                System.out.println(m + "and" + n + "are equal");
            } else {
                System.out.println(m + "and" + n + "are equal");
            }
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}
