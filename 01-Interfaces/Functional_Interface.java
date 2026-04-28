/* 
  funtional Interface / SAM ( single Abstract Method)
     it is basically a interface with one single method 

     

*/
// to define a functinal interface we use 
@FunctionalInterface
interface  A {

    void show();
}
// class B implements A{        
//     public void show(){
//         System.out.println(" this is show of A");
//     }
// }

public class Functional_Interface {
    public static void main(String[] args) {

        // we cannot make obj of interface so extends a class 

        // if we dont want to extend with class use directly in obj 
        A obj =new A(){
               public  void show(){
                    System.out.println(" this is from A ");
                }
        };
        obj.show();
        
    }
    
}
