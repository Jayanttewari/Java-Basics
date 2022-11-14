//56. Check Whether a Number can be Express as Sum of Two Prime Numbers.
//Test Data :
//Input a positive integer: 16
//Expected Output :
//16 = 3 + 13
//16 = 5 + 11
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Sum_Two_Prime_Number {
    public static void main(String[] args) {
        int num, temp1, temp2, ctr = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input the number:");
            num = Integer.parseInt(sc.next());
            if (num < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.println("input the number:");
            num = Integer.parseInt(sc.next());
        }
        for(int i = 2; i <= num / 2; i++) {
            temp1 = i;
            temp2 = num - i;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    ctr++;
                    break;
                }
            }
            if(ctr == 0) {
                for(int j = 2; j <= (num - i) / 2; j++) {
                    if((num - i) % j == 0) {
                        ctr++;
                        break;
                    }
                }
                if(ctr == 0) {
                    System.out.print(num + " can be written as " + i + " + " + (num - i) + ".\n ");
                }
            }
            ctr = 0;
        }
    }
}