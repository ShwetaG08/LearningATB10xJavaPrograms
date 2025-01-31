package Jan30JavaCode;

import java.util.Scanner;

public class smallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of i/p");
        int numofinp= sc.nextInt();
        smallest s= new smallest();
        
        if(numofinp==2){
            System.out.println("Enter the 2 numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int a = s.s2(num1,num2);
        System.out.println("smallest number is "+a);
    }
else {
            System.out.println("Enter the 3 numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int b = s.s3(num1, num2, num3);
    System.out.println("smallest number is " + b);
    //   s.smallest3();
}
}
    public int s2(int num1, int num2) {
        int smallestNum = 0;
        if (num1 < num2) {
            smallestNum = num1;
        } else {
            smallestNum = num2;
        }
        return smallestNum;
    }

 public int s3(int num1, int num2, int num3) {

            int smallestnum = 0;
            if(num1<num2 && num1<num3){
                return smallestnum= num1;
            }
            else if(num2<num3 && num2<num1){
                return smallestnum= num2;
            }
            else {
                return smallestnum=num3;
            }

        }


    }


