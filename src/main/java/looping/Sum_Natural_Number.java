package Practice.src.main.java.looping;
import java.util.Scanner;
public class Sum_Natural_Number {
    public static void main(String[] args) {
        int num = 0, i, sum = 0;
//object of Scanner class
        Scanner sc = new Scanner(System.in);

        try {
           // System.out.println("Enter the num :");
          //  num = Integer.parseInt(sc.next());
            System.out.print("Sum from: ");
//takes an integer as input
            i = Integer.parseInt(sc.next());
            System.out.print("Sum up to: ");
//takes an integer as input
            num = Integer.parseInt(sc.next());
            if (num <= 0) {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            System.out.println("Enter valid input");
            System.out.print("Sum from: ");
//takes an integer as input
            i = Integer.parseInt(sc.next());
            System.out.print("Sum up to: ");
//takes an integer as input
            num = Integer.parseInt(sc.next());
        }

            while (i <= num) {
//adding the value of i into sum variable
                sum = sum + i;
//increments the value of i by 1
                i++;
            }
//prints the sum
        System.out.println("Sum of Natural Numbers = " + sum);
    }
}