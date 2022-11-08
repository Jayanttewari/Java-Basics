package Practice;
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        int m=0;
        try {
            Scanner Scan = new Scanner(System.in);
            System.out.println("enter the height");
            m = Scan.nextInt();
        }catch(Exception e){
            System.out.println("please enter a valid input");
        }
        if(m>135)
        {
            System.out.println("the person is tall ");
        }
        else
        {
            System.out.println("the person is dwarf");
        }
    }
}
