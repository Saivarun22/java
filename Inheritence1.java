 class GrandFather{

    void DisplayGrandFather(){
        System.out.println("Displaying Grand Father");
    }
 }
 class Father extends GrandFather{

    void DisplayFather(){
        System.out.println("Displaying Father");
    }
 }
  class Son extends Father{

    void DisplaySon(){
        System.out.println("Displaying Son");
    }

  }
public class Inheritence1 {

    public static void main(String args[]){
        Son s = new Son();
        s.DisplayGrandFather();
        s.DisplayFather();
        s.DisplaySon();


        
    }
    
}
