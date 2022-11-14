//30. find the Armstrong number for a given range of number.
//Test Data :
//Input starting number of range: 1
//Input ending number of range : 1000
//Expected Output :
//Armstrong numbers in given range are: 1 153 370 371 407
package Practice.src.main.java.looping;
import java.util.Scanner;
public class Armstrong_Range {
    public static void main(String[] args) {
        int num,r,sum,temp;
        int stno = 0,enno = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input starting number of range: ");
            stno = Integer.parseInt(sc.next());

            System.out.println("Input ending number of range : ");
            enno = Integer.parseInt(sc.next());
            if(stno<0)
            {
                System.out.println("Please,enter valid number");
                System.out.println("Input starting number of range: ");
                stno = Integer.parseInt(sc.next());

                System.out.println("Input ending number of range : ");
                enno = Integer.parseInt(sc.next());
            }
        }catch(Exception e){

            System.out.println("Please,enter valid number");
            System.out.println("Input starting number of range: ");
            stno = Integer.parseInt(sc.next());

            System.out.println("Input ending number of range : ");
            enno = Integer.parseInt(sc.next());

        }
        System.out.println("Armstrong numbers in given range are: ");
        for(num=stno;num<=enno;num++){
            temp=num;
            sum = 0;

            while(temp!=0){
                r=temp % 10;
                temp=temp/10;
                sum=sum+(r*r*r);
            }
            if(sum==num)
                System.out.print(" "+num);
        }

    }
}