public class String2{
    public static void main (String args[]){
    
        String str1="varun";
        String str2="Ram";
        String str3="Jay"+99+100+"Kusha";//by using '+' operator method we can  add intrgersit will consider it as string as  well
        String str4=100+69+"Varun";//But here it will consider as 169 the integer will get sum and then the string get concatenated  and Varun
        //String str5=100+99;//We cannot concatinate only integers in '+' operator also
        //String str6=str2.concat(100); by using concat method we can not add intrgers
        String str7 =str1+str2+189;//Stored in HeapArea
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str7);


        String str8 ="RajRamMohanRoy";
        String str9=" ";
        for(int i=str8.length()-1;i>=0;i--){
            str9=str9+str8.charAt(i);
            System.out.println(str9);


        }

         System.out.println(str8.toUpperCase());
         System.out.println(str8.toLowerCase());
         System.out.println(str8.substring(4));
         System.out.println(str8.substring(4,11));
         System.out.println(str8.length());
         System.out.println(str8.lastIndexOf("R"));
         System.out.println(str8.intern());

    }
}