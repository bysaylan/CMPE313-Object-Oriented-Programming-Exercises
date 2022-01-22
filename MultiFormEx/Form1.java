
package MultiFormEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Form1 extends JFrame implements ActionListener {
    
    
    private JTextField nameTextField = new JTextField(15);
    private JTextField surnameTextField = new JTextField(15);
    private JRadioButton maleRadio = new JRadioButton("Male");
    private JRadioButton femaleRadio = new JRadioButton("Female");
    private JCheckBox lecture1checkBox = new JCheckBox("Operation System");
    private JCheckBox lecture2checkBox = new JCheckBox("Object Oriented Programming");
    private JCheckBox lecture3checkBox = new JCheckBox("System Programming");
    private String [] nations = {"","Turkish","Cyprus","Nigerian","Jordan","Other"};
    private JComboBox nationalityComboBox = new JComboBox(nations);
    private JLabel infoLabel = new JLabel("About You:");
    private JTextArea myTextArea = new JTextArea(10,20);
    private JButton submitButton = new JButton("Submit");
    private JButton clearButton = new JButton("Clear");
    private ButtonGroup genderGroup = new ButtonGroup();
    private JPanel panel = new JPanel();
    private JLabel infoLabel2 = new JLabel("*İndicates Compulsory Fields:");
    private String lectures ="";
   
    
            
    Form1 (String formName){
    
    setSize(new Dimension(375,510));
    setResizable(false);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle(formName);
    setLocationRelativeTo(null);
    
    genderGroup.add(maleRadio);
    genderGroup.add(femaleRadio);
    
    
    panel.setPreferredSize(new Dimension (320,430));
    panel.setBorder(BorderFactory.createTitledBorder("Please fill the form"));
    
    submitButton.setForeground(Color.BLUE);
    clearButton.setForeground(Color.BLUE);
    myTextArea.setFont(new Font("Verdana",Font.BOLD,14)); 
    infoLabel.setFont(new Font("Verdana",Font.BOLD,14));
    infoLabel2.setFont(new Font("Verdana",Font.BOLD,12));
    infoLabel2.setForeground(Color.RED);
    
    add (panel); 
    panel.add (new JLabel("Your Name* : "));
    panel.add (nameTextField);
    panel.add (new JLabel("Your Surname* : "));
    panel.add (surnameTextField);
    panel.add (new JLabel("Select Your Gender* :"));
    panel.add (maleRadio);
    panel.add (femaleRadio);
    panel.add (new JLabel("Select Your Nationality* :"));
    panel.add (nationalityComboBox);
    panel.add(infoLabel);
    panel.add(myTextArea);
    panel.add (new JLabel("Lectures you are taking now :"));
    panel.add(lecture1checkBox);
    panel.add(lecture2checkBox);
    panel.add(lecture3checkBox);
   
    
   
   
    add(infoLabel2);
    add(submitButton);
    add(clearButton);
 
    
    
    
    setVisible(true);
    submitButton.addActionListener(this);
    clearButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        if (event.getSource() == submitButton)
        {
                if (validateFields() == true){
                    
                    
                    
                    Form2 formObject = new Form2("Profile Information");
                    formObject.setName(this.nameTextField.getText());
                    formObject.setSurname(this.surnameTextField.getText());
                    formObject.setTextArea(this.myTextArea.getText());
                      
                    if (this.maleRadio.isSelected())
                           formObject.setGender("Male");
                    else if (this.femaleRadio.isSelected())
                           formObject.setGender("Female");
                       
                    formObject.setNationality("" + this.nationalityComboBox.getSelectedItem());
                       
                    String lectures = "";
                    
                    formObject.setLectures(lectures);
                       if (this.lecture1checkBox.isSelected())
                       lectures += "Operation System";
                       
                    formObject.setLectures(lectures);
                       if (this.lecture2checkBox.isSelected())
                       lectures += "\n" + "Object Oriented Programming";
                       
                    formObject.setLectures(lectures);
                       if (this.lecture3checkBox.isSelected())
                       lectures += "\n" + "System Programming";

                    }
        }
        
        else if (event.getSource() == clearButton){
            this.nameTextField.setText("");
            this.surnameTextField.setText("");
            this.genderGroup.clearSelection();
            this.nationalityComboBox.setSelectedIndex(0);
            this.lecture1checkBox.setSelected(false);
            this.lecture2checkBox.setSelected(false);
            this.lecture3checkBox.setSelected(false);
            this.myTextArea.setText("");
         
        }
    }
    
    private boolean validateFields(){
    
        boolean control = true;
        
        if (this.nameTextField.getText().length()<1)
            {
            JOptionPane.showMessageDialog(panel, "Please enter your name", "No name error", JOptionPane.ERROR_MESSAGE);
            control = false;
            }
        
        else if (this.surnameTextField.getText().length()<1)
            {
            JOptionPane.showMessageDialog(panel, "Please enter your surname", "No name error", JOptionPane.ERROR_MESSAGE);
            control = false;
            }
        
        else if ((this.maleRadio.isSelected()==false) && (this.femaleRadio.isSelected()==false))
            {
            JOptionPane.showMessageDialog(panel, "Please select your sex", "No selection", JOptionPane.ERROR_MESSAGE);
            control = false;
            }
        
        return control;
    }
    
    
    
}