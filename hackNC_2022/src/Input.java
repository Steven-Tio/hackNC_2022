import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Input {
    JFrame window;
    Container con;
    JPanel textPanel, inputPanel;
    JLabel textLabel;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton enterB;

    InputHandler iHandler = new InputHandler();
    int tracker =0;

    public int getTracker(){
        return tracker;
    }
    public void destroy(){
        window.setVisible(false);
        window.dispose();
    }

    public Input() {
        window = new JFrame();
        window.setSize(1920, 1080);
        window.getContentPane().setBackground(Color.blue);

        JLabel background = new JLabel(new ImageIcon("fishinggame_background.png"));

        window.setContentPane(background);
        window.setLayout(null);
        con = window.getContentPane();

        textPanel = new JPanel();
        textPanel.setBounds(150, 250, 500, 100);
        textPanel.setBackground(Color.black);
        textLabel = new JLabel("START FISHING:");
        textLabel.setForeground(Color.white);
        textLabel.setFont(normalFont);
        textPanel.add(textLabel);
        con.add(textPanel);

        inputPanel = new JPanel();
        inputPanel.setBounds(150,450,500,50);
        inputPanel.setBackground(Color.red);
        inputPanel.setLayout(new GridLayout(1,2));

        enterB = new JButton("FISH");
        enterB.setForeground(Color.red);
        enterB.setOpaque(false);
        enterB.addActionListener(iHandler);
        inputPanel.add(enterB);
        con.add(inputPanel);

        window.setVisible(true);
    }

    public class InputHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            tracker++;
            textLabel.setText("KEEP FISHING!!! -- "+tracker);
        }

    }
}

