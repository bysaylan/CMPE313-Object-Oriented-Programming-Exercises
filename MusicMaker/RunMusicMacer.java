
import javax.swing.JOptionPane;


public class RunMusicMacer {
    
    public static void main(String[] args){
        
 
    BrassPlayer bp = new BrassPlayer ("Guitar Instrument","Bass Guitar");
    StringsPlayer sp = new StringsPlayer("Redless With Instrument","Flute");
    WoodPlayer wp = new WoodPlayer("Jazz Instrument","Truppet");



    bp.setName("Bass Guitar");
    bp.setInstrument("Guitar Instrument");
    bp.play();
    sp.getName();
    sp.play();
    sp.getInstrument();
    wp.getName();
    wp.getInstrument();
    wp.play();
    
     JOptionPane.showMessageDialog(null,"\n" + bp.getName()+"--"+sp.getInstrument()
             +"\n"+sp.getName()+ "--"+sp.getInstrument()+ "\n"+wp.getName()+ "--" + wp.getInstrument());
}
   }