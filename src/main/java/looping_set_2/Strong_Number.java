//47. check whether a number is a Strong Number or not.
//Test Data :
//Input a number to check whether it is Strong number: 15
//Expected Output :
//15 is not a Strong number.
package Practice.src.main.java.looping_set_2;
import java.util.*;
public class Strong_Number {
    public static void main(String[] args) {
        int n,i;
        int fact,rem;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nEnter the number : ");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("\nEnter the number : ");
            n = Integer.parseInt(sc.next());
        }
        int sum = 0;
        int temp = n;
        while(n != 0)
        {
            i = 1;
            fact = 1;
            rem = n % 10;

            while(i <= rem)
            {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n = n / 10;
        }

        if(sum == temp)
            System.out.println(temp + " is a strong number\n");
        else
            System.out.println(temp + " is not a strong number\n");

        System.out.println();
    }
}