import java .util.Scanner;
public class Array2D {
     public static void main (String args []){
        int arr [][] =new int [3][4];
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
