// import java.util.*;
// public class relationaloperators{
//     public static void main (String[] args){
//         int a=9;
//         int b=10;
//         boolean result=a>b;
//         boolean result1=a<b;
//         boolean result2=a==b;
//         boolean result3=a!=b;
//         boolean result4=a>=b;
//         boolean result5=a<=b;
//         System.out.println(result);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//         System.out.println(result4);
//         System.out.println(result5);
//     }
// }

// class relationaloperators{
//     public static void main(String[] args) {
//         int i=10;
        
//         int j=0;

//         try {
//             System.out.println(i/j);
            
//         } catch (Exception e) {
//             System.out.println("Error occur");
//         }
        
//         System.out.println(j);
//         System.out.println("Code completed");
//     }
// }


// class relationaloperators{
//     public static void main(String[] args) {
//         int i=30;
//         int j=2;
//         int arr[]=new int[8];
//         String  str =null;

//         try {
//             System.out.println(i/j);
//             System.out.println(str.length());
//             System.out.println(arr[7]);
//             System.out.println(arr[10]);
           
        
            
//         } catch ( ArithmeticException e) {
//             System.out.println("Error occured" +e);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Error out of bounds" +e);
//         }
//         catch (Exception e) {
//             System.out.println("Null point error" +e);
//         }

//         System.out.println(j);
        
//     }
// }

// class relationaloperators{
//     public static void main(String[] args) {
//         int i=20;
//         int j=0;
//         try{
//             j=18/i;
//             if(j==0){
//                 throw new ArithmeticException("Error not found");
//             }
//         }
//         catch(ArithmeticException e){
//             j=18/1;
//             System.out.println("Arithmeticerror" +e);
//         }
//         catch(Exception e){
//             System.out.println("Arthimetic exception not found");
//         }
//         System.out.println(j);
//     }
// }


// user exception
// Exception or RuntimeException
// class VarunException extends Exception{
//     public VarunException (String string){

//         super(string);
//     }
// }
// class relationaloperators{
//     public static void main(String[] args) {
//         int i=20;
//         int j=0;
//         try {
//             j=18/i;
//             if(j==0){
//                 throw new VarunException("Error found in throw");
//             }
            
//         } catch( VarunException e) {
//             j=18/1;
//             System.out.println("Error ocuured in ArthimeticException" +e);
//         } catch (Exception e) {
//             System.out.println("Exception");
//         }

//         System.out.println(j);
//     }
// }

// ducking the  key word
// class A{
//     public void show() throws ClassNotFoundException 
//     {
//             Class.forName("Strings");
//     }
     
//     }

// class relationaloperators{

//     static{
//         System.out.println("class loaded");
//     }
//     public static void main(String[] args) {
        
//         A a =new A();
//         try {
//             a.show();
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//             System.out.println("class not found");
//         }
//     }


// user input

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;
// class relationaloperators{
   
    
//     public static void main(String[] args) throws IOException{
//         System.out.println("Hello man");
//         // int num = System.in.read();
//         // InputStreamReader in =new InputStreamReader(System.in);
//         // BufferedReader bf =new BufferedReader(in);
//         // int num=Integer.parseInt(bf.readLine());
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
        
//         System.out.println(num);
//         // bf.close();

//     }
// }
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// class relationaloperators{
//     public static void main(String[] args) throws NumberFormatException,IOException {
//         // int i=0;
//         // int j=0;
//         // try {
//         //       j=18/i;
//         // } catch (Exception e) {
//         //     System.out.println("Something error");
//         // }finally{
//         //     System.out.println("bye");
//         // }

//     int num=0;
//     try(BufferedReader br =new BufferedReader (new InputStreamReader(System.in))){

        
//         num=Integer.parseInt(br.readLine() );
//         System.out.println(num);

//     }
//     }
// }