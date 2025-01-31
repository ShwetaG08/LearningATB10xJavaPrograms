package Jan30JavaCode;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int bal = 10000;
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        if (amt > bal) {
            System.out.println("Insufficient Balance");
        }
        else if (amt <= 0) {
            System.out.println("Enter valid amount");
        }

        if (amt<bal && amt>0) {
            if (amt % 100 == 0) {
                System.out.println(amt + " deducted");
                int newbal = bal - amt;
                System.out.println("Updated balance is " + newbal);
            } else {
                System.out.println("Enter in multiples of 100");
            }
        }
    }
}
