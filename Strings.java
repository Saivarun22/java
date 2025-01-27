// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         String name="sai";
//         name = name + "Varun";

//         String name1="Sai";
//         String name2="Sai";

//         System.out.println(name1 == name2);
//     }
// 

// class Mobile{
//     String brand;
//     int price;
//     static String type;
     
//     public void command(){
//     System.out.println(brand +" : "+ price +" : "+type);
//     }
//     public static void command1(Mobile phone){
//         System.out.println(phone.brand +" : "+ phone.price +" : "+type);
//     }
// }

// public class Strings{
    
//     public static void main(String args[]){

//         Mobile phone1 = new Mobile();
//         phone1.brand="Realmi";
//         phone1.price=35000;
//         Mobile.type="smart phone";

//         Mobile phone2 = new Mobile();
//         phone2.brand="samsung";
//         phone2.price=65000;
//         Mobile.type="smart phone";
        
//         Mobile phone3 = new Mobile();
//         phone3.brand="One plus";
//         phone3.price=80000;
//         Mobile.type="smart phone";

//         phone1.type="phone";

//         phone1.command();
//         phone2.command();
//         phone3.command();
//         Mobile.command1(phone3);
        


//     }
// }

class Mobile{
    String brand;
    int price;
    static String type;

    public Mobile(){
        brand="apple";
        price=75000;
        System.out.println("it in constructor");
    }

    static{
        type="Mobile";
        System.out.println("it in  static method");
    }
     
    public void command(){
    System.out.println(brand +" : "+ price +" : "+type);
    }
    
}
public class Strings{
    
    public static void main(String args[]){

        Mobile phone1 = new Mobile();
        phone1.brand="Realmi";
        phone1.price=35000;
        Mobile.type="smart phone";

        Mobile phone2 = new Mobile();


    }
}