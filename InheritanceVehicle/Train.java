
import javax.swing.JOptionPane;


    public class Train extends Vehicle {
        private int capasty;
       
        
        public Train (String model, String type){
            super(model,type);
        }
        public void setCapasty (int capasty){
            this.capasty=capasty;
        }
        public int getCapasty(){
            return capasty;
   
        }
        
        public void modelandcapasty(){
            JOptionPane.showMessageDialog(null,"The Train Model is:  " +model + "\n The Train Capasty is: " + capasty);
        }
        
        public void move (String start, String end){
            System.out.println("This train travel is : " + start + " to " + end );
}
}