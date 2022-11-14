//54. convert an octal number into binary.
//Test Data :
//Input an octal number (using digit 0 - 7) :57
//Expected Output :
//The Octal Number : 57
//The equivalent Binary Number : 101111
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Convert_Octal_Binary {
    public static void main(String[] args)
    {
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num, tempoctal_num, binary_num, place;
        int rem;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input any octal number: ");
            octal_num = Integer.parseInt(sc.next());
            tempoctal_num = octal_num;
            binary_num = 0;
            place = 1;
            if (tempoctal_num < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input any octal number: ");
            octal_num = Integer.parseInt(sc.next());
            tempoctal_num = octal_num;
            binary_num = 0;
            place = 1;
        }
        while (tempoctal_num != 0)
        {
            rem = (int)(tempoctal_num % 10);
            binary_num = octal_numvalues[rem] * place + binary_num;
            tempoctal_num /= 10;
            place *= 1000;
        }
        System.out.print("Equivalent binary number: " + binary_num+"\n");
    }
}
