//41. convert a decimal number into binary without using an array.
//Test Data :
//Input a decimal number: 25
//Binary number equivalent to said decimal number is: 0000000000000000000000000001 1001
package Practice.src.main.java.looping_set_2;

 class ge {
    // Function that convert Decimal to binary
    public void decToBinary(int n)
    {
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}

class  Decimal_Number_Array {
    // driver code
    public static void main(String[] args)
    {
        ge g = new ge();
        int n = 32;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        g.decToBinary(n);
    }
}