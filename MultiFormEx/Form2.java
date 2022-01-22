
package MultiFormEx;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form2 extends JFrame implements ActionListener {
    
    private JLabel nameLabel = new JLabel("Name");
    private JLabel surnameLabel = new JLabel("Surname");
    private JLabel genderLabel = new JLabel("Gender");
    private JLabel nationalityLabel = new JLabel("Nationality");
    private JLabel lecturesLabel = new JLabel("Lectures");
    private JLabel TextArea = new JLabel("Profiles");
    private JButton formButton = new JButton("Return Back");
    private JButton closeButton = new JButton("Close");
    private JPanel panel = new JPanel();
    
    Form2 (String formName){
    
    setSize(new Dimension(400,280));
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle(formName);
    setResizable(false);
    setLocationRelativeTo(null);
    
    
    formButton.setForeground(Color.BLUE);
    closeButton.setForeground(Color.BLUE);
    
    panel.setPreferredSize(new Dimension (380,200));
    panel.setBorder(BorderFactory.createTitledBorder("Your Profile Information"));
    
    nameLabel.setForeground(Color.BLUE);
    surnameLabel.setForeground(Color.BLUE);
    genderLabel.setForeground(Color.BLUE);
    nationalityLabel.setForeground(Color.BLUE);
    lecturesLabel.setForeground(Color.BLUE);
    TextArea.setForeground(Color.BLUE);
    nameLabel.setFont(new Font("Verdana",Font.BOLD,16));
    surnameLabel.setFont(new Font("Verdana",Font.BOLD,16));
    genderLabel.setFont(new Font("Verdana",Font.BOLD,16));
    nationalityLabel.setFont(new Font("Verdana",Font.BOLD,16));
    lecturesLabel.setFont(new Font("Verdana",Font.BOLD,16));
    TextArea.setFont(new Font("Verdana",Font.BOLD,16));
    
   
    
    panel.add(new JLabel("Name:"));
    panel.add(nameLabel);
    
    panel.add(new JLabel("Surname:"));
    panel.add(surnameLabel);
    
    panel.add(new JLabel("Gender:"));
    panel.add(genderLabel);
    
    panel.add(new JLabel("Nationality:"));
    panel.add(nationalityLabel);
    
    panel.add(new JLabel("Your Lectures are:"));
    panel.add(lecturesLabel);
    
    panel.add(new JLabel("Profile:"));
    panel.add(TextArea);
    

    add(panel);
    add(closeButton);
    add(formButton);
    
    setVisible(true);
    
    closeButton.addActionListener(this);
    formButton.addActionListener(this);
    
    
    }
    @Override
    public void actionPerformed(ActionEvent event){
        
        if (event.getSource() == formButton){
           new Form2("");
           dispose();
        }
        else if (event.getSource() == closeButton){
           dispose();
        }
    
    }

    public void setName(String value){
    this.nameLabel.setText(value);
    }
    public void setSurname(String value){
    this.surnameLabel.setText(value);
    }
    public void setGender(String value){
    this.genderLabel.setText(value);
    }
    public void setNationality(String value){
    this.nationalityLabel.setText(value);
    }
    public void setTextArea(String value){
    this.TextArea.setText(value);
    }
    public void setLectures(String value){
    this.lecturesLabel.setText(value);
    }
    
}