 class Flight{

    public void fly(){
        System.out.println("Flight is flying");
    }

    public void landing(){
        System.out.println("Flight is about to land ");
    }
 }
 class CargoFlight extends Flight{
    public void fly(){
        System.out.println("CargoFlight is flying");
    }

    public void landing(){
        System.out.println("Flight is about to land on Cargo Runway ");
    }


 }
class PassengerFlight extends Flight{
    public void fly(){
        System.out.println("PassingerFlight is flying");
    }

    public void landing(){
        System.out.println("Flight is about to land on Passinger Rumway ");
    }
}

class FocusFlight extends Flight{
    public void fly(){
        System.out.println("FocusFlight is flying");
    }

    public void landing(){
        System.out.println("Flight is about to land on Focus Runway ");
    }
    
}

class Observation {
     public void Permit(Flight flight){
        flight.fly();
        flight.landing();
     }
}
public class polymorphism2 {
    public static void main (String args[]){

        CargoFlight cf =new CargoFlight();
        PassengerFlight pf= new PassengerFlight();
        FocusFlight ff= new FocusFlight();
        Observation o=new Observation();
        o.Permit(cf);
        o.Permit(pf);
        o.Permit(ff);

    }
    
}
