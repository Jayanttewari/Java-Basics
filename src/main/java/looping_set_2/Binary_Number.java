//42. convert a binary number into a decimal number without using array, function and while loop.
//Test Data :
//Input a binary number :1010101
//Expected Output :
//The Binary Number : 1010101
//The equivalent Decimal Number : 85
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Binary_Number {
    public static void main(String[] args)
    {
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        //using scanner
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input a binary number: ");
            //binary number digit
            binaryNumber = Integer.parseInt(sc.next());
            if (binaryNumber < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input a binary number: ");
            binaryNumber = Integer.parseInt(sc.next());
        }

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
