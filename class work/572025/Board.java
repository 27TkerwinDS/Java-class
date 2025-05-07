import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Board extends JPanel {
    private final int B_WIDTH = 450;
    private final int B_HEIGHT = 100;
    private JButton button;
    private JLabel label;
    private TextField t;
    JLabel labelInterest;
    int textWidth=10;
    double ballence=1000;
    double aprinit=5.0;
    JTextField textRate;
    int n=0;

    // constructor.
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        labelInterest=new JLabel("Interest rate%:");
        this.add(labelInterest);
        textRate = new JTextField(textWidth);

        this.add(textRate);

        String text=Double.toString(aprinit);
        textRate.setText(text);

        button=new JButton("Add");
        this.add(button);
        //add an event listener
        button.addActionListener(new ClickMeListener());
        text=String.format("%.2f",ballence);
        label = new JLabel(text);
        this.add(label);

    }
    class ClickMeListener implements ActionListener{





        public void actionPerformed(ActionEvent e) {
            System.out.println("clicked");
            double intest=Double.parseDouble(textRate.getText());
            intest=intest/100.0;
            ballence=ballence+ballence*intest;
            label.setText(String.format(" %.2f",ballence));
        }

    }
}