
 class Plane{

 }class flyingPlane  extends Plane{

 }
  class Human{

     public void sleep(){ //Overriddenmethod
      System.out.println("Humans needs sleep");

    }
     public int age(int age){
        
        System.out.println("my age is " + age);
        return age;
     }

     public Plane age(){ //OverridingMethod
        
        System.out.println("my age is in Plane ");
        Plane p= new Plane();
        return p;
     }

     public int tasks(int a,int b,int c){
      System.out.println("task1 : "+a+" Member's Allocated");
      System.out.println("task2 : "+b+" Member's Allocated");
      System.out.println("task3 : "+c+" Member's Allocated");
      return a;

     }
  }


  class Student extends Human{

    public void sleep(){
       //Overridingmethod
        System.out.println("Students needs sleep");
    }
    // protected void sleep(){ //Overriddenmethod
    //     System.out.println("Students needs sleep");
    
    // We Cannot Reduce Visability of Overridden Methods(Parent class Method)(public -> Protected) 
    // However We Can Increase Visability(default -> public)


    // public void age(int age){ Overriddengmethod
        //     System.out.println("my age is " + age);
        
    // we cannot change return type of Overridden method 

    public flyingPlane age(){ //OverridingMethod
        
        System.out.println("my age is in flyingPlane");
        flyingPlane fp= new flyingPlane();
        return fp;
     }

     //We can Change the Overridden methods However We Can Make This .the return Type must be Co-Variant Return Type
     //(Is-A Relation Must be Exists between return types )

    //  public int tasks(int a,int b){
    //   System.out.println("task1 :"+a);
    //   System.out.println("task2 :"+b);
      
        //We Cannot  Change The Parameter list in Overriden methods in child class if we dom so it will be 
        //  consider as specilized method of child class by following the concepts of Method Overloading
     }
     
    
  
        
  
    
  



public class inheritance5 {
  public static void main(String args[]){

  
    Student s = new Student();
    s.age(30);
    s.age();
    s.sleep();
    s.tasks(4,5,6);
  }

}
