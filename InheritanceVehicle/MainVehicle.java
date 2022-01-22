
public class MainVehicle {
    
    public static void main(String[] args) {
       
        Train train = new Train("Transport Train", "Bachman");
        train.setCapasty(170);
        train.move("Koln", "Amsterdam");
        System.out.println("Train Model is: " + train.getModel() 
                + "\nTrain Capasty is: " + train.getCapasty() );
        
        Bus bus = new Bus("Arriva Bus", "Double Decker 400");
        bus.setKms(40000);
        bus.setGas(true);
        bus.move("London Bridge","Greenwich");
        System.out.println("The Bus Model is: " + bus.getModel()
                + "\nThe Bus Distince is: " + bus.getKms());
        
        Vehicle[] myVehicle = {train, bus};
        for (Vehicle eachVehicle:myVehicle ){
            eachVehicle.move();
          
        }

    }
}
