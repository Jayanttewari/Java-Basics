//50. convert a decimal number into octal without using an array.
//Test Data :
//Enter a number to convert : 79
//Expected Output :
//The Octal of 79 is 117.
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Octal_Number {
    public static void main(String args[])
    {
        int dec_num, rem, quot, i=1, j;
        int oct_num[] = new int[100];
        //convert a decimal number into octal without using an array
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input a Decimal Number: ");
            dec_num = Integer.parseInt(sc.next());

            quot = dec_num;
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            //
            //Take input from the user
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input a Decimal Number: ");
            dec_num = Integer.parseInt(sc.next());

            quot = dec_num;
        }

        while(quot != 0)
        {
            oct_num[i++] = quot%8;
            quot = quot/8;
        }

        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct_num[j]);
        }
        System.out.print("\n");
    }
}
