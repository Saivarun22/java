
abstract class A{
     
    abstract public void method();
    abstract public void implementation();
    public static void main(String [] args){
        A obj = new A(){
             public void method (){
                System.out.println( "This is Anonymous method Inner Class");
             }
             public void implementation(){
                System.out.println("This is Anonymous implementation Inner Class");
             }
        };

        obj.method();
        obj.implementation();
    }
}