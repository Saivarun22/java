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
public class Polymorphism {
    public static void main (String args[]){


        CargoFlight cf =new CargoFlight();

        PassengerFlight pf = new PassengerFlight();

        FocusFlight ff = new FocusFlight();

        Flight flight;

        flight=cf;
        flight.fly();
        flight.landing();

        flight=pf;
        flight.fly();
        flight.landing();

        flight=ff;
        flight.fly();
        flight.landing();

    }
    
}
