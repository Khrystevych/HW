public class Main {

    static void max(String a, String b, String c) {
        int word1 = a.length();
        int word2 = b.length();
        int word3 = c.length();
        if (word1 > word2 && word1 > word3) {
            System.out.println("The longest word - " + a);
        } else if (word2 > word1 && word2 > word3) {
            System.out.println("The longest word - " + b);
        } else {
            System.out.println("The longest word - " + c);
        }
    }

    public static void main(String[] args) {
        max("world", "hold", "on");

        Month str = new Month();


        for (int i = 1; i <= 5; i++) {
            for (int k = i; k >= 1; k--) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = i; k <= 4; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
        }

    }
