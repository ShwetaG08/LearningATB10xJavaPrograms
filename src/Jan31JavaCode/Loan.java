package Jan31JavaCode;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter Salary");
        int sal= sc.nextInt();
        System.out.println("Enter Credit score");
        int credit=sc.nextInt();

        if(age<0 || age<18 || age>80 ){
            System.out.println("Enter age greater than 0 and more than 18 and less that 80");
        }
        else{
            if (sal<0 || sal <30000){
                System.out.println("Enter sal more than 30000");
            }
            else if (credit<0 || credit<650 || credit>850 ){
                System.out.println("Enter valid credit score");
            }
            else {
                System.out.println("eligible for loan");
            }
        }

    }
}
