// enum Status{
//     Running,Pending,Failed,Success
//  }
  
//  public class enums {
//     public static void main(String[] args) {
//       //   Status [] ss=Status.values();
//       //   for(Status s:ss){

      
//       //   System.out.println( s + ":" + s.ordinal());
//       //   }

//       Status s=Status.Success;

//       switch (s) {
//          case Running :
//          System.out.println("All good");

            
//             break;
//          case Pending:
//          System.out.println("please wait");

//             break;

//          case Failed:
//          System.out.println("please try again");
      
//          default:
//          System.out.println("Done");
//             break;
         
//          }
//      }
    
// }

enum Laptop{
   Mackbook(145000) ,lenovo(50000), apple(200000),dell();

   private int price;

   private Laptop(){
      price =50000;
   }

   private Laptop(int price) {
      this.price = price;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   
}
class enums{
   public static void main(String[] args) {

      for(Laptop lap :Laptop.values()){
         System.out.println(lap +":"+ lap.getPrice());
      }
      
      // Laptop lap =Laptop.Mackbook;
      // System.out.println(lap +":"+ lap.getPrice() );
   }
}