package Jan31JavaCode;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int ori_num= num;
        int sum= 0;
        int digit= String.valueOf(num).length();

        while (num>0){
            int c = num%10;
            sum+=Math.pow(c,digit);
            num/=10;
        }
        if (sum==ori_num){
            System.out.println("Armstrong digit");
        }
        else{
            System.out.println("Not an Armstrong digit");
        }


    }
}
