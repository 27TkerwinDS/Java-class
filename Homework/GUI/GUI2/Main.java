package GUI2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    static JFrame frame;
    static JPanel panel;
    static JTextArea textArea;
    private static final int FRAME_WIDTH=400;
    private static final int FRAME_HEIGHT=250;
    private static final int ARIA_ROWS=10;
    private static final int ARIA_COLUMS=30;
    static JScrollPane scrollPane;
    double ballence=1000;
    static JButton button;
    JTextField textRate;
    double aprinit=5;

    public Main() {
        frame =new JFrame("JTaxt Aria Demo");
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel=new JPanel();
        textArea = new JTextArea(ARIA_ROWS, ARIA_COLUMS);
        textArea.setEditable(false);

        // create a scroll pane and add text area to it.
        scrollPane = new JScrollPane(textArea);
        JLabel label=new JLabel();

        label=new JLabel("Interest rate%:");
        
        textRate = new JTextField(10);

        

        String text=Double.toString(aprinit);
        textRate.setText(text);

        
        button=new JButton("add interest");

        // create a panel and place the scroll pane on it.
        panel = new JPanel();
        button.addActionListener(new ButtonListener());
        panel.add(button);
        
        panel.add(label);
        panel.add(textRate);
        panel.add(scrollPane);
        


        


        frame.add(panel);
        frame.setVisible(true);
        textArea.append(String.format("Balence = %.2f%n",ballence));
        

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Main demo=new Main();
        });
    }
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double intest=Double.parseDouble(textRate.getText());
            intest=intest/100.0;
            ballence=ballence+ballence*intest;
            textArea.append(String.format("Balence = %.2f%n",ballence));
        }
        
    }
    
}
