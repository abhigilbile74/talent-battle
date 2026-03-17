import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    
    public static void findAcolourOfChessborad(){ // the logic is start as first a1 box as black
        System.out.println("Enter the Character in the format of 'a1','a2','b2'");
        String s = scan.nextLine();
        int chNum = 'a' - s.charAt(0);
        int num = s.charAt(1);

       
        if((chNum+num)%2==0){
            System.out.println("White");

        }else{
            System.out.println("Black");
        }

    }

     public static void main(String[] args) {
        // findAcolourOfChessborad();
        
        


        String s = "6dbcbca2";
        char lastChar =  s.charAt(s.length()-1);
        int k = Character.getNumericValue(lastChar);
        StringBuilder str  = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            char ch  = s.charAt(i);
            int count = 0;

            for(int j =1 ;j<s.length();j++){
                if(s.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                str.append(ch);
            }
        }
        
        if (k <= str.length()) {
            System.out.println(str.charAt(k - 1));
        } else {
            System.out.println(-1);
        }
        
        
     }
}


// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// class Main {

//     public static String distinctChar(String[] arr, int k) {
//         // 1. Map to store the frequency of each string
//         Map<String, Integer> frequencyMap = new HashMap<>();

//         // Fill the map: count occurrences of every string
//         for (String s : arr) {
//             frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
//         }

//         // 2. Iterate through the ORIGINAL array to maintain order
//         int uniqueCounter = 0; // Tracks how many unique strings we've found
        
//         for (String s : arr) {
//             // Check if this string appeared exactly once
//             if (frequencyMap.get(s) == 1) {
//                 uniqueCounter++;
                
//                 // If this is the kth unique string, return it immediately
//                 if (uniqueCounter == k) {
//                     return s;
//                 }
//             }
//         }

//         // If we finish the loop and haven't found the kth unique string
//         return "-1";
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Reading N
//         if (!scanner.hasNextInt()) return;
//         int n = scanner.nextInt();
        
//         // Reading the N strings
//         String[] arr = new String[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.next();
//         }

//         // Reading k
//         int k = scanner.nextInt();

//         // Call the logic and print the result
//         String result = distinctChar(arr, k);
//         System.out.println(result);
        
//         scanner.close();
//     }
// }