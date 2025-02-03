package Jan31JavaCode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.nextLine();
        String rev = "";
        int l = num.length();
        for (l = l - 1; l >= 0; l--) {
            rev = rev + num.charAt(l);
            System.out.println(rev);
        }
        if (rev.equals(num)) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }
    }
}
