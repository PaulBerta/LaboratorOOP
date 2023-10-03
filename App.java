import Lab5.Grade;

import java.awt.*;

import javax.swing.*;

public class App extends JFrame{
    public void initialize(){
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,5,2));
        
        JLabel label = new JLabel("Temperature: ");
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 20));
        
        JButton button = new JButton("Convert");
        button.addActionListener(e -> {
            double c = Double.parseDouble(textField.getText());
            double f = Grade.convertCtoF(c);
            JOptionPane.showMessageDialog(null, "Temperature in F: " + f);
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,3,5,2));
        
        JButton centerButton = new JButton("Center");
        centerButton.addActionListener(e -> {
            this.setLocationRelativeTo(null);
        });
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            this.dispose();
        });
        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e -> {
            this.getContentPane().setBackground(Color.RED);
        });
        bottomPanel.add(centerButton);
        bottomPanel.add(closeButton);
        bottomPanel.add(colorButton);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(bottomPanel);
        
        this.add(panel);
        this.setTitle("Convertor Grade");
        this.setSize(400, 400);
        this.setMinimumSize(new Dimension(300,300));
        this.setBackground(Color.BLUE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        App app = new App();
        app.initialize();
    }
}
