 import java.util.Scanner;

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%i == 0){
//                 System.out.println(i);
//             }
//         }
        
//     }
// }

// import java.util.Scanner;

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n;
//         int sum=0;
//         while(true){

//         n=sc.nextInt();
//             if(n == 0){
//                 break;
//             }

//             sum+=n;

//         }
//         System.out.println(sum);
        
//     }
// }

// import java.util.Scanner;

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n;
//         int max = Integer.MIN_VALUE;
//         while(true){

//         n=sc.nextInt();
//             if(n == 0){
//                 break;
//             }

//             if(n>max){
//                 max=n;
//             }

//         }
//         System.out.println(max);
        
//     }
// }

// import java.util.Scanner;

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int result=n1+n2;
        
//         System.out.println(result);
        
//     }
// }

// import java.util.Scanner;

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner  sc =new Scanner(System.in);
//         int n1=sc.nextInt();
//         int factorial=1;
//         for(int i=1;i<=n1;i++){
//             factorial *=i;

//         }
//         System.out.println(factorial);
        
//     }
// }


// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double currentunits = sc.nextDouble();
//         if(currentunits <=100){
//             System.out.println(currentunits*1.5);
//         }
//         else if (currentunits >100 && currentunits <=200){
//             System.out.println(currentunits*2);
//         }
//         else if (currentunits >200 && currentunits <=300){
//             System.out.println(currentunits *5);
//         }
//         else{
//             System.out.println(currentunits*10);
//         }
//     }
// }

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("discount");
//         double Percent =sc.nextDouble();
//         System.out.println("Price");
//         double price = sc.nextDouble();
//         double discountprice =price*Percent/100;
//         double discount =price-discountprice;

//         System.out.println(discount);

    
         
    
//     }
// }


// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double x1 = sc.nextDouble();
//         double y1 = sc.nextDouble();
//         double x2 = sc.nextDouble();
//         double y2 = sc.nextDouble();

//         double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
//         System.out.println(distance);
//     }
// }

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc =new Scanner(System.in);
//         double percentage = sc.nextDouble();
//         double totalPrice =sc.nextDouble();
//         double commisionPrice = percentage/100 * totalPrice;
//         System.out.println(commisionPrice);

//     }
// }

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc =new Scanner (System.in);
//         int base =sc.nextInt();
//         int exponent =sc.nextInt();
//         int result =(int)Math.pow(base,exponent);
//         System.out.println(result);
//     }
// }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double cost = sc.nextDouble();
//         double salvage = sc.nextDouble();
//         double useFullLife = sc.nextDouble();

//         double annualsalvage = (cost-salvage)/useFullLife;
//         double currenAmount=cost;

//         for(int year = 1; year <= useFullLife ;year++){
//             currenAmount-=annualsalvage;
//             System.out.println(currenAmount);

//         }

//     }
// }

// public class Problemsday4 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         double hitbats =sc.nextDouble();
//         double allBats =sc.nextDouble();
//         double Average =hitbats/allBats;
//         System.out.println(Average);
//     }
// }

// public class Problemsday4 {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         double gpa ;
//         double sum = 0;
//         double count =0;

//         while(sc.hasNextDouble()){
//             gpa =sc.nextDouble();
//             sum += gpa;
//             count++;
            

//         }
//         if(count >0){
//             double result =sum /count;
//             System.out.println(result);
//         }
//         else {
//             System.out.println("Enter a cgpa");
//         }
//     }
// }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);1
//         double p =sc.nextDouble();
//         double r =sc.nextDouble();
//         double n =sc.nextDouble();
//         double t =sc.nextDouble();
//         double compound= p * Math.pow(1+r/n,n*t);
//         System.out.println(compound);
//     }
// }

// public class Problemsday4{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         double marks;
//         double sum=0;
//         double count =0;
//         while(sc.hasNextDouble()){
//             marks =sc.nextDouble();
//             sum += marks;
//             count++;

//         }
//         if(count>0){
//             double result =sum/count;
//             System.out.println(result);
//         }else{
//             System.out.println("Enter marks");
//         }
//     }
// }

// public class Problemsday4{
//         public static void main (String args[]){
//             Scanner sc=new Scanner(System.in);
//             double num;
//             double sum=0;
//             while(sc.hasNextDouble()){
//                 num =sc.nextDouble();
//                 sum += num;
    
//             }

//                 System.out.println(sum);
            
//         }
//     }

// public class Problemsday4{
//         public static void main (String args[]){
//             Scanner sc=new Scanner(System.in);
//             int num =sc.nextInt();
//             int original=num;
//             int sum=0;

//             while(num>0){
//                 int rem = num%10;
//                 int cube =rem*rem*rem;
//                 sum += cube;
//                 num/=10;
//             }

//             if(original != sum){
    
//                 System.out.println("not Armstrong");
//             }else{
//                 System.out.println("Armstrong");
//             }
//         }
//     }

// public class Problemsday4{

//     public static int factorial(int num){
//         int fact =1;
//         for(int i=1;i<=num;i++){
//             fact*=i;

//         }
//         return fact;
//     }
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int r =sc.nextInt();

//         if(n>=r){
//             int ncr =factorial(n)/(factorial(r)*factorial(n-r));
//             int npr =factorial(n)/factorial(n-r);
//             System.out.println(ncr);
//             System.out.println(npr);
//         }
//         else{
//             System.out.println("give number  n grater than or equal to r");
//         }
//     }
// }


        
        
// public class Problemsday4{

//     public static String reverse(String str){
//         String reverse="";
//         for(int i=str.length()-1;i>=0;i--){
//             reverse += str.charAt(i);
            

//         }
//         return reverse;
//     }
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         String str =sc.next();
//         System.out.println(reverse(str));
//     }
// }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int original =n;
//         int reverse = 0;
//         while (n != 0){
//             int rem = n % 10;
//             reverse = reverse*10 + rem;
//             n /=10;   
//         }
//         if(original == reverse){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("Not a Palindrome");
//         }
        
//     }
// }

// public class Problemsday4{
//     public static int hcf(int a,int b){
//         while(b!=0){
//             int temp =b;
//             b = a%b;
//             a = temp;
//         }
//         return a;

//     }
//     public static int lcm(int a,int b){
//         return (a*b)/hcf(a,b);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         int hcf=hcf(num1,num2);
//         int lcm=lcm(num1,num2);
//         System.out.println(hcf);
//         System.out.println(lcm);
//     }
// }


// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         char ch =sc.next().charAt(0);
//         ch =Character.toLowerCase(ch);


            
//             if(ch =='a'|| ch =='e'|| ch =='i' || ch =='o' ||ch =='u'){
//                 System.out.println("vowel");
//             }
//             else if( Character.isLetter(ch)){
//                 System.out.println("consonant");
//             }
//             else{
//                 System.out.println("input  a charcter");
//             }
        
    
//     }
// }

// public class Problemsday4 {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int original =n;
//         int sum=0;
//         for(int i=1;i<=n/2;i++){
//             if(n%i==0){
//                 sum += i;
//             }
            
//         }
//         if(original == sum){
//             System.out.println("perfect number");
//         }else{
//             System.out.println("not a perfect number");
//         }
//     }
// }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int year=sc.nextInt();
//         if(year%4 ==0 && year%100 !=0){
//                 System.out.println("leap year");
//             }
//             else{
//                 System.out.println("not a  leap year");  
//             }
//         }

//     }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int month=sc.nextInt();
//         int count =0;
//         while(month > 0){
//             if(month%2 ==0){
//                count++;
//             }
//             month --;

//         }
//         System.out.println(count);
        
//     }
// }

// public class Problemsday4{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int list;
//         int sumNegitive =0;
//         int sumPositiveEven =0;
//         int sumPositiveOdd =0;
//         while(true){

//             list = sc.nextInt();
//             if ( list ==0){
//                 break;
//             }

//             if (list < 0){
//                 sumNegitive +=list;

//             }
//             else if ( list % 2 == 0){
//                 sumPositiveEven +=list;

//             }
//             else{
//                 sumPositiveOdd +=list;
//             }
//         }

//         System.out.println("Negitive"+sumNegitive);
//         System.out.println("PositiveEnen"+sumPositiveEven);
//         System.out.println("PositiveOdd"+sumPositiveOdd);
            
//         }
//     }

