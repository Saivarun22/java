

class Parent {
    // Inherited Method
    void Height(){
        System.out.println("Heigh Is 6.2");

    }
    void EyeColour(){
        System.out.println("Eye Colour is Blacck");
    }

}

 class Child extends Parent{
    // Overriding method
    void EyeColour(){
        System.out.println("Eye Colour Is Brown");

    }
    // Special Method 
    void Sports(){
        System.out.println("Intersted in Cricket");
    }
 }

public class Inheretence2 {
    public static void main(String args[]){
        Parent p = new Child();
        p.Height();
        p.EyeColour();
        ((Child)p).Sports();

}
}
