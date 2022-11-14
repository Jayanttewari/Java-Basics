package Practice.src.main.java.looping;
import java.util.Scanner;
public class Display_Natural_Number {
    public static void main(String[] args) {
        int i, n, sum = 0;
        {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Input number: ");
                n = Integer.parseInt(sc.next());
                if (n <= 0) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Enter valid input");
                System.out.print("Input number: ");
                n = Integer.parseInt(sc.next());
            }
            System.out.println("The first n natural numbers are : " + n);

            for (i = 1; i <= n; i++) {
                System.out.println(i);
                sum += i;
            }
            System.out.println("The Sum of Natural Number upto " + n + " terms : " + sum);

        }
    }
}