//26. find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
//Test Data :
//Input the number of terms : 5
//Expected Output :
//1 + 11 + 111 + 1111 + 11111
//The Sum is : 12345
package Practice.src.main.java.looping;
import java.util.Scanner;
public class Series_Same_Number {
    public static void main(String[] args) {

        int n,i;
        long sum=0;
        long  t=1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input the number of terms : ");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid input");
            System.out.println("Input the number of terms : ");
            n = Integer.parseInt(sc.next());
        }
        for(i=1;i<=n;i++)
        {
            System.out.print(" "+t);
            if (i<n)
            {
                System.out.print(" + ");

            }
            sum=sum+t;
            t=(t*10)+1;
        }
        System.out.println("\nThe Sum is : "+ sum);

    }
}