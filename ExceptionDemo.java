import java.util.*;
public class ExceptionDemo{
    public static void main(String args[]){
    try {
        

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        double result =num1/num2;
        System.out.println("The Result of two number after division is" + result);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the Index of Array");
        int position =sc.nextInt();
        System.out.println("Enter The Value To Be Placed In Array");
        int element =sc.nextInt();
        ar[position]=element;
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println("Enter a Valid  Number greater than 0");

    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e.getMessage()); 
        e.printStackTrace();  
        System.out.println("Please enter the value inside the Array bound");

    }catch(NegativeArraySizeException e){
         System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println( "Please enter postive Value ");

    }catch(Exception e){
         System.out.println(e.getMessage());
       e.printStackTrace();  
        System.out.println("You have enterd Inavlaid input");


    }


    }

}