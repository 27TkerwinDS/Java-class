import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator{
    int width=200;
    int height=300;
    JFrame frame;
    JPanel panel;
    JTextField text;
    JPanel cPanel;
    public Calculator(){
        frame=new JFrame();
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel(new BorderLayout());
        JLabel label;
        
        //initialise the text box
        text=new JTextField("0");
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setPreferredSize(new Dimension(200, 40));
        panel.add(text,BorderLayout.NORTH);

        //for later interfaces
        label=new JLabel("East");
        panel.add(label,BorderLayout.EAST);
        cPanel=new JPanel(new GridLayout(5,3));

        //for center numbers
        JButton btn;
        String clabel;
        for(int i=9;i>=0;i--){
            clabel=String.format("%d", i);
            btn=new JButton(clabel);
            btn.addActionListener(new ButtonListener());
            cPanel.add(btn);
        }

        //finishing central box with non numbers.
        clabel=String.format(".");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn);
        clabel=String.format("+/-");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn);
        clabel=String.format("C");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn);
        clabel=String.format("CE");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn);
        clabel=String.format("/");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn);
        //done!



        
        panel.add(cPanel,BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }




    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Calculator c=new Calculator();
        });
    }

    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int whichone;
            String whichOne;
            JButton b=(JButton)e.getSource();
            whichOne = b.getText();
            System.out.println(whichOne);
        }
        
    }
}