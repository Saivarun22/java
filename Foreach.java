
import java .util.*;
import java. util.Arrays;
public class Foreach{
    public static void main (String [] args){

          Scanner sc = new Scanner(System.in);
        //  int arr [] = new int [5];
        
        

        //  for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        //  }

        //   System.out.println("Single Dimensional Array");
        //  for(int a : arr){
        //     System.out.print(a +" ");
        //  }

        // int arr2 [][] = new int [5][];

        // arr2[0]=new int [7];
        // arr2[1]=new int [6];
        // arr2[2]=new int [8];
        // arr2[3]=new int [3];
        // arr2[4]=new int [9];

        // for(int i=0;i<arr2.length;i++){
        //     for(int j=0;j<arr2[i].length;j++){
        //         arr2[i][j]=sc.nextInt();

        //     }
        // }
        // System.out.println("Multi Dimensional Array");

        // for(int a[]:arr2){
        //     for(int b:a){
        //         System.out.print(b +" ");
        //     }
        //     System.out.println();
        // }
    //}

    int a[]={9,6,4,8,3,2};

    for(int arr : a){
        System.out.print( "Unsorted Array" +arr +" ");

    }   
    Arrays.sort(a);
    for(int element : a){
        System.out.print("Sorted Array"+ element + " ");
    }
  }
}
