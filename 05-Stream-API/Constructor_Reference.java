/*
        to take values from list and make them object.
*/

import java.util.*;

class car{

    String name;
    int speed;

    public car(String name , int speed) {
            this.name=name;
            this.speed=speed;
    }
    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car [name=" + name + ", speed=" + speed + "]";
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    



    
}
public class Constructor_Reference {
    public static void main(String[] args) {

        List<String> list=Arrays.asList("BMW" , "Audi" , "Mercedes");

        // to add into car 
        List<car> c=new ArrayList<>();

        // 1. using normal for loop 
        for(String str :list){
            c.add(new car(str, 0));
        }
        System.out.println(c);

        
        // 2. using normal stream
        c= list.stream()
                .map(str->new car(str, 0))
                .toList();

        System.out.println(c);


        //3 . using constructor ref
        c= list.stream()
                .map(car::new)   // constructor reference
                .toList();
        System.out.println(c);


        
        
    }
}
