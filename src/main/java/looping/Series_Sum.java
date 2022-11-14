//21. display the sum of the series [ 9 + 99 + 999 + 9999 ...].
//Test Data :
//Input the number or terms :5
//Expected Output :
//9 99 999 9999 99999
//The sum of the saries = 111105
package Practice.src.main.java.looping;
import java.util.Scanner;
public class Series_Sum {
    public static void main(String[] args) {
        long n,i,t=9;
        int sum =0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" Input number of terms: ");
            n = Integer.parseInt(sc.next());

            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }catch(Exception e){
            System.out.println("Please enter valid Input::");
            n = Integer.parseInt(sc.next());
        }
        for (i=1;i<=n;i++)
        {
            t=t*10+9;
            sum +=t;
            System.out.print(t+" ");
        }
        System.out.println("\nThe sum of the series"+"\n" +sum);
    }
}