package Jan31JavaCode;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the units");
        float unit = sc.nextFloat();

        if(unit<=100){
            double bill=unit * 0.50;
            System.out.println("bill is "+bill);
        } else if (unit>100 && unit<=200) {
            double bill=unit * 0.75;
            System.out.println("bill is "+bill);
                    }
        else if(unit>200 && unit<=300){
            double bill=unit * 1.20;
            System.out.println("bill is "+bill);
        }
        else {
            double bill=unit * 1.50;
            System.out.println("bill is "+bill);
        }
    }
}
