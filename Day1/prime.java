package Day1;

public class prime {
    public static int choc(int n , int len){
        int sum = n;
        for (int i = 2; i <= len; i++) {
            int prev =  sum-1;
            sum = sum + prev;         
        }
        return sum;

    }

    public static void main(String [] args){
        int n =4 ;
        int len  = 0;
        // System.out.println(choc(n, len)); //25


        for (int i = 0; i < 5; i++) {
            if(i>2){
                continue;
            }
            if(i>4){
                break;
            }
            System.out.println(i);
            
        }
        first:
        for(int i =1 ;i<5;i++){
            second:
            for(int j =1;j<3;j++){
                System.out.println(i+" "+j);
                if(i==2){
                    break first;
                }
            }
        }

        for (int i = 1; i <=10; i++) {
            if(i>4 && i<9){
                continue;
            }
            System.out.println(i);
            
        }

    }
}