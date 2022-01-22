
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Vehicle extends JFrame implements ActionListener {
    protected String type;
    protected String model;
    
    
    public Vehicle (){
    }
    public Vehicle (String type, String model){
        this.type = type;
        this.model=model;
    }
        public void setType(String t){
        this.type=t;
        }        
        public String isType(){
        return type;    
        }
        
        public void setModel(String m){
            this.model = m;
        }
        public String getModel(){
            return model;
        }
        
        public void move(){
            System.out.println("\nThese vehicles are move");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }
}
