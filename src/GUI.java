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
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(5,2));

        JLabel heightLabel = new JLabel("height in cm: ");
        heightInput = new JTextField();
        JLabel weightLabel = new JLabel("weight in kg: ");
        weightInput = new JTextField();

        button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int  weight = Integer.parseInt(weightInput.getText());
                int height = Integer.parseInt(heightInput.getText());

                BMICalc calculator = new BMICalc(weight, height);
                int calculatedBMI = calculator.getBmi();
                bmi.setText(""+calculatedBMI);

                String healthstate;
                if (calculatedBMI<19) healthstate="underweight";
                else if (calculatedBMI<25) healthstate="normal weight";
                else if (calculatedBMI<30) healthstate="overweight";
                else if (calculatedBMI<40) healthstate="obesity";
                else healthstate="extreme obesity";
                health.setText(healthstate);
            }
        });

        JLabel bmiLabel = new JLabel("BMI: ");
        bmi = new JLabel("");
        JLabel healtLabel = new JLabel("health state: ");
        health = new JLabel("");

        panel.add(heightLabel); panel.add(heightInput);
        panel.add(weightLabel); panel.add(weightInput);
        panel.add(new Container()); panel.add(button);
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
