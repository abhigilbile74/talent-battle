package Day2;

import java.util.Scanner;

public class Areaa {
    public static float costOfPaint(int iw,int ow, float surfaceArea){

        // for (int i = 0; i < array.length; i++) {
            
        // }
        if(surfaceArea==0){
            int innerCost = iw *18;
            int OuterCost = ow * 12;
            return (float) innerCost+OuterCost;
        }else{
            int innerCost = iw *18;
            int OuterCost = ow * 12;
            float total = innerCost+OuterCost;
            return (float) surfaceArea * total;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a interior wall ");
        int iw =  scan.nextInt();
        System.out.println("Enter a outerior wall ");
        int ow =  scan.nextInt();
        System.out.println("Enter Surfacr Area ");
        float surfaceArea = scan.nextInt();
        // System.out.println("Total Estimate Cost:"+ costOfPaint(iw, ow, surfaceArea)+" INR");
        System.out.printf("Total Estimate Cost:%.1f", costOfPaint(iw, ow, surfaceArea));
        System.out.println("INR");
    }
    
}
