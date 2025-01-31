import java.util.Scanner;

public class Consonant{

public static void main(String[] args) {
    System.out.println("Enter the character");
    Scanner sc=new Scanner(System.in);
    char ch = sc.next().toLowerCase().charAt(0);

    if (ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){

        System.out.println("Character is a vowel");
    }
    else {
        System.out.println("Character is a consonant");
    }

}
}