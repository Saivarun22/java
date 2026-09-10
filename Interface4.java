interface Exebition{
    void Registration();
    void entry();
    void participation();
    void exit();
    int age=18;
}

class ExebitionDetails {

    public void exit(){
        String exit="Exit";
        System.out.println("Exebition Exit Is: "+exit);
    }
}

class ExebitionDetailsPractical extends ExebitionDetails implements Exebition{
    public void Registration(){
        //int age=29; the variable at the interface level is final and cannot be changed, so we can declare a new variable with the same name in the method scope.
        String Registration="Registration";
        System.out.println("Exebition Registration Is: "+Registration);
    }
    public void entry(){
        
        String entry="Entry";
        System.out.println("Exebition Entry Is: "+entry);
    }
    public void participation(){
        String participation="Participation";
        System.out.println("Exebition Participation Is: "+participation);
    }
}

public class Interface4{
    public static void main(String [] args){

        ExebitionDetailsPractical obj = new ExebitionDetailsPractical();
        obj.Registration();
        obj.entry();
        obj.participation();
        obj.exit();
    }
}
