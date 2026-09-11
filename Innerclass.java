class A {

   public void method(){

    System.out.println("This is A class ");

    }

}
public class Innerclass{

    public static void main(String [] args){

        A obj = new A(){

            public void method (){

                System.out.println("This is Inner Class");
            }
        };
        obj.method();

        A obj1 =new A();
        obj1.method();


    }

    }
