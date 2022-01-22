package Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {


    private JLabel infoLabel = new JLabel("Please select options from the Menu");
    private JMenuBar navigationMenu = new JMenuBar();
    private JMenu formMenu = new JMenu("Form");
    private JMenu colorMenu = new JMenu("Color");
    private JMenu subformMenu = new JMenu("This Form");
    private JMenuItem newForm = new JMenuItem("New Form");
    private JMenuItem closeForm = new JMenuItem("Close Form");
    private JMenuItem exitApplication = new JMenuItem("Exit Application");
    private JMenuItem redColor = new JMenuItem("Red");
    private JMenuItem blueColor = new JMenuItem("Blue");
    private JMenuItem greenColor = new JMenuItem("Green");

    private JMenuItem [] myMenuItems = {newForm, closeForm, exitApplication, redColor, blueColor, greenColor};

    public Menu() throws HeadlessException {
        setMinimumSize(new Dimension(750,450));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("More advanced GUI Components");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*about design of the form START */
        infoLabel.setFont(new Font("Verdana",Font.BOLD,14));
        infoLabel.setForeground(Color.RED);
        formMenu.add(subformMenu);
        subformMenu.add(newForm);
        subformMenu.add(closeForm);
        formMenu.add(exitApplication);
        colorMenu.add(redColor);
        colorMenu.add(blueColor);
        colorMenu.add(greenColor);
        navigationMenu.add(formMenu);
        navigationMenu.add(colorMenu);
        setJMenuBar(navigationMenu);
        /*about design of the form END */

        for (JMenuItem eachItem : myMenuItems)
            eachItem.addActionListener(this);


        add(infoLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newForm)
                new Menu().setVisible(true);

        else if (e.getSource() == closeForm)
            dispose();

        else if (e.getSource() == exitApplication)
            System.exit(0);

        else if (e.getSource() == redColor)
            getContentPane().setBackground(Color.RED);

        else if (e.getSource() == greenColor)
            getContentPane().setBackground(Color.GREEN);

        else if (e.getSource() == blueColor)
            getContentPane().setBackground(Color.BLUE);
    }
}
