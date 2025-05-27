import java.util.Scanner;

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         int number =sc.nextInt();
//         if(number%2==0){
//             System.out.println("Even Number");
//         }else{
//             System.out.println("Odd Number");
//         }

//     }

// }

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc =new Scanner(System.in);
//         String name = sc.next();
//         System.out.println(name + "Welcome");

//     }

// }

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double principal =sc.nextDouble();
//         double time =sc.nextDouble();
//         double rate =sc.nextDouble();
//         double SimpleIntrest = principal*time*rate;
//         System.out.println(SimpleIntrest);
      
//     }

// }

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
        
//         double n1 =sc.nextDouble();
//         double n2 =sc.nextDouble();
//         char operator = sc.next().trim().charAt(0) ;
//         if(operator == '+'|| operator == '-'|| operator == '*'||operator =='/'){
//             if(operator == '+'){
//             System.out.println(n1+n2);}
//             else if(operator == '-'){
//             System.out.println(n1-n2);}
//             else if(operator == '*'){
//             System.out.println(n1*n2);}
//             else{
//                 if(n2==0){
//                 System.out.println(n1/n2);
//                 }
//             }
//         }
//         else {
//             System.out.println ("enter valid operator");
//         }

//     }

// }

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double n1 =sc.nextDouble();
//         double n2 =sc.nextDouble();
//         if(n1 > n2)
//         {
//             System.out.println(n1);
//         }
//         else{
//             System.out.println(n2);
//         }
//     }
// }

// public class Problemsday2{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double indian =sc.nextDouble();
   
//         double us = indian * 85.38;
//         System.out.println(us);
      
//     }

// }

public class Problemsday2{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int  n =sc.nextInt();
        int startIndex = 0;
        int currentIndex = 1;
        int count = 2;
        
        while(count <=n){
        int temp = currentIndex;
        currentIndex =startIndex + currentIndex;
        startIndex = temp;
        count++;
        }

        System.out.println(currentIndex);

       
      
    }

}

//  public class Problemsday2{
//     static boolean palindrome (String name){
//         String small = name.toLowerCase();
//         int  len = name.length();

//         for( int i=0;i<len/2;i++){
//            char startChar = small.charAt(i);
//            char endChar = small.charAt(len-1-i);

//            if(startChar != endChar){
//             return false;
//            }

//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         String name =sc.next();

//         if(palindrome(name)){
//             System.out.println("is palindrome");
//         }else{
//             System.out.println("is not a palindrome");
//         }


//     }
//  }

// public class Problemsday2{
  

//     static boolean armstrong(int n1){
//         int temp = n1;
//         int sum = 0;
//         while(n1>0){
//             int rem =n1 % 10;
//             int arm =rem *rem *rem;
//             sum += arm;
//             n1/=10;
//         }

        

//             if(temp == sum){
//                 return true;
//             }
        

//         return false;


//     }
//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n1 = sc.nextInt();

//     if(armstrong(n1)){
//         System.out.println("is Armstrong");
//     }else{
//         System.out.println("not armstrong");
//     }
// }
// }