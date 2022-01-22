
package Check_and_Radio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUICheck extends JFrame implements ActionListener {
    JLabel info = new JLabel("Select one or more hobbies from the boxes given below:");
    JLabel info2 = new JLabel("Select a color below: ");
    JCheckBox gymCheck = new JCheckBox ("Gym");
    JCheckBox footballCheck = new JCheckBox("Football");
    JCheckBox netFlixCheck = new JCheckBox("NetFlix");
    JLabel labelHobbies = new JLabel("Hobilerinizi Seçiniz");
    JButton btnSubmit = new JButton("Submit");
    String hobbies ="Hobiler";
    
    JRadioButton redBtn = new JRadioButton("Red");
    JRadioButton blueBtn = new JRadioButton("Blue");
    JRadioButton greenBtn = new JRadioButton("Green");
    
    ButtonGroup colorsGroup = new ButtonGroup(); 
    
    GUICheck (){
        
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (380,200));
        setTitle ("GUI Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());

        colorsGroup.add(redBtn);
        colorsGroup.add(greenBtn);
        colorsGroup.add(blueBtn);
        
        add(info);
        add(gymCheck);
        add(footballCheck);
        add(netFlixCheck);
        add(info2);
        add(redBtn);
        add(blueBtn);
        add(greenBtn);
        add(btnSubmit);
        add(labelHobbies);
        
        /*
        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        */
        
        btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent action) {
        
        /*
        if (action.getSource() == redBtn){
        
            getContentPane().setBackground(Color.RED);
        }
        
        else if (action.getSource() == greenBtn){
            getContentPane().setBackground(Color.GREEN);
        }
        
        else if (action.getSource() == blueBtn){
            getContentPane().setBackground(Color.BLUE);
        }*/
        
        
       hobbies="";
        
         if (gymCheck.isSelected())
             hobbies += "Gym ";
         if (footballCheck.isSelected())
             hobbies += "Football ";
         if (netFlixCheck.isSelected())
             hobbies += "Netflix ";
      
         if (greenBtn.isSelected())
              getContentPane().setBackground(Color.GREEN);
         else if (redBtn.isSelected())
              getContentPane().setBackground(Color.RED);
         else if (blueBtn.isSelected())
              getContentPane().setBackground(Color.BLUE);

         labelHobbies.setText(hobbies);
         labelHobbies.setFont(new Font("Verdana",Font.BOLD,22));
         labelHobbies.setForeground(Color.BLUE);
    }
    
}
