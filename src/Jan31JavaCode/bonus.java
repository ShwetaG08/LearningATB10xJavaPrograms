package Jan31JavaCode;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        double sal = sc.nextDouble();
        System.out.println("Enter the Number of years");
        int exp = sc.nextInt();
        bonus b = new bonus();
        double d=b.bonus(exp, sal);
        System.out.println("Bonus is" +d);

    }

    public double bonus(int exp, double sal) {
        double bon = 0;
        if (exp <= 1) {
            bon = 0;
        } else if (exp > 1 && exp <= 3) {
           bon = 0.05 * sal;
        } else if (exp > 3 && exp <= 6) {
             bon = 0.1 * sal;
        } else if (exp > 6) {
             bon = 0.15 * sal;
        }
        return bon;
    }
}

