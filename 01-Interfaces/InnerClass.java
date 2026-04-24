
/*An inner class is a class that is defined inside another class. It is mainly used to logically group classes that are only used in one place and to access members of the outer class easily.
    -->
    Why Inner Classes Are Used
        Better organization – keeps related classes together.
        Encapsulation – hides helper classes from other classes.
        Access to outer class members – inner class can access private variables and methods of the outer class.
*/
class A{
    public void funA(){
        System.out.println("this is A ");
    }

    static class B{             // make class static
        public void config(){
            System.out.println(" this is B class");
        }
    }
}
class InnerClass{
    public static void main(String[] args) {
        // if i have to call funA 
        A obj=new A();
        obj.funA();

        //if call config then make inner class static 
        A.B obj1=new A.B();
        obj1.config();
            
    }
}