package Feb1JavaCode;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter days");
        int day=sc.nextInt();
        int year=day/365;
        int rem= day%365;
        int month= rem/30;
        int days=rem%30;
        System.out.println("it is "+year+ " years, "+month +("months, ") +days+ (" days"));
    }
}
