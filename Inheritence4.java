
class Animal{
     
    Animal(){
        System.out.println("Default Animnal Constructor");
    }

    Animal(int age){
        System.out.println("Parametrized Animal Constructor "+age);
    }
}
class Tiger extends Animal{
    Tiger(){
        this(5);
        System.out.println("Default Tiger constructor");
        
    }
    Tiger(int noOfGroups){
        super(8);
        System.out.println("Parametrized Tiger Constructor "+noOfGroups);
    }
}
public class Inheritence4 {
    public static void main (String args[]){
        Tiger t =new Tiger();
        //Tiger t1 = new Tiger(8);
    }
    
}
