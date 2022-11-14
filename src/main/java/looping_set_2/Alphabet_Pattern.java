//40. display the pattern like pyramid using the alphabet.
//
//        A
//      A B A
//    A B C B A
//  A B C D C B A
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Alphabet_Pattern {
    public static void main(String args[]) {
        byte alph = 'A';
        int n;
        int k = 1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input the number of Letters (less than 26) in the Pyramid : ");
            n = Integer.parseInt(sc.next());
            if (k < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input the number of Letters (less than 26) in the Pyramid : ");
            n = Integer.parseInt(sc.next());
        }

        for(int i = 1; i <= n; i++) {
            for(int blk = 1; blk <= n - i; blk++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= k / 2; j++) {
                System.out.print(((char)Byte.toUnsignedInt(alph++)) + " ");
            }

            alph = (byte)(alph - 2);

            for(int j = 0; j < k / 2; j++) {
                System.out.print(((char)Byte.toUnsignedInt(alph--)) + " ");
            }
            k = k + 2;
            alph = 'A';
            System.out.println();
        }
    }
}