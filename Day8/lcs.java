import java.util.Scanner;

public class lcs {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();   
        }
    }

    public static int longString(String str1,String str2){
        int l1 = str1.length()+1, l2 = str2.length()+1;
        int[][] dp = new int[l1][l2];
        printArray(dp);
        
        for (int i = 1; i <l1; i++) {
            for(int j = 1 ; j <l2 ; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }   
        }
        
        return dp[l1-1][l2-1];
    }

    public static void slidingWindow(){
        int[] arr = {5,4,4,6,3,1};
        int k =2;
        int wsum= 0;
        for (int i = 1; i < arr.length; i++) {
            int currsum = arr[i]+arr[i-1];
            wsum =Math.max(wsum, currsum);   
        }
        System.out.println(wsum);
    }
    
    // Kadane Algorthim 
        public static void Kadane(){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3}; //3 1 =2+5 7-3 =4 
        int wsum= 0; 
        for (int i : arr) {
            wsum += i;
            if(wsum<0){
                wsum = 0;
            }
        }
        System.out.println("Kadane subarray sum "+  wsum);
    }
    // Tortosie - Haier Algorthim slow-fast pointer 

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // String str1 =  s.nextLine();
        // String str2 =  s.nextLine();
        // System.out.println(longString(str1, str2));
        // slidingWindow();
        Kadane();
   
    }
}
