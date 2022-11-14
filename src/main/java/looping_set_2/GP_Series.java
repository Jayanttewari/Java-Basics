//52. find the Sum of GP series.
//Test Data :
//Input the first number of the G.P. series: 3
//Input the number or terms in the G.P. series: 5
//Input the common ratio of G.P. series: 2
//Expected Output :
//The numbers for the G.P. series:
//3.000000 6.000000 12.000000 24.000000 48.000000
//The Sum of the G.P. series : 93.000000
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class GP_Series {
    public static void main(String args[]) {
        float g1, cr, i, n;
        float ntrm, gpn;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n\n Find the Sum of GP series.:\n ");
            System.out.println("-------------------------");

            System.out.print("Input the first number of the G.P. series: ");
            g1 = Integer.parseInt(sc.next());

            System.out.print("Input the number or terms in the G.P. series: ");
            ntrm = Integer.parseInt(sc.next());

            System.out.print("Input the common ratio of G.P. series: ");
            cr = Integer.parseInt(sc.next());

            /*-------- generate G.P. series ---------------*/
            System.out.print("\nThe numbers for the G.P. series:\n ");
            System.out.printf("%f ", g1);
            sum = g1;
            if (ntrm < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("\n\n Find the Sum of GP series.:\n ");
            System.out.println("-------------------------");

            System.out.print("Input the first number of the G.P. series: ");
            g1 = Integer.parseInt(sc.next());

            System.out.print("Input the number or terms in the G.P. series: ");
            ntrm = Integer.parseInt(sc.next());

            System.out.print("Input the common ratio of G.P. series: ");
            cr = Integer.parseInt(sc.next());

            /*-------- generate G.P. series ---------------*/
            System.out.print("\nThe numbers for the G.P. series:\n ");
            System.out.printf("%f ", g1);
            sum = g1;


        }

        for(float j = 1; j < ntrm; j++) {
            gpn = (float)(g1 * Math.pow(cr, j));
            sum = sum + gpn;
            System.out.printf("%f  ", gpn);
        }
        /*-------- End of G.P. series generate ---------------*/
        System.out.printf("\nThe Sum of the G.P. series : %f\n\n", sum);
    }
}