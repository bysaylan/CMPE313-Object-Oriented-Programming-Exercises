
package LoginWithPass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class LoginForm extends JFrame implements ActionListener {
    
    
    JPanel panel = new JPanel();
    JTextField usernameText = new JTextField(15);
    JPasswordField passwordText = new JPasswordField(15);
    JButton submit = new JButton("Log in");
    JButton clear = new JButton("Clear Fields");
    LoginForm(){
        
        setMinimumSize(new Dimension(400,180));
        setTitle("Login - type username and password");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(800,400);
        setVisible(true);
        setResizable(false);

        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Enter your username and password please"));
        panel.setPreferredSize(new Dimension(320,100));
        
        panel.add(new JLabel("Username : "));
        panel.add(usernameText);
        panel.add(new JLabel("Password : "));
        panel.add(passwordText);
        
        
        
        add(panel);
        add(submit);
        add(clear);
        
        submit.addActionListener(this);
        clear.addActionListener(this);
    }
    
    
    public void actionPerformed (ActionEvent a){
    
        if (a.getSource() == submit){
        //System.out.println("Connect to profile");
        
        String username = this.usernameText.getText();
        String password = this.passwordText.getText();
        
        ConnectionBetweenLoginAndProfile conn = new ConnectionBetweenLoginAndProfile(username,password);
        conn.Connection();
        dispose();
        
        }
        else if (a.getSource() == clear){
        this.usernameText.setText("");
        this.passwordText.setText("");
        }
    
    }
}
