package Day4;

public class cons {
    cons(int a){
        System.out.println("called first constructor");
    }

    cons(int a, int b){
        System.out.println("called second constructor");
    }
    cons(double a){
        System.out.println("called third constructor");
    }
    public static void main(String[] args) {
        cons c= new cons(0);
        cons c1= new cons(0,2);
        cons c2= new cons(20.0);

        // System.out.println(c);
        // System.out.println(c1);
        // System.out.println(c2);
    }
    
}
