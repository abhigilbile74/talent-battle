package Day7;

import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k= s.nextInt(), x = s.nextInt();

        if(n<5 && n!=0 && n>0){
            System.out.println("Candies want user "+ n);
            int r= x-n;
            System.out.println("Candies is Remaining "+( r));
            x= r+n;
        }else {
            System.out.println("Invalid Output");
            System.out.println("Candies is Remaining "+( x));
        }     
    }
    
}
