package Day5;


class  A {
    void display(){
        System.out.println("From class A");
    }  
}

class  B extends A {
    void display(){
        System.out.println("From class B");
        super.display();
    }  
}
 class  C extends B {
    void display(){
        super.display();
        System.out.println("From class C");
    }  
}
public class oop {
    public static void main(String[] args) {
        C c =new C();
        c.display();     
    }
    
}
