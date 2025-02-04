package Jan31JavaCode;

import java.util.Scanner;

public class NetSal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter basic pay");
            int basic=sc.nextInt();
        System.out.println("Enter hra");
        int hra=sc.nextInt();
        System.out.println("Enter tax deduction");
        int tax=sc.nextInt();
        System.out.println("enter DA");
        int da=sc.nextInt();
        NetSal ns=new NetSal();
        double sal= ns.Sal(basic,hra,tax,da);
        System.out.println("Salary is "+sal);
    }
    public double Sal(int basic, int hra, int tax, int da){
        double salary= (hra+(0.5*basic)+da)-tax;

        return salary;
    }
}
