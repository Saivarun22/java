// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// public class collectionspractice {
//     public static void main(String[] args) {
//         List <Integer> nums =new ArrayList <Integer>();
//         nums.add(9);
//         nums.add(8);
//         nums.add(7);
//         nums.add(6);

//         System.out.println(nums.get(1));
//         System.out.println(nums.indexOf(9));

//         // for(int n: nums){
//         //     System.out.println(n);
//         // }
        
//     }
    
// }

// import java.util.Collection;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.TreeSet;

// public class collectionspractice{
//     public static void main(String[] args) {
//         Collection <Integer> nums =new TreeSet <Integer>();
//         nums.add(49);
//         nums.add(35);
//         nums.add(26);
//         nums.add(57);
        
//        Iterator <Integer> values = nums.iterator();
//        while (values.hasNext()) {
//         System.out.println(values.next());
        
//        }
    
//         // for(int n: nums){
//         //     System.out.println(n);
//         // }
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class collectionspractice{
//     public static void main(String[] args) {
//         Map <String,Integer> students =new HashMap<>();
//         students.put("varun", 98);
//         students.put("sai", 96);
//         students.put("kalyan", 87);
//         students.put("rajesh", 89);

//          for(String key: students.keySet()){
//             System.out.println( key + ":" + students.get(key));
//          }

         
//     }
// }

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class collectionspractice{
//     public static void main(String[] args) {

//         Comparator<Integer> com =new Comparator<Integer>() {
//             public int compare(Integer i,Integer j){
//                 if(i%10 > j%10){
//                     return 1;
//                 }else{
//                     return -1;
//                 }
//             }
            
//         };

//         List <Integer> nums =new ArrayList<>();
//         nums.add(564);
//         nums.add(452);
//         nums.add(343);
//         nums.add(231);

//         Collections.sort(nums,com);
//         System.out.println(nums);
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// class Students implements Comparable<Students>{

//     int age;
//     String name;

    
//     public Students(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }


//     public String toString() {
//         return "Students [age=" + age + ", name=" + name + "]";
//     }


//     @Override
//     public int compareTo(Students that) {
//         if(this.age>that.age){
//             return 1;
            
//         }else{
//             return -1;
//         }

//     }



// }
// public class collectionspractice{
//     public static void main(String[] args) {

//          Comparator<Students> com = (i,j) -> i.age>j.age?1:-1;
//         // Comparator<Students> com =new Comparator<Students>() {
//         //     public int compare(Students i,Students j){
        
//         //         if(i.age > j.age){
//         //             return 1;
//         //         }else{
//         //             return -1;
//         //         }
//         //     }
//         // };
            
        

//         List <Students> studs =new ArrayList<Students>();
//         studs.add(new Students(25, "anil"));
//         studs.add(new Students(23, "kumar"));
//         studs.add(new Students(20, "vamshi"));
//         studs.add(new Students(22, "kalyan"));

//         Collections.sort(studs);
//         for(Students s:studs){
//             System.out.println(s);
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class collectionspractice{
//     public static void main(String[] args) {
//         List <Integer> nums =Arrays.asList(4,6,8,9);
//         int sum=0;
//         // for(int n :nums){
//         //     if(n%2==0){
//         //         n=n*2;
//         //         sum=sum+n;
//         //     }
//         // }
//         // for(int i=0;i<nums.size();i++){
//         //     System.out.println(nums.get(i));
//         // }
//         // for( int n :nums){
//         //     System.out.println(n);
//         // }
//         nums.forEach(n-> System.out.println(n));

//     }
// }

// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Consumer;

// public class collectionspractice{
//     public static void main(String[] args) {
        
//         List <Integer> nums= Arrays.asList(4,6,9,8) ;

//         Consumer <Integer> con = new Consumer<Integer>() {
//             public void accept(Integer n){
               
//                 System.out.println(n);

//             }
//         };
//         nums.forEach(con);
//         // nums.forEach(n ->System.out.println(n));
//     }
//}

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class collectionspractice{
    public static void main(String[] args) {
        
        List <Integer> nums= Arrays.asList(4,6,9,8) ;

        // Stream <Integer> s1=nums.stream();
        // Stream <Integer> s2=s1.filter(n -> n%2==0);
        // Stream <Integer> s3=s2.map(n -> n*2);
        // int result=s3.reduce(0, (c,e) ->c+e);
        // Predicate <Integer> p =new Predicate<Integer> (){
        //     public boolean test(Integer n){
        //         if(n%2==0){
        //             return true;

        //         }else{
        //             return false;
        //         }

        //     }
        // };

        // Function <Integer, Integer> fun=new Function<Integer, Integer>(){
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }

        // };
        // int result=nums.stream()
        //                .filter(n ->n%2==0)
        //                .map( n -> n*2)
        //                .reduce(0,(c,e) ->c+e);
        Stream<Integer> sortedValues =nums.stream()
                                     .filter( n->n%2==0)
                                     .sorted();


        sortedValues.forEach(n ->System.out.println(n));
       
        //  s3.forEach(n ->System.out.println(n));
    }
}