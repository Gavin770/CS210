
/**
 * Body Mass Calculator - GUI only - no functionality
 * 
 * @author Wayne.Brown
 * 
 * @version 1.0 - Nov 7, 2011 at 3:36:29 PM
 */
import java.awt.*;
import javax.swing.*;

public class BMI_solution {

  public static void main(String[] args) {
// set up components
    JTextField heightField = new JTextField(5);
    JTextField weightField = new JTextField(5);
    JLabel bmiLabel = new JLabel("Type your height and weight");

    JButton computeButton = new JButton("Compute");
    JButton clearButton = new JButton("Clear");

    // layout
    JPanel north = new JPanel(new GridLayout(2, 2));
    north.add(new JLabel("Height: "));
    north.add(new JLabel("Weight: "));
    north.add(heightField);
    north.add(weightField);
    
    JPanel buttons = new JPanel(new GridLayout(1,2));
    buttons.add(computeButton);
    buttons.add(clearButton);

    // overall frame
    JFrame frame = new JFrame("BMI");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    frame.add(bmiLabel, BorderLayout.NORTH);
    frame.add(north, BorderLayout.CENTER);
    frame.add(buttons, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
}
