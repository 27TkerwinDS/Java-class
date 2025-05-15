import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayoutTest {
    private JFrame frame;
    private JPanel panel;
    public GridBagLayoutTest(){
        //create frame
        frame=new JFrame("GridBagLayout");
        frame.setSize(100,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel=new JPanel(new GridBagLayout());
        //create constraints object
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.gridheight=1;
        constraints.gridwidth =1; 
        constraints.weightx=1.0;
        constraints.weighty=1.0;
        constraints.fill=GridBagConstraints.BOTH;
        JButton btn=new JButton("*");
        constraints.gridx=0;
        constraints.gridy=0;
        panel.add(btn, constraints);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            GridBagLayoutTest app=new GridBagLayoutTest();
        });
    }
}
