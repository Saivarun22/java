import java.util.Scanner;
public class Array{
    public static void main (String args[]){

        int arr [] = new int [5];
        System.out.println("Enter Marks of students : ");

        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("marks of student "+(i+1) + "  is : "+arr[i]);
        }
    }
}