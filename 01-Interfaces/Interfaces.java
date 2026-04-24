interface Car{
    int age=44;
    String name="Piyush";   // Interface variables are public, static, final by default.
    void start();
    void color();
}
class A implements Car{  // A class can implement multiple interfaces.

    public void start() {  // Interface methods are public and abstract by default.
        System.out.println(" car started...");
    }

    public void color() {
        System.out.println(" blue car");
    }
    
}
public class Interfaces {
    public static void main(String[] args) {
        
        A obj=new A();
        obj.start();        
        obj.color();
        System.out.println(A.name);
    }
    
}
/* 
    An interface in Java is a blueprint of a class that tells what methods a class must have, but not how they work.

    --> imp points 
    *A class uses the keyword implements to use an interface.



    class - interface => impliment
    interface - interface => extends 
    class - class  => extends

    why do we need interfaces ?
        We need interfaces in Java to define rules that different classes must follow.

        Simple Explanation

        An interface tells a class what methods it must implement, but not how to implement them.
 */
