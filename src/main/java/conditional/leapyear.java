package Practice;
import java.io.*;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        int year =0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("pls Enter your number:-");
            year = sc.nextInt();
        } catch (Exception e){
            System.out.println("pls Enter a valid input");
        }
        if(year<=0){
            System.out.println("pls enter a postive number");
        }
        if((year%400==0)
                ||((year%4==0) && (year%100!=0))){

            System.out.println(year+ ":leap year");
        }
        else{
            System.out.println(": Non leap year" +year);
        }
    }
}
