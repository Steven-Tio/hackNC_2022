import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Input2 {
    JFrame window;
    Container con;
    JPanel textPanel, inputPanel;
    JTextArea textArea;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    JButton enterB;
    JButton enterA;
    InputHandler iHandler = new InputHandler();
    InputHandler2 iHandler2 = new InputHandler2();
    int tracker =0;
    String flavorText;

    public int getTracker(){
        return tracker;
    }
    public void setText(String descrip) {
        flavorText = descrip;
    }
    public void destroy(){
        window.setVisible(false);
        window.dispose();
    }


    public Input2(int fishType) {
        window = new JFrame();
        window.setSize(1920, 1080);

        JLabel background = new JLabel(new ImageIcon("fishinggame_background1.png"));

        window.setContentPane(background);
        window.setLayout(null);
        con = window.getContentPane();

        textPanel = new JPanel();
        textPanel.setBounds(150, 250, 1500, 100);
        textPanel.setBackground(Color.black);
        textPanel.setOpaque(false);

        if(fishType==1){
            ImageIcon img = new ImageIcon("Pupfish_Splash.png");
            JLabel label = new JLabel(img, JLabel.CENTER);
            label.setBounds(850, 450, 400, 400);
            con.add(label);
        }
        else if(fishType==2){
            ImageIcon img = new ImageIcon("Woundfin_Splash.png");
            JLabel label = new JLabel(img, JLabel.CENTER);
            label.setBounds(850, 450, 400, 400);
            con.add(label);
        }
        else if(fishType==3){
            ImageIcon img = new ImageIcon("Cavefish_Splash.png");
            JLabel label = new JLabel(img, JLabel.CENTER);
            label.setBounds(850, 450, 400, 400);
            con.add(label);
        }
        else if(fishType==4){
            ImageIcon img = new ImageIcon("Bull Trout_Splash.png");
            JLabel label = new JLabel(img, JLabel.CENTER);
            label.setBounds(850, 450, 400, 400);
            con.add(label);
        }
        else if(fishType==5){
            ImageIcon img = new ImageIcon("Sturgeon_Splash.png");
            JLabel label = new JLabel(img, JLabel.CENTER);
            label.setBounds(850, 450, 400, 400);
            con.add(label);
        }

        textArea = new JTextArea("???");
        
        textArea.setBounds(0, 0, 400, 400);

        textArea.setForeground(Color.black);
        textArea.setFont(normalFont);
        textArea.setPreferredSize(new Dimension(800, 800));
        textArea.setMinimumSize(new Dimension(800, 800));
        textArea.setBounds(0, 0, 800, 800);

        textPanel.add(textArea);
        con.add(textPanel);

        inputPanel = new JPanel();
        inputPanel.setBounds(150,150,500,50);
        inputPanel.setBackground(Color.red);
        inputPanel.setLayout(new GridLayout(1,2));

        enterB = new JButton("You caught a...");
        enterB.setForeground(Color.red);
        enterB.addActionListener(iHandler);
        inputPanel.add(enterB);
        con.add(inputPanel);

        enterA = new JButton("QUIT");
        enterA.setForeground(Color.red);
        enterA.addActionListener(iHandler2);
        inputPanel.add(enterA);
        con.add(inputPanel);

        window.setVisible(true);
    }

    public class InputHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            tracker++;
            textArea.setText(flavorText);
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);
            enterB.setText("Play Again?");
        }

    }
    public class InputHandler2 implements ActionListener {
        public void actionPerformed(ActionEvent event){
            tracker=101;

        }

    }


}

