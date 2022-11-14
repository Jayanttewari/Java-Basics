//32. determine whether a given number is prime or not.
// Test Data :
//Input a number: 13
//Expected Output :
//13 is a prime number.
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args)
    {
        int count=0;
        int n=0;
        try {
            System.out.println("Enter Number:");
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }catch(Exception e)
        {
            System.out.println("Invalid Input");
            System.out.println("Please,enter valid Input");
            System.out.print("Enter the number you want to check:");
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("the number is prime number");
        }
        else
        {
            System.out.println("the number is not prime number");

        }
    }

}