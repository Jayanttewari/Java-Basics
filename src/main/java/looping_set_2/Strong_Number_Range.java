//48. find Strong Numbers within a range of numbers.
//Test Data :
//Input starting range of number : 1
//Input ending range of number: 200
//Expected Output :
//The Strong numbers are :
//1 2 145
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Strong_Number_Range {
        public static void main(String args[]) {
            int n, n1, s1 = 0, en, sn;
            long fact;
            Scanner sc = new Scanner(System.in);
            System.out.print("\n\n  Find Strong Numbers within an range of numbers:\n ");
            System.out.println("------------------------------------------------------");

            /* If sum of factorial of digits is equal to original number then it is Strong number */

            System.out.print("Input starting range of number : ");
            sn = sc.nextInt();
            System.out.print("Input ending range of number: ");
            en = sc.nextInt();
            System.out.println("\n\nThe Strong numbers are :");

            for(int k = sn; k <= en; k++) {
                n1 = k;
                s1 = 0;

                for(int j = k; j > 0; j = j / 10) {
                    fact = 1;
                    for(int i = 1; i <= j % 10; i++) {
                        fact = fact * i;
                    }
                    s1 = (int)(s1 + fact);
                }

                if(s1 == n1) {
                    System.out.print(n1 + "  ");
                }
            }
            System.out.println("\n");
        }
    }

