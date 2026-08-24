// class A{

//     public static void method(){
//         System.out.println("This is A Class Mehod ()");
//     }
// }
// class B extends A{
//     // public static void method(){
//     //     System.out.println("This is B Class Mehod ()");
//     // }
     
// }
// public class Hidding {
//     public static void main(String args[]){

//         B.method();
//         B b=new B();
//         b.method();
//     }
    
// }

//output : 

// This is A Class Mehod ()
// This is A Class Mehod ()



//Class B inherits the static method from Class A. If Class B defines a static method with the same signature, it hides the static method of Class A. The method that gets executed depends on the reference type, not the actual object. This is called method hiding.

class A{

    public static void method(){
        System.out.println("This is A Class Mehod ()");
    }
}
class B extends A{
    @Override
    public static void method(){
        System.out.println("This is B Class Mehod ()");
    }
     
}
public class Hidding {
    public static void main(String args[]){

        B.method();
        B b=new B();
        b.method();
    }
    
}

// output 
//This is B Class Mehod ()
//This is B Class Mehod ()
