
package Login;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Layout extends JFrame implements ActionListener {
    
    JButton btnSubmit = new JButton("Login");
    JButton btnClear = new JButton ("Clear");
    JTextField userNameText = new JTextField (15);
    JPasswordField passwordText = new JPasswordField (15);
    JLabel userLabel = new JLabel ("Enter username: ");
    JLabel passwordLabel = new JLabel ("Enter password: ");
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel ();
    JPanel userPanel = new JPanel ();
    JRadioButton btnRadio = new JRadioButton("Teacher");
    JRadioButton btnRadio2 = new JRadioButton("Student");
    
    private int counter = 0;
    
    public Layout(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (300,200);
        setLayout (new BorderLayout());
        setResizable(false);
        
        userPanel.add(userLabel);
        userPanel.add(userNameText);
        userPanel.add(passwordLabel);
        userPanel.add(passwordText);
        //userPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        userPanel.setPreferredSize(new Dimension (350,100));
        southPanel.add(btnSubmit);
        southPanel.add(btnClear);
        northPanel.add(userPanel);
        add("North",northPanel);
        add(southPanel);
        userPanel.add(btnRadio);
        userPanel.add(btnRadio2);
        this.btnClear.addActionListener(this);
        this.btnSubmit.addActionListener(this);
        
        setVisible(true);
    }
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()== btnSubmit){
            String username = this.userNameText.getText();
            String password = this.passwordText.getText();
            
            admin login = new admin("Login to Admin Panel");
            
            if (counter <3){
                JOptionPane.showMessageDialog(this, 
                "Sorry, You attempted a false login more than 3 times", 
                "Error", JOptionPane.ERROR_MESSAGE);    
        }
            if ((username.equals(login.getAdminUSer()))&& (password.equals(login.getAdminUSer()))){
    
        login.welcomeLabel.setText("Welcome Admin");
        login.setVisible(true);
        setVisible(false); //hide the current form
    }
            else {
                JOptionPane.showMessageDialog(this, 
                        "Please type correct name and pass",
                        "Error", JOptionPane.ERROR_MESSAGE);
                ++counter; 
            }
    }
        else if (ae.getSource() == btnClear) {
            this.userNameText.setText("");
            this.passwordText.setText("");
            this.userNameText.requestFocus();
        }
    }
}
