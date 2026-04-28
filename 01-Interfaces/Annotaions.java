/* 

1️⃣ What is this?

Annotation in Java is a special marker written with @ that provides extra information about the program to the compiler or framework.

It does not directly change the logic of the program, but it helps the compiler, tools, or frameworks understand how the code should behave.

Example:

@Override
public String toString() {
    return "Hello";
}

Here @Override is an annotation.

It tells the compiler that this method overrides a method from the parent class.

2️⃣ Why is this used?

Annotations are used to:

Give instructions to the compiler
Example: @Override checks if the method is actually overriding.
Reduce coding errors
If you write @Override and no parent method exists, the compiler gives an error.
Provide metadata (extra information about code)
Used by frameworks
Frameworks like Spring Framework and Hibernate read annotations to configure applications automatically.

Example:

@Entity
class Student {
}

This tells Hibernate that the class represents a database table.

3️⃣ Where is this used?

Annotations are commonly used in:

1. Method checking
@Override
2. Marking deprecated methods
@Deprecated

Means the method should not be used anymore.

3. Suppressing warnings
@SuppressWarnings("unchecked")
4. Framework configuration

Used in frameworks like:

Spring Framework
Hibernate
JUnit

Example in testing:

@Test
public void testAddition() {
}

*/
class A{
    public void showthisMethod(){
        System.out.println(" this is A class ");
    }
}
class B extends A{

    @override
    public void showthisMethod(){                       // yha annotation use hoga to tell that ki yha override kr rhe ho yha mistake ho skti h 
        System.out.println(" this is  B class");
    }
}
public class Annotaions {
    public static void main(String[] args) {

        B obj=new B();
        obj.showthisMethod();
        
    }
    
}
