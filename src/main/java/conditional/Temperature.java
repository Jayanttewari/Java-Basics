package Practice;
import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the temperature");
            int temp = sc.nextInt();
            String s = "";
            if (temp < 0)
                s = "freezing weather";
            else if (temp <= 10)
                s = "very cold weather";
            else if (temp >= 10 && temp <= 20)
                s = "cold weather";
            else if (temp >= 20 && temp <= 30)
                s = "normal";
            else if (temp >= 30 && temp <= 40)
                s = "Hot";
            else if (temp >= 40)
                s = "very Hot";
            System.out.println(s);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}






