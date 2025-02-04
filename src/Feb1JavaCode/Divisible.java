package Feb1JavaCode;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        if(num%5==0){
            if(num%11==0){
                System.out.println("number divisible by both 5 and 11");
            }
            else{
                System.out.println("number divisible by only 5");
            }
        }
        else {
            if (num%11==0){
                System.out.println("number divisible by only 11");
            }
            else{
                System.out.println("number not divisible by both 5 and 11");
            }
        }

    }
}
