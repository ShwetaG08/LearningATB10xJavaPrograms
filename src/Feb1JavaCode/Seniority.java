package Feb1JavaCode;

import java.util.Scanner;

public class Seniority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        Seniority s = new Seniority();
        String sen = s.Senior(age);
        System.out.println(sen);
    }

    public String Senior(int age) {
        if (age > 0 && age <= 12) {
            return "Child";
        } else if (age > 12 && age <= 19) {
            return "teenager";
        } else if (age > 20 && age <= 64) {
            return "Adult";
        } else {
            return "Senior citizen";
        }

    }
}