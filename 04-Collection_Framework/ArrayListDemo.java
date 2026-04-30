import java.util.*;
import java.util.Collection;
import java.util.Iterator;

class ArrayListDemo{
    public static void main(String[] args) {
        // Collection Interface have arrlist

        Collection<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(13);
        list.add(76);
        list.add(2);

        // to tarverse we have 2 method 
        // 1. using Itrator

        Iterator<Integer> values=list.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

        // 2. using for loop 

        for(int i: list){
            System.out.println(i);
        }


    }
}