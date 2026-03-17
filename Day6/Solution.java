package Day6;

interface A {
     void display(); 
}

interface B  {
     void display();   
} 
class C implements A,B {
    public void display(){
        System.out.println("hello");
    }
    
    // public void show(){
    //     System.out.println("welCome");
    // }
      
}

public class Solution {
    public static void main(String[] args) {
         C c1 = new C();
         c1.display();
        //  c1.show();
        
    }
}