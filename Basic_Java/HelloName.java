
package Basic_Java;

import javax.swing.JOptionPane;


public class HelloName {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog ("Input");
        
        System.out.println("Hello " + name);
    }
}
