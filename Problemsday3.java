import java.util.Scanner;

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double area =3.14*r*r;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double b=sc.nextDouble();
//         double h=sc.nextDouble();
//         double area =0.5*b*h;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double l=sc.nextDouble();
//         double w=sc.nextDouble();
//         double area =l*w;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double b=sc.nextDouble();
//         double h=sc.nextDouble();
//         double area =0.5*b*h;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double area =3.14*r*r;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double b=sc.nextDouble();
//         double h=sc.nextDouble();
//         double area =b*h;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double d1=sc.nextDouble();
//         double d2=sc.nextDouble();
//         double area =0.5*d1*d2;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double a=sc.nextDouble();
//         double area =(Math.sqrt(3)/4)*(a*a);
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double area =2*Math.PI*r;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double area =r*r*r;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double b=sc.nextDouble();
//         double area =r+r+b+b;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double area =4*r;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double r=sc.nextDouble();
//         double h=sc.nextDouble();
//         double area =(1.0/3)*Math.PI*r*r*h;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
// public static void main (String args[]){
//     Scanner  sc =new Scanner(System.in);
//     double r=sc.nextDouble();
//     double h=sc.nextDouble();
//     double area = Math.PI*r*r*h;
//     System.out.println(area);
    
// }
// }

// public class Problemsday3{
// public static void main (String args[]){
//     Scanner  sc =new Scanner(System.in);
//     double r=sc.nextDouble();
//     double area =(4.0/3)*Math.PI*r*r*r;
//     System.out.println(area);
    
// }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double b=sc.nextDouble();
//         double h=sc.nextDouble();
//         double area =(1.0/3)*b*h;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         double a=sc.nextDouble();
       
//         double area =6*a*a;
//         System.out.println(area);
        
//     }
// }

// public class Problemsday3{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int prev=0;
//         int current =1;
//         int count =2;
//         while(count < n){
//             int temp =current;
//             current =prev+current;
//             prev=temp;
//         }

//         System.out.print(current);
        
        
//     }
// }

public class Problemsday3{
    public static void main (String args[]){
        Scanner  sc =new Scanner(System.in);
        double n=sc.nextDouble();
        for(int i=0;i<=n;i++){
            if(n%i==0)
            System.out.println(i);
        }
        
    }
}