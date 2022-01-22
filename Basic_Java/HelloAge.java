
package Basic_Java;

import javax.swing.JOptionPane;

public class HelloAge {
    public static void main(String[] args) {
        String name=
                name = JOptionPane.showInputDialog("Lütfen isminizi giriniz");
        String ageStr;
             ageStr =  JOptionPane.showInputDialog("Lütfen yaşınızı giriniz");
             
             // int age =  Integer.parseInt(JOptionPane.showInputDialog("Lütfen yaşınızı giriniz"));
             // alternatif code
        
              int age = Integer.parseInt(ageStr);
              
              JOptionPane.showMessageDialog(null, "\n İsminiz: " + name + "\n Yaşınız: " +ageStr);
              
              
                
    }
}
