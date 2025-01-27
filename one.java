// import java.util.*;
// public class one{
//     public static void main(String[] args){
//         System.out.println("hello world");
//     }

// }

// import java .util.*;
// class Work{
//     public int add(int a,int b){
//         int result=a+b;
//         return(result);
//     }
// }
// public class one{
//     public static void main(String args[]){
//         Work w=new Work();
//         int result=w.add(12,3);
//         System.out.println(result);

//     }
// }

import java.util.*;
class Pen{
    public void first(){
        System.out.println("Sing asong");
    }
    public String second(int money){
        if(money>=5){
            return "pen";
        }
        else{
            return "nothing";
        }

    }
}
public class one{
    public static void main (String[] args){
        Pen p=new Pen();
        p.first();
        String s=p.second(10);
        System.out.println(s);

    }
}