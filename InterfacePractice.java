interface A{
    void show();
    void master();
 }
 
 interface X {
    void run();
 }
 
 interface Y extends X {
    // No additional methods needed since it inherits from X
 }
 
 class B implements A, Y {
    public void show() {
        System.out.println("In show");
    }
 
    public void master() {
        System.out.println("In master");
    }
 
    public void run() {
        System.out.println("Method is in runtime");
    }
 }
 
 public class InterfacePractice {
    public static void main(String[] args) {
        A obj2;
        obj2 = new B();
        obj2.show();
        obj2.master();
 
        X obj1 = new B();
        obj1.run();
    }
 }
