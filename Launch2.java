import java.util.*;
class Beta1{

    public void alpha() throws ArithmeticException{
        System.out.println("Welcome to my App");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numerator of the Divizon Function : ");
        int num1=sc.nextInt();
        System.out.println("Enter Denominator of the Divizon Function : ");
        int num2=sc.nextInt();
        double res=  num1/num2;
        System.out.println("Result of Division Is : "+res);


    }
}
public class Launch2{
    public static void main (String []args){
        try{
        Beta1 a = new Beta1();
        a.alpha();
        System.out.println("Your code is now  Executing on Main Method");
        }catch(ArithmeticException e){
            System.out.println("Enter Non Zero Values "+e.getMessage());
        }
        System.out.println("Main Method Terminated");
        

    }
}
