package Jan30JavaCode;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Enter side 1");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        System.out.println("Enter side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter side 3");
        int side3 = sc.nextInt();
        if(side1+side2> side3 && side2+side3> side1 && side1+side3>side2) {
            System.out.println("The triangle is valid based");
        }
        else{
            System.out.println("This is not a valid triangle");
        }

    }
}
