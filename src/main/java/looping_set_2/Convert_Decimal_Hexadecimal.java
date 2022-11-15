//55. convert a decimal number to hexadecimal.
//Test Data :
//Input any Decimal number: 79
//Expected Output :
//The equivalent Hexadecimal Number : 4F
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Convert_Decimal_Hexadecimal {
    public static void main(String args[])
    {
        int dec_num, rem;
        String hexdec_num="";

        /* hexadecimal number digits */

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner sc = new Scanner(System.in);
        //convert the decimal number to hexadecimal number
        try {
            System.out.print("Input a decimal number: ");
            dec_num = Integer.parseInt(sc.next());
            if (dec_num < 0) {
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input a decimal number: ");
            dec_num = Integer.parseInt(sc.next());
        }
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");
    }
}
