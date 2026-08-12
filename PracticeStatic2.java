import java.util.*;
class Demo2{
    int a;
    int b;
     static int count;

     {
        count++;
     }

     Demo2(){
        System.out.println("Constructor");

     }

     Demo2(int a){
        this.a=a;
        System.out.println("Constructor with one parameter");

     }

     Demo2(int a,int b){
       this.b=b;
       this.a=a;
        System.out.println("Constructor with two parameter");
     }
    }

     public class PracticeStatic2{
        public static void main (String[] args){
            System.out.println(Demo2.count);
            Demo2 d1 = new Demo2();
            System.out.println(Demo2.count);
            Demo2 d2 = new Demo2(10);
             System.out.println(Demo2.count);
            Demo2 d3 = new Demo2(10,20);
             System.out.println(Demo2.count);
            
     }
    }


