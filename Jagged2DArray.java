
import java .util.Scanner;
public class Jagged2DArray {
    
    
     public static void main (String args []){
        int arr [][] =new int [3][];
         arr [0] = new int [4];
         arr [1] = new int [5];
         arr [2] = new int [9];

        System.out.println("Students marks of 3 classes and 4 subjects each:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter marks of Students " + (i+1) + " Subject " + (j+1));
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Marks of Students " + (i+1) + " Subject " + (j+1) + ": " + arr[i][j] + " ");
            }

            System.out.println();
        }

     }
}


