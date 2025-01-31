package Jan30JavaCode;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leap l = new Leap();
        int year = 0;
        System.out.println("Enter the year");
        year = sc.nextInt();
        boolean b= l.leapyr(year);
        if(b==true){
            System.out.println(year +" is a leap year");
        }
        else {
            System.out.println(year +" is not a leap year");

        }

    }

    public boolean leapyr(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            return year%400==0;
        } else {
            return true;
        }
    }
}


