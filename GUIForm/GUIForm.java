package GUIForm;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.Calendar;


public class GUIForm extends JFrame implements ActionListener{
    JLabel nameInfo = new JLabel ("Please enter your name:     ");
    JLabel surnameInfo = new JLabel ("Please enter your surname:     ");
    JLabel ageInfo = new JLabel ("Please enter your age:     ");
    JTextField nameText = new JTextField(15);
    JTextField surnameText = new JTextField(15);
    JTextField ageText = new JTextField(15);
    
    JButton btnSubmit = new JButton ("Submit");
    JButton btnClear = new JButton ("Clear");
    
    GUIForm(String title) {
        setTitle(title);
        setSize(500,400);
        setLayout (new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(nameInfo);
        add(nameText);
        add(surnameInfo);
        add(surnameText);
        add(ageInfo);
        add(ageText);
        add(btnSubmit);
        add(btnClear);
        
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name, surname, ageStr;
            String output="";
            int age = 0, yearBorn = 0;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            
            name = nameText.getText().toString();
            surname = surnameText.getText().toString();
            ageStr = ageText.getText().toString();
            
            try{
                age = Integer.parseInt(ageStr);
                yearBorn=currentYear - age;
                
                
                output = "\n Hello " + name + " " + surname + " \n İt Seems Like You Were Born in: " + yearBorn;
                JOptionPane.showMessageDialog(this, output);
                
            }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a number to the age field","Error",
            JOptionPane.ERROR_MESSAGE);
            
                System.out.println(ex.getMessage());
            }
        }
        else if (e.getSource()== btnClear) {
            nameText.setText(""); //boş isim alanı
            surnameText.setText("");
            ageText.setText("");
            nameText.requestFocus(); // starting location of the cursor
            
        }
    }
}
