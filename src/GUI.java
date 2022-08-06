import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField heightInput;
    private JTextField weightInput;
    private JLabel bmi;
    private JLabel health;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,20,10));
        panel.setLayout(new GridLayout(6,2));


        JLabel heading = new JLabel("insert your measures");

        JLabel heightLabel = new JLabel("height: ");
        heightInput = new JTextField();
        JLabel weightLabel = new JLabel("weight: ");
        weightInput = new JTextField();

        button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bmi.setText("test");
                health.setText("test");
            }
        });

        JLabel bmiLabel = new JLabel("BMI: ");
        bmi = new JLabel("");
        JLabel healtLabel = new JLabel("health: ");
        health = new JLabel("");

        panel.add(heading);     panel.add(new Container());
        panel.add(heightLabel); panel.add(heightInput);
        panel.add(weightLabel); panel.add(weightInput);
        panel.add(button);      panel.add(new Container());
        panel.add(bmiLabel);    panel.add(bmi);
        panel.add(healtLabel);  panel.add(health);

        frame.setBounds(400, 300, 100, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BMI Calculator");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
