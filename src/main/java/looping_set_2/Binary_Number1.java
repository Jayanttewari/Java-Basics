//46. convert a binary number into a decimal number using math function.
//Test Data :
//Input the binary number :1010100
//Expected Output :
//The Binary Number : 1010100
//The equivalent Decimal Number is : 84
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Binary_Number1 {
    public static void main(String args[]) {
        int n1, n;
        int dec = 0, i = 0, j, d;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("\n\nConvert Binary to Decimal:\n ");
            System.out.println("-------------------------");


            System.out.print("Input  the binary number :");
            n = Integer.parseInt(sc.next());
            n1 = n;
            if (n < 0) {
                throw new IllegalArgumentException();

            }
        }catch(Exception e){
            System.out.println("Enter valid input");

            System.out.print("\n\nConvert Binary to Decimal:\n ");
            System.out.println("-------------------------");


            System.out.print("Input  the binary number :");
            n = Integer.parseInt(sc.next());
            n1 = n;
        }
        while(n != 0) {
            d = n % 10;
            dec = (int)(dec + d * Math.pow(2, i));
            n = n / 10;
            i++;
        }
        System.out.println("\nThe Binary Number : " + n1 + "\nThe equivalent Decimal  Number is : " + dec + "\n");
    }
}