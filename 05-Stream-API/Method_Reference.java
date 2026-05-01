/*      
    A Method Reference in Java is a shorter way to call a method using the :: operator instead of writing a lambda expression.

    It is used in functional programming with lambda expressions and the Stream.


    syntax :
    class it belong :: opreation you want 
 */

import java.util.*;

public class Method_Reference {
    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("Piyush","Astha","Navin","Ram");
        
        // this is without Method ref
        List<String> l1=list.stream()   
                        .map(str-> str.toUpperCase())
                        .toList();  // .toList => used to convert into list again



        // after Method Ref
        List<String> l1=list.stream()
                            .map(String::toUpperCase)
                            .toList();

        System.out.println(l1);
    }
}
