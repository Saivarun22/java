// interface A{
//    void show();
//    void master();
// }

// interface X {
//    void run();
// }

// interface Y extends X {
//    // No additional methods needed since it inherits from X
// }

// class B implements A, Y {
//    public void show() {
//        System.out.println("In show");
//    }

//    public void master() {
//        System.out.println("In master");
//    }

//    public void run() {
//        System.out.println("Method is in runtime");
//    }
// }

// public class Practice {
//    public static void main(String[] args) {
//        A obj2;
//        obj2 = new B();
//        obj2.show();
//        obj2.master();

//        X obj1 = new B();
//        obj1.run();
//    }
// }


// abstract


// abstract class A{
//     public abstract void drive();
//     public abstract void music();
//     public abstract void flying();


// }
// abstract class B extends A{
//     public void drive(){
//         System.out.println("car is on the way");
//     }
// }
// class C extends B{
//     public void music(){
//         System.out.println("playing music");
//     }
//     public void flying(){
//         System.out.println("car is flying on buildings");
//     }
// }

// class interfacepractice{
//     public static void main(String[] args) {
//         C obj=new C();
//         obj.drive();
//         obj.flying();
//         obj.music();
        
//     }
// }
//  interface Computer {
//    void laptop();
// }
//  class Laptop implements Computer{
//     public void laptop(){
//         System.out.println("code execute run");
//     }
//  }
//  class Desktop implements Computer{
//     public void laptop(){
//         System.out.println("code execute run faster");
//     }
//  }

//  class Developer{
//     public void developer(Computer lap){
//        lap.laptop() ;
//     }
//  }
//  class interfacepractice{
//     public static void main(String[] args) {
//         Computer l= new Laptop();
//         Computer desk=new Desktop();
//         Developer d=new Developer();
//         d.developer(desk);
        
//     }
//  }
//  method overriding
// class A{
//    public void Start(){
//       System.out.println("This is parent class");
//    }

// }
// class B extends A{
//    public void Start(){
//       System.out.println("This is child class");
//    }

// }
// class Practice{
//    public static void main(String[] args) {
//       B b=new B();
//       b.Start();
      
//    }
// }

// functional interface
 
//  interface A{

//    void Print();

// }
// class Practice{
//    public static void main(String[] args) {

//       A a=new A() {
//          public void Print(){
//             System.out.println("This system is running");
//          }
//       };
//       a.Print();
      
//    }
//  }
//   verbose means specifing everting making a detail code

// lambda function

//  interface A{

//    void Print(int i);

// }
// class Practice{
//    public static void main(String[] args) {

//       A a= (int i) -> System.out.println("This system is running");
      
//       a.Print(5);
      
//    }
//  }
 
// lamba function using return typr
// interface G {

//     int add(int a,int b);
    
// } 

    

// class Practice{
//     public static void main(String[] args) {

//         G g =(int i,int j) -> i+j;

//         g.add(7,8);
        
//     }
// }

// exceptions

class Practice{
    public static void main(String[] args) {
        int i=0;
        
        int j=10;

        try {
            System.out.println(i/j);
            
        } catch (Exception e) {
            System.out.println("Error occur");
        }
        
        System.out.println(j);
        System.out.println("Code completed");
    }
}