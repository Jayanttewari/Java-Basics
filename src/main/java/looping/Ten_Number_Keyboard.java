package Practice.src.main.java.looping;
import java.util.Scanner;
public class Ten_Number_Keyboard {
    public static void main(String[] args) {
        int i, n = 0, s = 0;
        double avg;
        {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Input the 10 numbers : ");
                n = Integer.parseInt(sc.next());

                if(n<0){
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Please enter valid input");
                System.out.println("Input the 10 numbers : ");
                n = Integer.parseInt(sc.next());
            }
            for (i = 0; i < 10; i++) {
                n = Integer.parseInt(sc.next());
                s +=n;
            }
            avg = s / 10;
            System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);

        }
    }
}