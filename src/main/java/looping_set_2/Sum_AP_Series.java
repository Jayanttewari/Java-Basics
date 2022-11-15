//49. find out the sum of an A.P. series.
//Test Data :
//Input the starting number of the A.P. series: 1
//Input the number of items for the A.P. series: 10
//Input the common difference of A.P. series: 4
//Expected Output :
//The Sum of the A.P. series are :
//1 + 5 + 9 + 13 + 17 + 21 + 25 + 29 + 33 + 37 = 190
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Sum_AP_Series {
    public static void main(String args[]) {
        int n1, df, n2, ln;
        int s1 = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n\n  Find out the sum of A.P. series :\n ");
            System.out.println("----------------------------------------");

           //"Input  the starting number of the A.P. series:
            System.out.print("Input  the starting number of the A.P. series: ");
            n1 = Integer.parseInt(sc.next());

            System.out.print("Input the number of items for  the A.P. series: ");
            n2 = Integer.parseInt(sc.next());

            System.out.print("Input  the common difference of A.P. series: ");
            df = Integer.parseInt(sc.next());
           //The Sum of the  A.P. series are
            s1 = (n2 * (2 * n1 + (n2 - 1) * df)) / 2;
            ln = n1 + (n2 - 1) * df;
            System.out.println("\nThe Sum of the  A.P. series are : ");
            if (ln <= 0) {
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("Enter valid Input");
            System.out.print("\n\n  Find out the sum of A.P. series :\n ");
            System.out.println("----------------------------------------");


            System.out.print("Input  the starting number of the A.P. series: ");
            n1 = Integer.parseInt(sc.next());

            System.out.print("Input the number of items for  the A.P. series: ");
            n2 = Integer.parseInt(sc.next());

            System.out.print("Input  the common difference of A.P. series: ");
            df = Integer.parseInt(sc.next());
            s1 = (n2 * (2 * n1 + (n2 - 1) * df)) / 2;
            ln = n1 + (n2 - 1) * df;
            System.out.println("\nThe Sum of the  A.P. series are : ");
        }

        for (int i = n1; i <= ln; i = i + df) {
            if (i != ln) {
                System.out.print(i + " + ");
            } else {
                System.out.println(i + " = " + s1 + " \n");
            }
        }
    }
}