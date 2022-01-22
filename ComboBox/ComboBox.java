
package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {

    private JCheckBox courseOOP = new JCheckBox("Object Oriented Programming");
    private JCheckBox courseNetwork = new JCheckBox("Computer Networks");
    private JCheckBox courseMobile = new JCheckBox("Mobile Programming");
    private JRadioButton radioCMPE = new JRadioButton("Computer Engineering");
    private JRadioButton radioISE = new JRadioButton("Information Systems Engineering");
    private JRadioButton radioSOFT = new JRadioButton("Software Engineering");
    private JCheckBox [] myCheckBoxes = {courseOOP, courseNetwork, courseMobile};
    private JRadioButton [] myRadioButtons = {radioCMPE, radioISE, radioSOFT};
    private String [] countries = {"Turkey","Cyprus","Nigeria","Jordan","Syria","Pakistan"};
    private JComboBox countryBox = new JComboBox(countries);
    private ButtonGroup radioGroup = new ButtonGroup();
    private JLabel infoLabel = new JLabel("Please select the courses you are taking this term and your department");
    private JLabel infoLabel2 = new JLabel("Courses you are taking are listed below:");
    private JLabel infoLabel3 = new JLabel("Select your country from the given options :");
    private JTextArea myTextArea = new JTextArea(10,50);
    private JButton btnSubmit = new JButton("Submit");
    private JButton btnClear= new JButton("Clear");
    private String courses ="";
    private String department ;
    private String country;

    public ComboBox() throws HeadlessException {
        setMinimumSize(new Dimension(750,450));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("More advanced GUI Components");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*about design of the form START */
        infoLabel.setFont(new Font("Verdana",Font.BOLD,14));
        infoLabel.setForeground(Color.BLUE);
        infoLabel2.setFont(new Font("Verdana",Font.BOLD,18));
        infoLabel3.setFont(new Font("Verdana",Font.BOLD,14));
        infoLabel3.setForeground(Color.BLUE);
        myTextArea.setFont(new Font("Verdana",Font.BOLD,14));
        myTextArea.setForeground(Color.BLUE);
        countryBox.setFont(new Font("Verdana",Font.BOLD,14));
        /*about design of the form END */

        add(infoLabel);



        for (JCheckBox eachBox : myCheckBoxes){
            add(eachBox);
            eachBox.setFont(new Font("Verdana",Font.BOLD,14));
        }

        for (JRadioButton eachButton : myRadioButtons){
            radioGroup.add(eachButton);
            add(eachButton);
            eachButton.setFont(new Font("Verdana",Font.BOLD,14));
        }

        add(infoLabel3);
        add(countryBox);
        add(infoLabel2);
        add(myTextArea);
        add(btnSubmit);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        courses ="";
        String allValues ="";

        if (e.getSource() == btnSubmit) {
            if (courseOOP.isSelected())
                courses += courseOOP.getActionCommand() + "\n";

            if (courseMobile.isSelected())
                courses += courseMobile.getActionCommand() + "\n";

            if (courseNetwork.isSelected())
                courses += courseNetwork.getActionCommand() + "\n";

            if (radioSOFT.isSelected())
                department = radioSOFT.getActionCommand();
            else if (radioISE.isSelected())
                department = radioISE.getActionCommand();
            else if (radioCMPE.isSelected())
                department = radioCMPE.getActionCommand();

            country = countryBox.getSelectedItem().toString();

            allValues += courses + "\nYour Department is " + department + "\nYour Country is " + country;

            myTextArea.setText(allValues);
        }

        else if (e.getSource() == btnClear){
            myTextArea.setText(allValues);

            for (JRadioButton eachButton : myRadioButtons)
                eachButton.setSelected(false);

            radioGroup.clearSelection();

            for (JCheckBox eachBox : myCheckBoxes)
                eachBox.setSelected(false);

            countryBox.setSelectedIndex(-1);

            /*courseOOP.setSelected(false);
            courseNetwork.setSelected(false);
            courseMobile.setSelected(false);*/
        }
    }
}