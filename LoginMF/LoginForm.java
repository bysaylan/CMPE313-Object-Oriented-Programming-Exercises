

package LoginMF;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    private JLabel labelusername = new JLabel("Username: ");
    private JLabel labelpassword = new JLabel("Password: ");
    private JTextField  txtusername = new JTextField (15);
    private JPasswordField   txtpassword = new JPasswordField  (15);

    JButton btnLogin = new JButton("Login");


    JRadioButton adminBtn = new JRadioButton("Admin");
    JRadioButton studentBtn = new JRadioButton("Student");

    ButtonGroup loginGroup = new ButtonGroup();



    public LoginForm(String login) {
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (300,175));
        setTitle ("GUI Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());
        setVisible(true);

        loginGroup.add(adminBtn);
        loginGroup.add(studentBtn);

        add(labelusername);
        add(txtusername);
        add(labelpassword);
        add(txtpassword);

        add(adminBtn);
        add(studentBtn);
        add(btnLogin);

        this.adminBtn.addActionListener(this);
        this.studentBtn.addActionListener(this);
        this.btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btnLogin){
            String username = this.txtusername.getText();
            String password = this.txtpassword.getText();


            if (adminBtn.isSelected()){
                if (username.equals("22010596")&&password.equals("2323")){
                    Main classmain = new Main("Login");
                    setVisible(false);
                } 
                
                else{
                    JOptionPane.showMessageDialog(this,
                            "Please type correct username and password",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else if (studentBtn.isSelected()){
                if (username.equals("22010596")&&password.equals("2323")){
                    Main classmain = new Main("Login");
                    classmain.btninfo.setEnabled(false);
                    setVisible(false);
                } else{
                    JOptionPane.showMessageDialog(this,
                            "Please type correct username and password",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else{
                JOptionPane.showMessageDialog(this,
                        "Please select student/admin",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }

        }

    }
}
