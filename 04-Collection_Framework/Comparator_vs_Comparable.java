/*
        Comparator vs Comparable use hota h for sorting in Collection framework.
        
        Comparable= to sort using single value 

        Comparator=> make class for on which you want to sort 
*/

import java.util.*;

class Student implements Comparable<Student>{
    int age ; 
    String name;

    Student(int age , String name){
        this.age=age;
        this.name=name;
    }


    public String toString() {
        return "Student [age=" + age + ", name=" + name +"]";
    }


    // jis basic pe sort krnaa ho wo  likho 
    public int compareTo(Student o) {
        return this.age -o.age;
    }

    
    


}
public class Comparator_vs_Comparable {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student(10,"Piyush"));
        list.add(new Student(14,"ayush"));
        list.add(new Student(16,"Ram"));
        list.add(new Student(20,"Saumya"));
        list.add(new Student(18,"Ritesh"));

        // sort this ( this cant sort becoz it confused on which bases it sort)

        //comparable
        Collections.sort(list);
        System.out.println(list);
        
    }
}
