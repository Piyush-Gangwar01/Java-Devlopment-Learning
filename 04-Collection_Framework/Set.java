import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        // -->set store unique value 
        // --> it is unodered
        HashSet<Integer> set=new HashSet<>();
        set.add(4);
        set.add(8);
        set.add(13);
        set.add(76);
        set.add(2);

        
        
        //to get sorted in set Use Treeset
        Collection<Integer> set=new TreeSet<>(); or TreeSet<Integer> set=new TreeSet<>(); // both are same 
        set.add(4);
        set.add(8);
        set.add(13);
        set.add(76);
        set.add(2);

        //set has many method 
        System.out.println(set.size());
        System.out.println(set.contains(8));
        
        // itereate with for loop 
        for (int i : set){
            System.out.println(i);
        }


    }
}
