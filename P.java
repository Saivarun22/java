
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
import java.util.Scanner;
public class Problemsday5{
    public static int sumOfTwoNumbers(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(sumOfTwoNumbers(a, b));
    }
}