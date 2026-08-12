import java.util.*;
class Demo{

    static int a;
    static int b;
    

    int x;
    int y;
    
    static 
    {
        System.out.println("Static Block");
         a=10;
         b=20;
       
    }
    

    //Non Static Block 
    {
        System.out.println("Non Static Block");
       
    }

    Demo(){
        System.out.println("Constructor");
    }

    static void Display(){
        System.out.println("Static Method");
        System.out.println(a);
            System.out.println(b);

    }

    public void Display1(int x,int y){
        System.out.println("Non Static Method");
        this.x=x;
        this.y=y;
        System.out.println(x);
        System.out.println(y);

    }
}
public class PracticeStatic{
    public static void main (String[] args){
        Demo d =new Demo();
        d.Display1(500,1000);
        Demo.Display();

    }
};

