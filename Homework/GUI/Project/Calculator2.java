import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator2{
    int width=250;
    int height=250;
    JFrame frame;
    JPanel panel;
    static JTextField text;
    JPanel cPanel;
    String clabel;
    JPanel ePanel;
    GridBagConstraints constraints;
    static ArrayList<Double> stack;
    static String jText="0";
    JButton btn;
    public Calculator2(){
        stack=new ArrayList<>();
        frame=new JFrame();
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel(new BorderLayout());
        
        //initialise the text box
        text=new JTextField(jText);
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setPreferredSize(new Dimension(200, 40));

        cPanel=new JPanel(new GridBagLayout());
        //create constraints object
        constraints=new GridBagConstraints();
        constraints.gridheight=1;
        constraints.gridwidth =1; 
        constraints.weightx=1.0;
        constraints.weighty=1.0;
        constraints.fill=GridBagConstraints.BOTH;
        int num=9;
        for(int i=0; i<3;i++){
            for(int o=0;o<3;o++){
                makeBtn(String.valueOf(num), o, i);
                num--;
            }
        }
        makeBtn("/", 3, 0);
        makeBtn("*", 3, 1);
        makeBtn("+", 3, 2);
        makeBtn("-", 3, 3);
        makeBtn("0", 0, 3);
        makeBtn(".", 1, 3);
        makeBtn("+/-", 2, 3);

        makeBtn("C", 0, 4);
        makeBtn("CE", 1, 4);
        constraints.gridwidth=2;
        makeBtn("Enter", 2, 4);






        panel.add(text,BorderLayout.NORTH);
        panel.add(cPanel,BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void makeBtn(String name, int x, int y){
        btn=new JButton(name);
        constraints.gridx=x;
        constraints.gridy=y;
        btn.addActionListener(new ButtonListener());
        cPanel.add(btn, constraints);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Calculator2 c=new Calculator2();
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
                try{
                    int temp=-1*Integer.parseInt(jText);
                    jText=String.valueOf(temp);
                }catch (Exception q){
                    double temp1=-1*Double.parseDouble(jText);
                    jText=String.valueOf(temp1);
                }
                


                text.setText(jText);
                
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