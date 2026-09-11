interface A{

     int execution (int i);
     double Practice(double y);
}
public class FunctionalInterface {
    public static void main(String [] args){

    

    A obj  = new A(){

         public int execution(int i){
            int res= i*i;
            return res;
            
         }

         public double Practice(double y){
            double res=y*y;
            return res;
            
         }

    

    };

   
    System.out.println("Execution result:" + obj.execution(7));
    System.out.println("Practice result:" + obj.Practice(9));
    
}
}
