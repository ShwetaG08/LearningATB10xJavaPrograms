package Jan30JavaCode;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n<=1)
        {
            System.out.println("number id not prime");
        } else if (n==2) {
            System.out.println("number is prime");

        }
    }

}
