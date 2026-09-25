public class Strings3 {
    public static void main (String args []){

        StringBuffer s1=new StringBuffer("Java");
        StringBuffer s2=new StringBuffer("Java");
        System.out.println(s1==s2);//Compares the reference not the concent in both immutable and mutable cases o/p = False
        System.out.println(s1.equals(s2));//String is immutable and overrides equals() → content comparison StringBuffer and StringBuilder are mutable and don't override equals() for content comparison → reference comparison
        System.out.println(s1.toString().equals(s2.toString()));//Here the content get compared by using toString method o/p = true

        StringBuilder str1=new StringBuilder("Java");
        StringBuilder str2=new StringBuilder("Java");
        System.out.println(str1==str2);//Compares the reference not the concent in both immutable and mutable cases o/p = False
        System.out.println(str1.equals(str2));//String is immutable and overrides equals() → content comparison StringBuffer and StringBuilder are mutable and don't override equals() for content comparison → reference comparison
        System.out.println(str1.toString().equals(str2.toString()));//Here the content get compared by using toString method o/p = true
        
        System.out.println(s1.capacity());
        s1.append("Java contains Both Mutable And Immutable Strings");
        System.out.println(s1);
        System.out.println(s1.capacity());

        System.out.println(str1.capacity());
        str1.append("Java contains Both Mutable And Immutable Strings");
        System.out.println(str1);
        System.out.println(str1.capacity());


    }
    
}
