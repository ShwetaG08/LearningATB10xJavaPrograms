package Jan29JavaCode;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        float num = sc.nextFloat();
                if (num<=0) {
            System.out.println("Please enter number more than 0");
        }
        if(num>0) {
            float n = num%2;
            System.out.println(n);
                if (num % 2 == 0) {
                    System.out.println("Number is even");
                } else {
                    System.out.println("Number is odd");
                }
            }
        }
    }

