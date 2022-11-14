package Practice.src.main.java.looping;
import java.util.Scanner;
//cube integer
public class Cube_Integer {
        public static void main(String[] args)

        {
            int i,n;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Input number of terms : ");
                n =Integer.parseInt( sc.next());
                if(n<0)
                {
                    throw new IllegalArgumentException();
                }

            }catch(Exception e)
            {
                System.out.println("\n"+"Please,Enter valid input");
                System.out.print("Input number of terms : ");
                n =Integer.parseInt( sc.next());
            }
            for(i=1;i<=n;i++)
            {
                System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
            }
        }
    }

