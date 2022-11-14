//34. find the prime numbers within a range of numbers.
//Test Data :
//Input starting number of range: 1
//Input ending number of range : 50
//Expected Output :
//The prime number between 1 and 50 are :
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Prime_Number_Range {
    public static void main(String args[]) {
        int j,n,k;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input starting number of range: ");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input starting number of range: ");
            n = Integer.parseInt(sc.next());
        }

        System.out.print("Input ending number of range : ");
        k = sc.nextInt();
        System.out.println("The prime numbers between " + n + " and " + k + " are : ");

        for(int num = n; num <= k; num++) {
            j = 0;

            for(int i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    j++;
                    break;
                }
            }

            if(j == 0 && num != 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}