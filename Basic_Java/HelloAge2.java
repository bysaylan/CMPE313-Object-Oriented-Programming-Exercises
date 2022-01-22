
package Basic_Java;

import static javax.swing.JOptionPane.*;


public class HelloAge2 {
    public static void main(String[] args) {
        String name = showInputDialog("Lütfen İsminizi Griniz"); 
        
        String AgeStr = showInputDialog("lütfen yaşınızı giriniz");
        
                int age = Integer.parseInt(AgeStr);
                
                showMessageDialog(null,"\n Adınız: " + name +"\n Yaşınız: " +  age);
                
    }
 
}
