import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

public class FlowLayoutdif2{
    JFrame frame;
    JPanel panel;
    JPanel cPanel;
    public FlowLayoutdif2(int width, int height){
        frame=new JFrame();
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel(new BorderLayout());
        JLabel label=new JLabel("north");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label,BorderLayout.NORTH);

         label=new JLabel("South");
         label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label,BorderLayout.SOUTH);

         label=new JLabel("East");
        panel.add(label,BorderLayout.EAST);

         label=new JLabel("West");
        panel.add(label,BorderLayout.WEST);

        // label=new JLabel("Center");
        // label.setHorizontalAlignment(SwingConstants.CENTER);
        // panel.add(label,BorderLayout.CENTER);
        cPanel=new JPanel(new GridLayout(3,3));


    
        for(int i=0;i<9;i++){
            String clabel=String.format("Button %d", i+1);
            JButton btn=new JButton(clabel);
            cPanel.add(btn);
        }
        panel.add(cPanel);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            FlowLayoutdif2 flow=new FlowLayoutdif2(400, 200);
        });
    }
}