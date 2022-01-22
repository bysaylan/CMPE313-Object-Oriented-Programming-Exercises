package Carpet_Calc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Carpet {

    public static void main(String[] args) {
       
        int length=1,width=1,choice=0;
        String lengthStr, widthStr,choiceStr;
        final double LUXURY_PRICE = 24.99;
        final double ECONOMIC_PRICE = 9.99;
        double totalPrice = 0;
        DecimalFormat currency = new DecimalFormat ("TL ####,##0.00");
        
        lengthStr = JOptionPane.showInputDialog("Welcome to Carpet Calculator"
                + "\n\n Please enter the length of the room in terms of meters : ");
        
        widthStr = JOptionPane.showInputDialog(
                "\n Please enter the width of the room in terms of meters : ");
        
        
            if (isNumber (lengthStr)){
                 length = Integer.parseInt(lengthStr); 
            }
            else if (isNumber (widthStr)){
            width = Integer.parseInt(widthStr);
            }
            choice = JOptionPane.showConfirmDialog(null, 
                    "Do you want the LUXURY PRICE " + LUXURY_PRICE+ " ?");
            if (choice == 0)
                totalPrice = length * width * LUXURY_PRICE;
            else 
                totalPrice = length * width * ECONOMIC_PRICE;
            JOptionPane.showMessageDialog(null,
                    "\n Total Price = " + currency.format(totalPrice));
    }
    
    static boolean isNumber (String value){
        
        int valueInt;
        boolean control = true; 
         try{
             valueInt = Integer.parseInt(value);
         }  catch (NumberFormatException ex){
            control = false;
            JOptionPane.showMessageDialog(null, "Please enter a number ", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.print("Error:"+ex.getMessage());    
        }    
        return control;
    }
    
}
