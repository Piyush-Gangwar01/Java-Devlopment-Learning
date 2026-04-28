public class EH_using_Multiple_tryCatch {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{            // wo code jisme error aa skta h 
            
            // jitne bhi error aa skte h un sbke liye catch block banan pdega 
            System.out.println(arr[5]);
            
            int i=0;
            int j=17/i;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" this is arr exception");
        }

        // Exception e is used to catch all types of error (so error pakadna ho to pehle catch likho us error k liye )
        catch(Exception e){            
            System.out.println("Something is wrong !");
        }

        // try catch k bhar likha code run hi run hoga 
        System.out.println(" i m outside try catch block ");
    }
}
