 class Human{
     void Study(){
        System.out.println("Enroled a course");
     }
     void Certified(){
        System.out.println("Certified in that course");
     }
 }
 class Developer extends Human{


 }

public class Inheritence {
    public static void main (String args []){

        Developer d= new Developer();
    d.Study();
    d.Certified();

    }

    

    
}
