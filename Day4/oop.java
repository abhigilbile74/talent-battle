package Day4;

class demo {
    private demo(){
        System.out.println("this private constructor");
    }
    public static void instatnceMethod(){
        demo obj = new demo();
    }

   
}

public class oop {
     public static void main(String[] args) {
        demo.instatnceMethod();
       
       
    }    
}
   
    



/*
integer default value is 0 
public private default  protected --> inherentence 
getter setter 

if the no sperfier mention like public deafult then is by deafult is default 

whenver the cldss create it is automatically call the reference  default constructor 

*/
