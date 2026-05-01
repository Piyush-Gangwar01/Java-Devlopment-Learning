/*
    --> used in Stream class 
    --> can have value or null 
    --> used to avoid null point exception
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_class {
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(1,5,6,8,4,3);

        Integer s1 =list.stream()
                            .filter(n-> n>2 && n<8)
                            .findFirst()  // optional k liye ye use hota h .
                            .orElse(-1);

        System.out.println(s1);

    }
}
