package Day4;

import java.util.Scanner;

public class Solution {
    // (min + 59) % 60 give me upper bound
    /*
     * Enter a first hour rate
     * 20
     * 4
     * Remaining hour rate
     * 40
     * Total time to travel
     * 300
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first hour rate");
        int r1 = scan.nextInt();
        int n = scan.nextInt();
        System.out.println("Remaining hour rate");
        int r2 = scan.nextInt();
        System.out.println("Total time to travel");
        int min = scan.nextInt();

        int hour = (min + 59) % 60;

        System.out.println(n * r1); 
        int result = (n * r1) + (hour - n) * r2;
        System.out.println(result);

    }

}
