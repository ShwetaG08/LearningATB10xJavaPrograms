import javax.imageio.stream.ImageInputStream;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Maximum {
        public void max3 ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the num1");
            int num1 = sc.nextInt();
            System.out.println("enter the num2");
            int num2 = sc.nextInt();
            System.out.println("enter the num3");
            int num3 = sc.nextInt();
            if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("enter 3 different numbers");
            } else {
                if (num1 > num2 && num1 > num3) {
                    System.out.println(num1 + "is greatest");
                } else if (num2 > num1 && num2 > num3) {
                    System.out.println(num2 + "is greatest");
                } else {
                    System.out.println(num3 + "is greatest");
                }
            }
        }

        public void max2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the num1");
            int num1 = sc.nextInt();
            System.out.println("enter the num2");
            int num2 = sc.nextInt();
            if (num1 == num2) {
                System.out.println("enter 2 different numbers");
            } else {
                if (num1 > num2) {
                    System.out.println(num1 + "is greatest");
                } else {
                    System.out.println(num2 + "is greatest");
                }
            }
        }

    public static void main(String[] args) {

        Maximum m = new Maximum();
        m.max3();
        m.max2();
    }


}
