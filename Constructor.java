import java.util.*;
public class Constructor{
    private int id ;
    private String Name;
    private String Branch;
    
    // Prametrized Constructor
    public Constructor(int id,String Name,String Branch){
        this.id=id;
        this.Name=Name;
        this.Branch=Branch;
    }
  // Default Constructor
    public Constructor(){

    }
  // Construtor With Single Parameter
    public Constructor(String Name){
        this.Name=Name;

    }

    public void Display1(){
        System.out.println(" id = "+id);
        System.out.println(" Name = "+Name);
        System.out.println(" Branch = "+Branch);

    }

    public static void main (String[] args){
        Constructor c =new Constructor(8,"Varun","CSE");
        Constructor c1= new Constructor("Varun");
        c.Display1();
        c1.Display1();

    }
}