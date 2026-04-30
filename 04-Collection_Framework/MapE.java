
/*
    map is used to store data in key value pair.
*/

import java.util.*;

public class MapE {
    
    public static void main(String[] args) {
        
        Map<String,Integer> map=new HashMap<>();
        map.put("Piyush", 20);
        map.put("Ayush", 14);
        map.put("Ram", 16);
        map.put("Ritesh", 18);

        // to get all key 
        System.out.println(map.keySet());

        // to get key and value both 

        for(String key : map.keySet()){
            System.out.println(key+ " : "+map.get(key));
        }
    }
}
