
import java .util.Scanner;
public class Calculator{
    public static void main (String args[]){
        int ans=0;
        Scanner sc =new Scanner(System.in);
        while (true){
            char op = sc.next().trim().charAt(0);
            System.out.println("enter a operator");
            if(op =='+'|| op=='-'|| op=='*'||op =='/'||op =='%'){
                System.out.println("enter number 1");
                int n1=sc.nextInt();
                System.out.println("enter number 2");
                int n2=sc.nextInt();
                if(op == '+'){
                    ans =n1+n2;

                }
                if(op == '-'){
                    ans =n1-n2;

                }
                if(op == '*'){
                    ans =n1*n2;

                }
                if(op == '/'){
                    if(n2!=0){
                        ans=n1/n2;
                    }
                }
                if(op == '%'){
                    ans=n1%n2;

                }

            }
            else if (op=='x'|| op =='X'){
                break;
            }
            else{
                    System.out.println("Invalid number");
            }
            System.out.println(ans);

        }
       
    }
            
}

