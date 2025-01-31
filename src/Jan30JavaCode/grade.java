package Jan30JavaCode;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if (0 > marks || marks > 100) {
            System.out.println("enter marks between 0 to 100");
        } else {
            if (marks >= 90 && marks <= 100) {
                System.out.println("You have Grade A");
            } else if (marks >= 80 && marks <= 89) {
                System.out.println("You have Grade B");
            } else if (marks >= 70 && marks <= 79) {
                System.out.println("You have Grade C");
            } else if (marks >= 60 && marks <= 69) {
                System.out.println("You have Grade D");
            } else if (marks >= 50 && marks <= 59) {
                System.out.println("You have Grade E");
            } else if (marks >= 40 && marks <= 49) {
                System.out.println("You have Grade F");
            } else if (marks < 40) {
                System.out.println("You have Failed");
            }

        }

    }
}

