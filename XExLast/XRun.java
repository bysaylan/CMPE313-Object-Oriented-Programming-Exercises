
import javax.swing.JOptionPane;


public class XRun {
    public static void main (String[] args){
        
        XCat c = new XCat (5, "Bark");
        
        c.setName("Bark");
        c.setAge(5);
        c.setIsMaaml(true);
        c.Move();
        c.makeSound();
        
        
        XDuck d = new XDuck(6,"Ördek");
        
        d.Move();
        d.makeSound();
        d.setAge(6);
        d.setIsMaaml(true);
        d.setName("Öedek");
       
        JOptionPane.showMessageDialog(null,"\n" + c.getName()+ "\n" + c.getType());
    }
}
