package Day3;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
// import java.*;

public class Solution {

    public static double magic(int num1, int num2){
        // test cases 328 and 3  ans 651
        double result =0;
        int power =0;
        while (num1!=0) {
            int digit =  num1%10;
            int newDigit = (digit+num2)%10;
            result += newDigit * Math.pow(10, power);
            power++;
            num1/=10; 
            
        }
        return result;
    }

    public static int isPalindrome(char[] str ,int length){
        int left =0 ;
        int right = length-1;
        
        while (left<right) {
            if(str[left] == str[right]){
                left++;
                right--;
            }else{
               return 0;
            }
            
        }
        return 1;
       // deed 383
        
    }
    
    public static String charcterString(String str){
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upperCount++;
            }else{
                lowerCount++;
            }   
        }
        if(upperCount <= lowerCount){
            return  str.toLowerCase();
        }else{
         return str.toUpperCase();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();
        // System.out.println(magic(num1, num2));
        
        // System.out.println("Enter a length of String");
        // int length = scan.nextInt();
        // System.out.println("Enter  String");
        // String str = scan.next();
        
        // System.out.println(isPalindrome(str.toCharArray(),length));

        System.out.println("Enter a String to user want if uppercas or lowercasw ");
        
        String str = scan.next()
        System.out.println(charcterString(str));


        
        
    }
    
}
