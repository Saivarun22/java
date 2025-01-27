import java.util.*;
public class logicaloperators{
    public static void main(String[] args){
        int a=5;
        int b=7;
        int c=6;
        int d=8;
        boolean result= a<b && c>d;
        System.out.println(result);
        boolean result1= a<b || c>d;
        System.out.println(result1);
        boolean result2= a<b;
        System.out.println(!result2);
    }

}