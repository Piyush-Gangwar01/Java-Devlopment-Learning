/*
    1️⃣ What is this?

        try–catch in Java is a structure used in exception handling to detect and handle runtime errors.

        The try block contains code that may cause an exception.
        The catch block handles the exception if it occurs.

        Basic Syntax:

        try {
            // code that may cause exception
        }
        catch(ExceptionType e) {
            // code to handle exception
        }



*/
public class Exception_Handling_Using_try_catch {
    public static void main(String[] args) {
        try{            // wo code jisme error aa skta h 
            int i=0;
            int j=17/i;

        }
        catch(Exception e){         // us error ko pakadne k liye 
            System.out.println("Something is wrong !");
        }

        // try catch k bhar likha code run hi run hoga 
        System.out.println(" i m outside try catch block ");
    }
}
