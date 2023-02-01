import java.util.Scanner;

public class Main {
    static int showSomething(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: " + sum);
        return sum;
    }

    static void showSomething(String myString1) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter word: ");
        String myString2 = c.next();
        int word1 = myString1.length();
        int word2 = myString2.length();
        int length = word1 + word2;
        System.out.println("Sum of two words lengths: " + length);
    }

    static boolean showSomething() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Number > 0");
            return true;
        } else {
            System.out.println("Number < 0");
            return false;
        }
    }

    public static void main(String[] args) {
        showSomething(123);
        showSomething("Hello");
        showSomething();
    }
}


