package Day6;

import java.util.Scanner;

public class numberClass {

    public static int alpha(String str){
        if(str == null){
            return 0;
        }
        int sum = 0;
        for(int i =0 ; i<str.length();i++){
            switch (str.charAt(i)) {
                case 'A':
                    sum += 1;
                    break;
                case 'B':
                    sum += 10;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 1000;
                    break;
                case 'E':
                    sum += 10000;
                    break;
                case 'F':
                    sum += 100000;
                    break;
                case 'G':
                    sum += 100000;
                    break; 
                default:
                    sum =0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter a A to G alphabet");
        // String str = s.nextLine();

        // System.out.println(alpha(str));

    }
}
