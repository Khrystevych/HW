import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: " + sum);


        Scanner c = new Scanner(System.in);
        System.out.print("Enter word 1: ");
        String myString1 = c.next();
        System.out.print("Enter word 2: ");
        String myString2 = c.next();
        int word1 = myString1.length();
        int word2 = myString2.length();
        int length = word1 + word2;
        System.out.println("Sum of two words lengths: " + length);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Number > 0");
        } else {
            System.out.println("Number<0");
        }
    }

}