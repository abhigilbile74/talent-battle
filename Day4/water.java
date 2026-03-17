 package Day4;

import java.util.Scanner;

public class water { 
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int N = s.nextInt(), M = s.nextInt(), R = s.nextInt(), IS=0, OS=0;
        int[] income = new int[N];
        System.out.println("Enter a incoming capcity");
        for (int i : income) {
            income[i] = s.nextInt();
            IS+=income[i];
        } 
        int[] outgoing = new int[M];
        System.out.println("Enter a outgoing capcity");
        for (int i : outgoing) {
            outgoing[i] = s.nextInt();
            OS+=outgoing[i];
        } 
        int res = OS - IS;
        
        if (res!=0){
            if (res>0)
            res+=R;
            else
            res-=R;
            System.out.println("Output" + res);}
        else{
            System.out.println("Balanced");}
    }

    
} 
