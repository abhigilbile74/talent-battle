

import java.util.Scanner;

public class path {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int m = s.nextInt(),  n = s.nextInt();

        int[][] arr = new int[m][n];
        
        for(int i = 0; i<n;i++ ){
            arr[0][i] = 1;
        }
        for(int i = 0 ;i<m;i++){
            arr[i][0]= 1;
        }

        for (int i = 1; i < m; i++) {
            for(int j =1 ;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];

            }   
        }
        System.out.println(arr[m-1][n-1]);
        System.out.println("Matrix");
        for (int i = 0; i < m; i++) {
            for(int j =0 ;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}
