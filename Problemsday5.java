 import java.util.ArrayList;
import java.util.Scanner;
//  public class Problemsday5{
//     public static int maxNumber(int a,int b,int c){
//         int max = a;
//         if (b > max){
//             max = b;
//         }
//         if (c > max){
//             max =c;
//         }
//         return max;
//     }
//     public static int minNumber(int a,int b,int c){
//         int min = a;
//         if (min > b ){
//             min = b;
//         }
//         if (min > c){
//             min =c;
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.err.println(minNumber(7, 9, 20));
//         System.out.println(maxNumber(7, 9, 20));

        
//     }
//  }

// public class Problemsday5{
//     public static boolean evenNumber(int n){
//         if(n%2==0){
//             return true;
//         }
//         return false;

//     }
//     public static void main (String args[]){
//         if(evenNumber(6)){
//             System.out.println("Even Number");
//         }
//         else {
//             System.out.println("odd Number");
//         }
//     }
// }

// public class Problemsday5{
//     public static boolean ageValidation(int age){
//         if(age > 18){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         if(ageValidation(20)){
//             System.out.println("eligable");
//         }else{
//             System.out.println("Not Eligable");
//         }
//     }
// }

    // public class Problemsday5{
    //     public static int sumOfTwoNumbers(int a,int b){
    //         int sum =a+b;
    //         return sum;
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc= new Scanner(System.in);
    //         int a= sc.nextInt();
    //         int b= sc.nextInt();
    //         System.out.println(sumOfTwoNumbers(a, b));
    //     }
    // }

    // public class Problemsday5{
    //         public static int productsOfTwoNumbers(int a,int b){
    //             int product =a*b;
    //             return product;
    //         }
    //         public static void main(String[] args) {
    //             Scanner sc= new Scanner(System.in);
    //             int a= sc.nextInt();
    //             int b= sc.nextInt();
    //             System.out.println(productsOfTwoNumbers(a, b));
    //         }
    //     } 

// import java.util.*;
//     public class Problemsday5{
//             public static double Area(int r){
//                 double area = Math.PI* r* r;
//                 return area;
//             }
//             public static double circumference(int r){
//                 double c =2*Math.PI *r ;
//                 return c;
//             }
//             public static void main(String[] args) {
//                 Scanner sc= new Scanner(System.in);
//                 int r= sc.nextInt();
//                 System.out.println(Area(r));
//                 System.out.println(circumference(r));
//             }
//         }

// public class Problemsday5{
//     public static boolean isPrime(int n){

//         if( n<=1){
//             return false;
//         }
//         if(n> 2){
//             for(int i=2;i<=n/2;i++){
                
//                 if(n%i ==0){
//                     return false;
//                 }
                
//             }
        
//         }
//         return true;
//     }

    
//     public static void main(String[] args) {
//         System.out.println(isPrime(8));
//     }
// }

// public class Problemsday5{
//     public static String Grade(int n){
//         if(n>90  && n<=100){
//             return "AA";
//         }else if(n>80  && n<=90){
//             return "AB";
//         }else if(n>70  && n<=80){
//             return "BB";
//         }else if(n>60  && n<=70){
//             return "BC";
//         }else if(n>50  && n<=60){
//             return "CD";
//         }else if(n>40  && n<=50){
//             return "DD";
//         }else{
//             return "fail";
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(Grade(89));
//     }
// }

// public class Problemsday5{
//     public static int factorial(int n){
//         int fact =1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(9));
        
//     }
// }

// public class Problemsday5{
//     public static boolean Palindrome(int num){
//         int original =num;
//         int reverse = 0;
//         while(num>0){
//             int rem=num%10;
//             reverse = reverse * 10 + rem;
//             num /=10;
//         }

//         if(original == reverse){
//             return true;

//         }
//         return false;
        
//     }
//     public static void main(String[] args) {
//         if(Palindrome(123)){
//             System.out.println("Is a Palindrome");
//         }else{
//             System.out.println("Not a palindrome");
//         }
        
//     }
// }

//  public class Problemsday5{
//     public static boolean Pythagorean(int a,int b, int c){
//         int x=a*a;
//         int y=b*b;
//         int z=c*c;

//         if((x+y==z)||(y+z==x)||(z+x==y)){
//             return true;
//         }

//         return false;

//     }
//         public static void main(String[] args) {
//             if(Pythagorean(3,4,5)){
//                 System.out.println("Is a Pythagorean");
//             }else{
//                 System.out.println("Not a Pythagorean");
//             }
            
//         }
//     }
// import java .util.*;
// public class Problemsday5{
//         public static boolean isPrime(int n){
    
//             if( n<=1){
//                 return false;
//             }
//             if(n > 2){
//                 for(int i=2;i<=n/2;i++){
                    
//                     if(n%i ==0){
//                         return false;
//                     }
                    
//                 }
            
//             }
//             return true ;
//         }

//         public static List<Integer> getPrimes(int start,int end){
//             List<Integer> primes = new ArrayList<>();
//             for(int n =start; n<=end; n++){
//                 if(isPrime(n)){
//                     primes.add(n);
//                 }
//             }
//             return primes;
//         }
//         public static void main(String[] args) {
//                 System.out.println(getPrimes(5,90));
//         }
//     }
    
// public class Problemsday5{
//     public static int sumOFNaturalNumbers(int n){
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum+=i;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println(sumOFNaturalNumbers(60));
//     }
// }