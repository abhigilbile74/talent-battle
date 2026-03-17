package Day5;

import java.util.Scanner;

public class maxtwod {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int r =  s.nextInt(), c =s.nextInt();
        int[][] arr = new int[r][c];

        for(int i =0 ; i< arr.length ; i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] =  s.nextInt();
            }
        }
        int j = 0;
        int max = arr[0][0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i][j] > max){
                max = arr[i][j];
            }else{
                System.out.print(arr[i][j]+" ");
            }
            j++;
        }
    }

    
} 
