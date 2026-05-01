
/*
        ParallelStream in Java is a type of stream which used to compute data parallely.

                                    or 

        A Parallel Stream in Java is a type of stream that processes elements in parallel using multiple threads.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,5,6,8,4,3);

        Stream<Integer> ans=list.parallelStream()
                    .filter(n-> n >2)
                    .sorted();

        ans.forEach(n->System.out.print(n+" "));
    }
}
