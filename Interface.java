interface demo {

    void sum();
    void mul();
    
}
class Example implements demo{

    public void sum(){
        int res=10+20;
        System.out.println("Result Of Sum Is: " + res);
    }
    public void mul(){
        int res=10*20;
        System.out.println("Result Of Multiplication Is: " + res);
    }
}

class Examples implements demo{

    public void sum(){
        int a=10;
        int b=90;
        int res=a+b;
        System.out.println("Result Of Sum Is: " + res);
    }
    public void mul(){
        int a=10;
        int b=50;
        int res=a*b;
        System.out.println("Result Of Multiplication Is: " + res);
    }
}

public class Interface{
     public static void main (String[]args){
        Example obj = new Example();
        obj.sum();
        obj.mul();

        Examples obj1= new Examples();
        obj1.sum();
        obj1.mul();
     }
}