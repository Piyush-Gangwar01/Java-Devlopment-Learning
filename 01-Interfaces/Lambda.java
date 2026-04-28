/* lambda function ki help se apko obj k andar method create krne ki zarurat nhi h 
    --> lambda work only with functional Interface

*/

@FunctionalInterface
interface  A {

    void show(int i , int j);
}
public class Lambda {
    public static void main(String[] args) {

        // we cannot make obj of interface so extends a class 

        // if we dont want to extend with class use directly in obj 


        A obj =new A(){
               public  void show(){
                    System.out.println(" this is from A "); // without lambda function
                }
        };
        obj.show();

        A obj=()-> System.out.println(" this is from A ");  // with lambda expression 
        obj.show();


        // you can pass on values also 
        
        A  obj=(int i , int j)-> System.out.println(" this is "+ i +" cland "+ j);
        obj.show(5, 8);
        
    }
    
}