//43. find HCF (Highest Common Factor) of two numbers.
//Test Data :
//Input 1st number for HCF: 24
//Input 2nd number for HCF: 28
//Expected Output :
//HCF of 24 and 28 is : 4
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        int a, b, i, hcf = 0;
        //HCF of two number
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number :: ");
            a = Integer.parseInt(sc.next());
            System.out.println("Enter second number :: ");
            b = Integer.parseInt(sc.next());
            if (b < 0) {
                throw new IllegalArgumentException();
            }
            //Enter the input
            //Take input from the user
            //Create an instance of the Scanner class
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.println("Enter first number :: ");
            a = Integer.parseInt(sc.next());
            System.out.println("Enter second number :: ");
            b = Integer.parseInt(sc.next());
        }

        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::"+hcf);
    }
}