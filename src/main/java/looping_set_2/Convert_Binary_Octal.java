//53. convert a binary number to octal.
//Test Data :
//Input a binary number :1001
//Expected Output :
//The Binary Number : 1001
//The equivalent Octal Number : 11
package Practice.src.main.java.looping_set_2;
import java.util.*;
public class Convert_Binary_Octal {
    public static void main(String[] args)
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Input a Binary Number : ");
        binnum = Integer.parseInt(sc.next());
        binnum1=binnum;
        if(i<0) {
        throw new IllegalArgumentException();}
        }catch (Exception e){
            System.out.println("Enter valid Input");
            System.out.print("Input a Binary Number : ");
            binnum = Integer.parseInt(sc.next());
            binnum1=binnum;
        }
        while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }

        i=1;
        quot = decnum;

        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.print("\n");

    }
}
