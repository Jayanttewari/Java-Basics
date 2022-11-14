//44. find LCM of any two numbers using HCF.
//Test Data :
//Input 1st number for LCM: 15
//Input 2nd number for LCM: 20
//Expected Output :
//The LCM of 15 and 20 is : 60
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class LCM {
        public static void main(String[] args)
        {
            //Take input from the user
            //Create an instance of the Scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            int lcm = (num1 > num2) ? num1 : num2;
            // Always true
            while(true)
            {
                if( lcm % num1 == 0 && lcm % num2 == 0 )
                {
                    System.out.printf("The LCM of "+num1+" and "+num2+" is "+lcm);
                    break;
                }
                ++lcm;
            }
        }
    }



