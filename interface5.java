interface demo{
     void show();
     default void master(){
        System.out.println("In master");
}

     static void run(){
        System.out.println("Method is in runtime");
     }
}
class Practice implements demo{

     
    public void master(){
        System.out.println("In master in practice class ");// Overriding the default method from the interface
    }

        public void show() {
        System.out.println("In show");
    }
}
public class interface5 {
    public static void main(String[] args) {
         demo.run(); // Calling the static method directly from the interface

         demo d =new Practice();
         d.master(); // Calling the overridden method from the implementing class 
         d.show(); // Calling the implemented method from the implementing class
}
}