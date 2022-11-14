//36. display the such a pattern for n number of rows using a number which will start with the number 1 and the first and a last number of each row will be 1.
//
//1
//121
//12321
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Display_Pattern {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        for(int i = 0; i <= n; i++) {
            /* print blank spaces */
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            /* Display number in ascending order upto middle*/
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            /* Display  number in reverse order after middle */
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}