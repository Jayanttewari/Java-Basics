package Practice;
import java.io.*;
import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        int age=0;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter your age");
            age = scan.nextInt();
        }catch(Exception e){
            System.out.println("please enter a valid input");
        }
        if(age>=18)
        {
            System.out.println("you are eligible for voting");
        }
        else
        {
            System.out.println("you are not eligible for vote");
        }
    }
}
