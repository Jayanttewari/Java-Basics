package Practice.src.main.java.looping;
import java.util.Scanner;
//6. display the multiplication table of a given integer.
//Test Data :
//Input the number (Table to be calculated) : 15
//Expected Output :
//15 X 1 = 15
//...
//...
//15 X 10 = 150
        //
public class Multiplication_Table {

    public static void main(String[] args)
    {
        int j,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number(Table to be calculated): ");
        try {
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }catch(Exception e)
        {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of terms : "+"\n");
            n =Integer.parseInt( sc.next());
        }
        for(j=1;j<=10;j++)

            System.out.println(n+" X "+j+" = " +n*j);

    }
}