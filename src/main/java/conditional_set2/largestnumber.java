package Practice.src.main.java.conditional_set2;
import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the first number: ");
            int num1 = in.nextInt();
            System.out.println("Input the second number");
            int num2 = in.nextInt();
            System.out.println("Input the third number");
            int num3 = in.nextInt();
            if (num1 > num2)
                if (num1 > num3)
                    System.out.println("The greatest: " + num1);
            if (num2 > num1)
                if (num2 > num3)
                    System.out.println("The greatest: " + num2);
            if (num3 > num1)
                if (num3 > num2)
                    System.out.println("The greatest: " + num3);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}