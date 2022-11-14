//38. check whether a number is a palindrome or not.
//Test Data :
//Input a number: 121
//Expected Output :
//121 is a palindrome number.
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String args[])
    {
        int n;
        int sum = 0, r;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input a number: ");
             n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input a number: ");
             n = Integer.parseInt(sc.next());
        }
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
}