package Practice.src.main.java.conditional;
import java.util.*;
public class DemoTranslation {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        String roll_no = sc.nextLine();
        String name = sc.nextLine();
        float total = 0;
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            total = total + x;
        }
        System.out.println("Total marks is" + total);
        float p = (total / 300) * 100;
        System.out.println("percentage is" + p + ("%"));
        if (total >= 40) {
            System.out.println("first division");
        } else {
            System.out.println("second division");
        }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}



