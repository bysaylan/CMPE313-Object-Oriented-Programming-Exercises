 
package LoginWithPass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ProfileForm extends JFrame implements ActionListener {
    
    
    JLabel profileText = new JLabel("<profile info>");
    JButton button = new JButton ("<button>");
    
        ProfileForm(String username) {
        setMinimumSize(new Dimension(400,180));
        setTitle("Profile");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(800,400);
        setVisible(true);
        setResizable(false);
        
        add(profileText);
        
        profileText.setFont(new Font("verdana", Font.BOLD, 12));
        profileText.setForeground(Color.BLUE);
        
        add(button);
        
        button.addActionListener(this);
        
        }
        
        public void actionPerformed (ActionEvent a){
            
            new LoginForm();
            dispose();
            
        }
    
}
