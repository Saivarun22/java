
 class Human{
    
    int age=20;
    Human (){
        System.out.println("Default Constructor");
    }
    
    void practice(){
    System.out.println("I am a Human");
    }

} 
class Employee extends Human{

    int age =18;
    Employee(){
        System.out.println("Employee Constructor");

    }
    void practice(){
    System.out.println("I am an Employee");
    System.out.println(age);
    System.out.println(super.age);
    }

   
}
    
    public class Inheritence3 {

        public static void main (String args[]){

            Employee e = new Employee();
            e.practice();
            
        }
    
}
