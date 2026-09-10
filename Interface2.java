interface student{
     void name();
     void subject();

}
abstract class Details implements student{

    public void name(){
        String name="Varun";
        System.out.println("Student Name Is: "+name);
    }
}

class DetailedDetails extends Details{
    public void subject(){
        String subject="Java";
        System.out.println("Student Subject Is: "+subject);
    }


    

}
public class Interface2 {
    public static void main(String [] args){

        DetailedDetails obj = new DetailedDetails();
        obj.name();
        obj.subject();
    }
    
}
