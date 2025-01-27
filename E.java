// public class E {
//     // private int marks  = 7;
   
//     public int abc(int marks){
//         return marks;
//     }
//     public static void main (String[] args){

//     //    E obj =new E();
//     //    System.out.println(obj.marks);
//     }

   
    
// }

// polymorphism
// Dynamic method dispatch

// class A{
//     public void show(){
//         System.out.println("in class A");
//     }

// }
// class B extends A{
//     public void show(){
//         System.out.println("in class B");
//     }

// }
// class C extends A{
//     public void show(){
//         System.out.println("in class C");
//     }

// }
// public class E{
//     public static void main(String[] args){
//     A obj=new A();
//     obj.show();
//     obj=new B();
//     obj.show();
//     obj=new C();
//     obj.show();
//     }

// }


//  class A{

//     public final void show(){
//         System.out.println("Varun's");
//     }
//     public int add(int a,int b){
//         return(a+b);
//     }


//  }
//  class B extends A{
//     public void show(){
//         System.out.println("Robat");
//     }

//  }
// public class E{
//     public static void main(String []args){
//     final int num1=5;
//     final int num2=9;
//     System.out.println(num1);
//     System.out.println(num2);
//     B e1=new B();
//     e1.show();
//     System.out.println(e1.add(6,9));

//     }
// }

// class C{
//     String brand;
//     int price;

   

//     @Override
//     public String toString() {
//         return "C [brand=" + brand + ", price=" + price + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((brand == null) ? 0 : brand.hashCode());
//         result = prime * result + price;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         C other = (C) obj;
//         if (brand == null) {
//             if (other.brand != null)
//                 return false;
//         } else if (!brand.equals(other.brand))
//             return false;
//         if (price != other.price)
//             return false;
//         return true;
//     }

    


// }
// public class E{
//     public static void main(String[] args) {

//         C c1 =new C();
//         c1.brand="lenovo";
//         c1.price=45000;

//         C c2 =new C();
//         c2.brand="lenovo";
//         c2.price=45000;

//         boolean result =c1.equals(c2);
//         System.out.println(result);
        
//     }
// }

class A{
    public void show1(){
        System.out.println(" class A");
    }

}
class B extends A{
    public void show2(){
        System.out.println("class B");
    }
}

public  class E{
    public static void main(String[] args) {
        A a =new B();
        a.show1();
        B a1 = (B) a;
        a1.show2();
    }
}

