package Practice;
import java.util.*;

public class Eligiblity {


    public static void main(String[] args) {


        int p, c, m, t, mp;
        System.out.println("Eligibility Criteria :");
        System.out.println("Marks in Maths >=65");
        System.out.println("and Marks in Phy >=55");
        System.out.println("and Marks in Chem>=50");
        System.out.println("and Total in all three subject >=190");
        System.out.println("or Total in Maths and Physics >=140");
        System.out.println("-------------------------------------");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the marks obtained in Physics :");
            p = sc.nextInt();
            System.out.print("Input the marks obtained in Chemistry :");
            c = sc.nextInt();
            System.out.print("Input the marks obtained in Mathematics :");
            m = sc.nextInt();
            System.out.println("Total marks of Maths, Physics and Chemistry : " + (m + p + c));
            System.out.println("Total marks of Maths and  Physics : " + (m + p));

            if (m >= 65) {
                if (p >= 55) {
                    if (c >= 50) {
                        if (m + p + c >= 190 || m + p >= 140) {
                            System.out.println("The  candidate is eligible for admission.");
                        } else {
                            System.out.println("The candidate is not eligible.");
                        }
                        System.out.println("please enter a valid input");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        }







