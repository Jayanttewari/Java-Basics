//31. display the pattern like a diamond.
//
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Diamond_Pattern {
    public static void main(String[] args)
    {
        int i,j,r;
        //using scanner
        Scanner sc = new Scanner(System.in);
        //Input number of rows
        try {
            System.out.print("Input number of rows (half of the diamond) : ");
            r = Integer.parseInt(sc.next());
            if (r < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid input");
            System.out.print("Input number of rows (half of the diamond) : ");
            r = Integer.parseInt(sc.next());
        }
        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=r-1;i>=1;i--)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}