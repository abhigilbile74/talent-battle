package Day6;

import java.util.Scanner;

public class set {
    public static void printSubarrays(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) { // Start
        for (int j = i; j < numbers.length; j++) { // End
            System.out.print("[");
            for (int k = i; k <= j; k++) { // Print
                System.out.print(numbers[k] + (k == j ? "" : ", "));
            }
            System.out.println("]");
        }
    }
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int p1 = s.nextInt(),p2 = s.nextInt(),p3 = s.nextInt(),q = s.nextInt(),e =
        // s.nextInt(),r = s.nextInt() ;
        // 30 26 28 14 345 43 126 246

        // System.out.println(((e-r)-p1-p2-p3+2*q)/3+p3+p1-q);
        // System.out.println((e-r)-p1-p2-p3+2*q);

        // String str =null;
        // System.out.println(str.charAt(0));
        int[] arr = {1,2,3,4};
        printSubarrays(arr);

        int num = 0;
        // int[] arr = new int[10];
        try {
            System.out.println(12 / num);
            arr[10]=10;

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        } finally {
            /*
             * Note : there are some cases whrn a finally block does not excute
             * use of system.exit() method
             * An exception occurs in the finally block
             * the death of a thread
             */
            System.out.println("it is finally");
        }
    }

}
