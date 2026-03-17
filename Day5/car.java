package Day5;

import java.util.Scanner;

public class car {
    static Scanner s = new Scanner(System.in);
    public static void tyre(){
        int n = s.nextInt();
        int[][] arr =  new int[n][2];
        for(int i =0 ; i<n;i++){
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            int result = arr[i][0]*4 + arr[i][1]*2;
            System.out.println(result);
        }
    }
    public static void tyreO(){
        int n = s.nextInt();
        int[] car1 =  new int[n];
        int[] bike =  new int[n];
        for(int i =0 ; i<n;i++){
            car1[i] = s.nextInt();
            bike[i] = s.nextInt();
        }
        for(int i = 0; i<n;i++){
            int result =  4*car1[i] + 2* bike[i];
            System.out.println(result);
        }
    }
    
    public static void main(String[] args) {
        // tyre();
        tyreO();
    }
    
}
