
package LoginMF;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormInfo extends JFrame implements ActionListener{

    private JLabel labelTitle = new JLabel("22010596 Ahmet");


    FormInfo(){
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (380,100));
        setTitle ("GUI Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());


        add(labelTitle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
