// import java.util.*;
// class Human{
//     private int age;
//     private String  name;

//     public int getage(){
//         return age;
//     }
//     public void setage(int a){
//         age = a;
//     }
//     public String getname(){
//         return name;
//     }
//     public void setname(String n){
//         name=n;
//     }
// }
// public class encapsulation{
//     public static void main (String args[]){
//     Human h = new Human();
//     h.setage(30);
//     h.setname("sai");
  
//     System.out.println(h.getage());
//     System.out.println(h.getname());


//     }
// }

// this key word
// import java.util.*;
// class Human{
//     int age;
//     String name;

//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age=age;

//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
// }
// public class encapsulation{
//     public static void main(String args[]){
//         Human h=new Human();
//         h.setAge(30);
//         h.setName("varun");
//         System.out.println(h.getAge());
//         System.out.println(h.getName());

//     }
// }

// constructor
// import java.util.*;
// class Human{
//     int age;
//     String name;

//     //Default construcror
//      public Human(){  
//         age=34;
//         name="krishna";
//     }
//     // parameterized constructor
//       public Human(int age,String name){
//         this.age=age;
//         this.name=name;
//     }

//      public Human(String name){
//         this.age=12;
//         this.name=name;
//      }

//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age=age;

//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
// }
// public class encapsulation{
//     public static void main(String args[]){
//         Human h=new Human();
//         Human h1=new Human( 45,"rama");
//         Human h2=new Human( "lakshman");

//         // h.setAge(30);
//         // h.setName("varun");
//         System.out.println(h.getAge());
//         System.out.println(h.getName());
//         System.out.println(h1.getAge());
//         System.out.println(h1.getName());
//         System.out.println(h2.getAge());
//         System.out.println(h2.getName());


//     }
// }
//wrapper class 
class encapsulation{
    public static void main(String[] args) {
        Integer num1 =8;
        System.out.println(num1); // autoboxing

        Integer num2=num1;
        System.out.println(num2); //autounboxing

        String str ="14";
        int num3=Integer.parseInt(str);
        System.out.println(num3+25);
    }
}