// import java.util.*;
// public class variable{
//     public static void main(String[] args){
//         int a=78;
//         int b=90;
//         int result=a+b;
//         System.out.println(result);
//     }
// }

import java.util.*;
public class arrays{
    public static void main(String []args){
        int arr[]=new int[5];
         arr[0]= 9;
         arr[1]= 8;
         arr[2]= 7;
         arr[3]= 6;
         arr[4]= 5;

        // for(int i=0;i<6;i++){
        //     System.out.println(arr[i]);

        // Enhanced for loop

        for(int h :arr){
            System.out.println(h);
        }
    
//          int arr[] = {6,5,4,3,2};
//          for(int i=0;i<6;i++){
//             System.out.println(arr[i]);
//          }
//     }
// }

//multi dimensional arra
// import  java.util.*;
// public class arrays{
//     public static void main(String args[]){
//         int arr1 [][]=new int[3][4];
//         for (int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(arr1[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import  java.util.*;
// public class arrays{
//     public static void main(String args[]){
//         int arr1 [][]=new int[3][4];
//         for (int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 arr1[i][j]=(int)(Math.random() *100);
//                 System.out.print(arr1[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main (String args[]){
//         int nums [][]=new int [3][];
//         nums[0]= new int[3];
//         nums[1]= new int[4];
//         nums[2]= new int[2];

//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 nums[i][j]=(int)(Math.random()*10);
//                 System.out.print(nums[i][j] +" ");
//             }
//             System.out.println();

//         }
//     } 
// }


// array using objects
// class Student{
     
//      int Rollno;
//      String Name;
//      int Marks;
// }
// public class arrays{
//     public static void main(String []args){
        
//         Student s1=new Student();
//         s1.Rollno = 1; 
//         s1.Name ="Varun";
//         s1.Marks = 45;

//         Student s2=new Student();
//         s2.Rollno = 2; 
//         s2.Name = "Virshank";
//         s2.Marks = 48;

//         Student s3=new Student();
//         s3.Rollno = 3; 
//         s3.Name = "tanishk";
//         s3.Marks = 39;

//         Student students[]=new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

        // for (int i=0;i<students.length;i++){
        //     System.out.println(students[i].Name +":"+students[i].Rollno+ ":"+students[i].Marks);
        // }

        // Enhanced for loop
        // for (Student stud : students){
        //     System.out.println(stud.Name +":"+ stud.Rollno+":"+stud.Marks);
        // }

    }
}