class A{
    int a=10;
    public void method(){

        System.out.println("This is A Class Method");
    }

    // static class B{

    //     public void method(){

    //         System.out.println("This is B class Method");
    //     }
    // }

     class B{

        public void method(){

            System.out.println("This is B class Method");
        }
    }

}

public class StaticInnerClass {

    public static void main(String[]args){
        A obj =new A();
        obj.method();
        System.out.println("Valueof a is :"+obj.a);

        // A.B obj1 =new A.B();
        // obj1.method();
        
        A.B obj1 = new A().new B();
        obj1.method();
    }
    
}
