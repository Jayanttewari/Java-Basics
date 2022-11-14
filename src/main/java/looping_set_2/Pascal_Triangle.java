//33. display Pascal's triangle.
// Test Data :
//Input number of rows: 5
//Expected Output :
//
//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Pascal_Triangle {
    public static void main(String[] args)
    {
        int no_row,c=1,blk,i,j;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of rows: ");
            no_row = Integer.parseInt(sc.next());
            if (no_row<0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input number of rows: ");
            no_row = Integer.parseInt(sc.next());
        }
        for(i=0;i<no_row;i++)
        {
            for(blk=1;blk<=no_row-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}