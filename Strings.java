import java.util.*;
public class Strings{
    public static void main(String args[]){
        
        
        String str ="Java"; //Stored in StringConstantPool
        String str2 ="Java";//Stored in StringConstantPool
        String  s1 = new String("Java");//Sored in HeapArea
        String  s2 = new String("Java");//Sored in HeapArea
        boolean a = str==str2;
        System.out.println(a);//True//Here the Result is True because of "==" Will Compare The Reference of String is Same or Not
        boolean b = str2==s1;
        System.out.println(b);//False
        boolean c = s1==s2;
        System.out.println(c);//False

        boolean d = str.equals(str2);
        System.out.println(d);//True//Here the Result is True because of "Equals()" Will Compare The Data of String is Same or Not
        boolean e = str2.equals(s1);
        System.out.println(e);//True
        boolean f = s1.equals(s2);
        System.out.println(f);//Tuue


        String sr ="Java"; //Stored in StringConstantPool
        String sr2 ="Java";//Stored in StringConstantPool
        String sr3 = sr+sr2; //Stored in HeapArea Because of sr3 Refers to Sr concats sr2 so it will Create in HeapArea
        String sr4 = "Ja"+"va";//Stored in StringConstantPool
        String  st1 = new String("Java");//Sored in HeapArea
        String  st2 = new String("Java");//Sored in HeapArea
        boolean g = sr2==sr3;
        System.out.println(g);//False;
        boolean h = sr2==sr4;
        System.out.println(h);//True
        boolean i = st1==st2;
        System.out.println(i);//False

        boolean j = sr2.equals(sr3);
        System.out.println(j);//False
        boolean k = sr2.equals(sr4);
        System.out.println(k);//True
        boolean l = s1.equals(s2);
        System.out.println(l);//True
        boolean m = sr2.equals(st1);
        System.out.println(m);//True
        boolean n = sr2.equals(st2);
        System.out.println(n);//True

    }
}