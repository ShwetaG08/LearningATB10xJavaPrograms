package Jan31JavaCode;

import java.util.Scanner;

public class VisaStatus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the status");
        String status = sc.next();
        VisaStatus vs= new VisaStatus();
        boolean s=vs.VS(age,status);
        if(s){
            System.out.println("eligible to travel");
        }
        else{
            System.out.println("Not eligible to travel");
        }
    }

    public boolean VS(int age, String status){
        boolean st= false;
        if(age>=18) {
            if (status.equalsIgnoreCase("valid")) {
                st = true;
            } else if (status.equalsIgnoreCase("Invalid")) {
                st = false;

            }

        }
        else if(age<18){
            System.out.println("Enter age more than 18");
        }

        return st;
    }
}
