
interface design{

    void Design();
    void planning();

}
interface implementation extends design{

    void coding();
    void testing();

    class ImplementaionDetails implements implementation{
        public void Design(){
            String design="Designing";
            System.out.println("Designing Is: "+design);
        }
        public void planning(){
            String planning="Planning";
            System.out.println("Planning Is: "+planning);
        }
        public void coding(){
            String coding="Coding";
            System.out.println("Coding Is: "+coding);
        }
        public void testing(){
            String testing="Testing";
            System.out.println("Testing Is: "+testing);
        }
    }

}public class Interface3 {
    public static void main(String [] args){

        implementation.ImplementaionDetails obj = new implementation.ImplementaionDetails();
        obj.Design();
        obj.planning();
        obj.coding();
        obj.testing();
    }
    
}
