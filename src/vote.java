import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        } else
        {
            System.out.println("You are not eligible to vote");
        }

    }
}
