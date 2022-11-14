//57. print a string in reverse order.
//Test Data :
//Input a string to reverse : Welcome
//Expected Output :
//Reversed string is: emocleW
package Practice.src.main.java.looping_set_2;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
