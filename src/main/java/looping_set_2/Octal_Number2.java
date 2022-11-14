//51. convert an octal number to a decimal without using an array.
//Test Data :
//Input an octal number (using digit 0 - 7) :745
//Expected Output :
//The Octal Number : 745
//The equivalent Decimal Number : 485
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Octal_Number2 {
    public static void main(String[] args)
    {
        long octal_num, decimal_num = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input any octal number: ");
            octal_num = Integer.parseInt(sc.next());
            if (octal_num < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
        System.out.println("Enter valid Input");
        System.out.print("Input any octal number: ");
        octal_num = Integer.parseInt(sc.next());
    }
        while (octal_num != 0)
        {
            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
            octal_num = octal_num / 10;
        }
        System.out.print("Equivalent decimal number: " + decimal_num+"\n");
    }
}
