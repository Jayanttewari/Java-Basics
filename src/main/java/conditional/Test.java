package Practice;


import java.io.*;

class Test {
    static String checkPosNeg(int x)
    {
        if(x>0)
            return "positive";
        else if (x<0)
            return "negative";
            else
                return "zero";
        }
        public static void main(String args[])
        {
            int firstNumber=15;
            System.out.println(firstNumber + "is"+ checkPosNeg(firstNumber));
        }
    }

