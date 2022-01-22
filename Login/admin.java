
package Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class admin extends JFrame implements ActionListener {
    JLabel welcomeLabel = new JLabel ("Welcome");
    JButton btnLogout = new JButton ("Logout");
    JPanel northPanel = new JPanel ();
    JPanel southPanel = new JPanel ();
    private String adminUser = "admin";
    private String adminPassword = "admin";
   
    
    public admin(String title) throws HeadlessException {
        setTitle(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize (500, 200);
        setLayout (new BorderLayout());
        northPanel.add(welcomeLabel);
        southPanel.add(btnLogout);
        add("North", northPanel);
        add("South", southPanel);
        setVisible(true);
        setResizable(false);
        
        this.btnLogout.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        new Layout ("Type username and password");
        setVisible(false);
    }
    public String getAdminUSer (){
        return adminUser;
    }
    public String getAdminPassword () {
        return adminPassword;
    }
}
