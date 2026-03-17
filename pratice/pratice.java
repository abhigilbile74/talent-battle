
package pratice;

import java.util.HashMap;
import java.util.Scanner;

public class pratice {
    static Scanner s = new Scanner(System.in);

    public static void Alphabet() {
        System.out.println("Check the alphabet vowels are constant");
        if ("aioueAIOUE".contains(s.next())) {
            System.out.println("Is vowels");
        } else {
            System.out.println("Is constant");
        }
    }

    public static void Largest() {
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest Number " + result);
    }

    public static void Roots() {
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int D = b ^ 2 - 4 * a * c;
        double root1 = 0;
        double root2 = 0;

        if (D > 0) {
            root1 = -b + Math.sqrt(D) / 2 * a;
            root2 = -b - Math.sqrt(D) / 2 * a;
            System.out.println(root1 + " " + root2);
        } else if (D == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println(root1);
        } else {
            double realPart = -b / (2 * a);
            double imgPart = Math.sqrt(-D) / 2 * a;
            System.out.println(realPart + " " + imgPart);
        }
    }

    public static void stringFrequency() {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer val = map.get(ch);
            if (val == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, val + 1);
            }
        }
        System.out.println(map);
    }

    // Check a Character Alphabet ar not
    public static void checkAlphabet(){
        // CHECKING FOR ALPHABET
        char input_char =  s.next().charAt(0);
        if ((input_char >= 65 && input_char <= 90)
            || (input_char >= 97 && input_char <= 122))
            System.out.println(" Alphabet ");

        // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");

        // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println(" Special Character ");
    }
    // Function to calculate GCD using the Euclidean algorithm
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM using the GCD formula
    public static long lcm() {
        long a = s.nextLong() ,b = s.nextLong();
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        // Alphabet();
        // Largest();
        // Roots();
        // stringFrequency();
        String str = "Hi am  a   Abhishek I a currently  solve a DSA          problem.     ";
        System.out.println(str);
        // str.trim() is a Java String method used to remove whitespace from the
        // beginning and end of a string.
        // trim() does not remove spaces between words
        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s", ""));

        double num = 12.34567;
        int n = 2;

        double result = Math.round(num * Math.pow(10, n)) / Math.pow(10, n);

        System.out.println(result);

        // checkAlphabet();
        System.out.println("LCM "+lcm());
        System.out.println("GCD "+gcd(12,24));

    }
}