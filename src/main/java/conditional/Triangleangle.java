package Practice;

public class Triangleangle {
    public static int Valid(int a,int b,int c){

        if(a+b+c==180 && a!=0 && b!=0 && c!=0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int a=40,b=55,c=65;
        if((Valid(a,b,c))==1)
        System.out.print("valid");
else
        System.out.print("invalid");

    }
}
