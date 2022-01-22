
package Basic_Java;

import javax.swing.JOptionPane;

public class SwingExample {
   
    public static void main(String[] args) { 
        String name;
        int yearBorn=0,age;
        int currentYear = 2021;
        String yearBornStr;
        
        name = JOptionPane.showInputDialog("Lütfen isminizi girin");
        yearBornStr = JOptionPane.showInputDialog("Hangi yılda doğdunuz");
       
        //converting the String value to an actual integer value 
        try{
       yearBorn = Integer.parseInt(yearBornStr);
               age = currentYear - yearBorn;
        
       
        JOptionPane.showMessageDialog(null, "Adın" + name);
        JOptionPane.showMessageDialog(null, "Yaşın" + age);
       }
       catch(Exception err){
       JOptionPane.showMessageDialog(null, "Lütfen bir Numara giriniz", "Error: Bir Yıl numarası gibi", 
               JOptionPane.ERROR_MESSAGE);
       }

}
}