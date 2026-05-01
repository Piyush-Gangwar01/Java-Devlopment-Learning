/*  
    Map, Filter, Reduce, and Sorted these all are the method provided by Stream.

    --> stream ko hum sirf one time use kr skte h.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map_Filter_Reduce_and_Sorted {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,5,6,8,4,3);

        Stream<Integer> s1= list.stream();  // means list ab stream s1 m aagyi h ispe koi opration perform kro original list pe koi fark nhi pdega 
        Stream<Integer> s2=s1.filter(n->n >3);



        // you can apply stream this way on list or arr 
        int ans=list.stream()
            .filter(n->n >3) // n should be even                              [ filter -> return boolean]
            .map(n->n*n)        // uska square kro                            [ map- > return values ]
            .reduce(0,(c,e)->c+e); // un saare square ko add kr do   [ reduce -> reduce single value]

        System.out.println(ans);
    }
}
