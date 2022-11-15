//59. check Armstrong number of n digits.
//Test Data :
//Input an integer : 1634
//Expected Output :
//1634 is an Armstrong number
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Check_Armstrong_Number {
    public static void main(String[] args) {

        int originalNum, digit, cubeSum = 0,num;
        Scanner sc = new Scanner(System. in );
        // checking the Armstrong Number
        try {
            System.out.println("Enter the number:");
            num = Integer.parseInt(sc.next());
            originalNum = num;
            if (cubeSum < 0) {
                throw new IllegalArgumentException();
            }
            //Enter the number
        }catch(Exception e){
            System.out.println("Enter valid number");
            System.out.println("Enter the number:");
            num = Integer.parseInt(sc.next());
            originalNum = num;
        }

        while (num!= 0)
        {
            digit = num % 10;
            cubeSum += Math.pow(digit, 3);
            num /= 10;
        }

        if(cubeSum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
}