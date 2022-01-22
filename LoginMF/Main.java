

package LoginMF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener{


    private JLabel lbltitle = new JLabel("Multi FORM");
    public JButton btninfo = new JButton("InfoForm");
    JButton btndisplay = new JButton("Display");
    JButton btnabout = new JButton("About Person");

    public Main(String login) {
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (380,150));
        setTitle ("GUI Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());
        setVisible(true);


        add(lbltitle);
        add(btninfo);
        add(btndisplay);
        add(btnabout);

        this.btndisplay.addActionListener(this);
        this.btninfo.addActionListener(this);
        this.btnabout.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btndisplay){
        FormInfo classform1 = new FormInfo();
        classform1.setVisible(true);
        }

        if (e.getSource() == btninfo){
            FormInfo classform2 = new FormInfo();
            classform2.setVisible(true);
        }

        if (e.getSource() == btnabout){
            FormInfo classform3 = new FormInfo();
            classform3.setVisible(true);
        }


    }
}
