import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener{ // Gui class

        int count = 0;
        private JLabel label; // brings them to scope
        private JFrame frame; // private, they can only be accessed within the gui class, they're encapsulated
        private JPanel panel;
        private JButton button;
        private JButton resetButton;
        private JButton subtractButton;

    public GUI() { // Gui constructor. This is treated like a method


        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("Add");
        resetButton = new JButton("reset");
        subtractButton = new JButton("subtract");

        button.addActionListener(this); // method from the class tha its in, which is the GUI class
        resetButton.addActionListener(this);
        subtractButton.addActionListener(this);
    
        label = new JLabel("clicks: " + count);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100)); // border object
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(resetButton);
        panel.add(subtractButton);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER); // add panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens when you close the frame
        frame.setTitle("simple gui");
        frame.pack();
        frame.setVisible(true);
        

    }
    
    //main method
    public static void main(String[] args) throws Exception {
        new GUI(); // new isntance of gui class
    }

    @Override //action listeners
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {
            count++;
            label.setText("clicks: " + count);
        } else if (e.getSource() == resetButton) {
            count = 0;
            label.setText("clicks: " + count);
        } else if (e.getSource() == subtractButton){
            count--;
            label.setText("clicks: " + count);
        }

        
    }
}
