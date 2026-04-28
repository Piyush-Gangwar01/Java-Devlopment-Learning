@FunctionalInterface
interface  A {

    int add(int i , int j);
}
public class Lambda_with_return {
    public static void main(String[] args) {
        A obj=(i,j)-> i+j;
        int res=obj.add(5, 7);
        System.out.println(res);
        
    }
}
