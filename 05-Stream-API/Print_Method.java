import java.util.Arrays;
import java.util.List;

class Print_Method{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,5,6,8,4,3);

        // 1. using normall for loop 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // 2. using Enhanced for loop 
        for(int i : list){
            System.out.println(i);
        }

        // 3. using for eachh loop 
        list.forEach(n->System.out.println(n)); // list m each time n mila rha ab us n ka kya krna h ( ye khne ka mltb h is loop ka ).
    }
}