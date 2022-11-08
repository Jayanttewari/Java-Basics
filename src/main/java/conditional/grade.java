package Practice;
import java.util.*;
public class grade {


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the grade");
            String grade = sc.nextLine();
            switch (grade) {
                case "E":
                    System.out.println("Excellent");
                    break;
                case "V":
                    System.out.println("Very good");
                    break;
                case "G":
                    System.out.println("Good");
                    break;
                case "A":
                    System.out.println("Average");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
