 import java.util.*;
 abstract class Shaper{

    float area;

    abstract public void dimension();
    abstract public void compare();
    abstract public void  display();

}
class Rectangle extends Shaper{

    float length;
    float breath;
    
    Scanner sc=new Scanner(System.in);
    public void dimension(){
    System.out.println("Enter Length of Rectangle : ");
    length=sc.nextFloat();
    System.out.println("Enter Breath of Rectangle : ");
    breath =sc.nextFloat();
    }

    public void compare(){

        area = length* breath;
    

    }
    public void display(){

        System.out.println( "Area of Rectangle : " +area);
    }

}
class Square extends Shaper{

    float breath;
  
    
    Scanner sc=new Scanner(System.in);
    public void dimension(){
    System.out.println("Enter breath of Square : ");
    breath=sc.nextFloat();

    }

    public void compare(){

        area = breath * breath;
    

    }
    public void display(){

        System.out.println( "Area of Square :" +area);
    }

}
class Circle extends Shaper{

    float radius;
    
    
    Scanner sc=new Scanner(System.in);
    public void dimension(){
    System.out.println("Enter Radius of Circle");
    radius=sc.nextFloat();
    
    }

    public void compare(){

        area =  (float)(Math.PI* radius *radius);
    
  
    }
    public void display(){

        System.out.println( "Area of Circle : " +area);
    }

}
class Poly{

    public void permit(Shaper shaper){
        shaper.dimension();
        shaper.compare();
        shaper.display();

    }

}
public class Shape{
    public static void main (String [] args){

        Rectangle r=new Rectangle();
        Square s=new Square();
        Circle c =new Circle();
        Poly p =new Poly();

        p.permit(r);
        p.permit(s);
        p.permit(c);

    }

}