import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator{
    int width=250;
    int height=350;
    JFrame frame;
    JPanel panel;
    static JTextField text;
    JPanel cPanel;
    String clabel;
    JPanel ePanel;
    static ArrayList<Double> stack;
    static String jText="0";
    JButton btn;
    public Calculator(){
        stack=new ArrayList<>();
        frame=new JFrame();
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel(new BorderLayout());
        JLabel label;
        
        //initialise the text box
        text=new JTextField(jText);
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setPreferredSize(new Dimension(200, 40));
        panel.add(text,BorderLayout.NORTH);

        //for later interfaces
        //label=new JLabel("East");
        //panel.add(label,BorderLayout.EAST);
        ePanel=new JPanel(new GridLayout(4,1));
        clabel=String.format("*");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        ePanel.add(btn);
        clabel=String.format("+");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        ePanel.add(btn);
        clabel=String.format("-");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        ePanel.add(btn);
        clabel=String.format("Enter");
        btn=new JButton(clabel);
        btn.addActionListener(new ButtonListener());
        ePanel.add(btn);

        



        cPanel=new JPanel(new GridLayout(5,3));

        //for center numbers
        
        
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
        panel.add(ePanel, BorderLayout.EAST);
        frame.add(panel);
        frame.setVisible(true);
    }




    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Calculator c=new Calculator();
        });
    }
    static boolean wipe;
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String whichOne;
            
            JButton b=(JButton)e.getSource();
            whichOne = b.getText();
            System.out.println(whichOne);

            if (whichOne.equals("Enter")){
                stack.add(Double.parseDouble(jText));
                clearSc();

            }else if(whichOne.equals("+")){
                stack.add(Double.parseDouble(jText));
                double total=0;
                for (int i=0;i<stack.size();i++){
                    total=total+stack.get(i);
                }
                jText=String.valueOf(total);
                text.setText(jText);
                stack=new ArrayList<>();
                stack.add(total);
                wipe=true;


            }else if(whichOne.equals("-")){
                stack.add(Double.parseDouble(jText));
                double total=stack.get(0);
                for (int i=1;i<stack.size();i++){
                    total=total-stack.get(i);
                }
                jText=String.valueOf(total);
                text.setText(jText);
                stack=new ArrayList<>();
                stack.add(total);
                wipe=true;
            }else if(whichOne.equals("*")){
                stack.add(Double.parseDouble(jText));
                double total=stack.get(0);
                for (int i=1;i<stack.size();i++){
                    total=total*stack.get(i);
                }
                jText=String.valueOf(total);
                text.setText(jText);
                stack=new ArrayList<>();
                stack.add(total);
                wipe=true;
            }else if(whichOne.equals("/")){
                stack.add(Double.parseDouble(jText));
                double total=stack.get(0);
                if(jText.equals("0")){
                    jText="Error";
                    wipe=true;
                }else{
                    for (int i=1;i<stack.size();i++){
                        total=total/stack.get(i);
                        jText=String.valueOf(total);
                    }
                }
                
                text.setText(jText);
                stack=new ArrayList<>();
                stack.add(total);
                wipe=true;
            }else if(whichOne.equals("C")){
                clearSc();
                
            }else if(whichOne.equals("CE")){
                clearSc();
                stack=new ArrayList<>();
                
            }else if(whichOne.equals("+/-")){
                
            }else{
                addToScreen(whichOne);
                text.setText(jText);
            }
        }
        
    }
    public static void clearSc(){
        jText="0";
        text.setText(jText);
    }
    public static void addToScreen(String s){
        if (jText.equals("0")||jText.equals("0.0")||wipe){
            jText=s;
            wipe=false;
        }else{
            jText=jText+s;
        }
    }

}