import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int count = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel result = new JLabel("Current count is : " + count);
        result.setFont(new Font("cambria", Font.ITALIC, 22));

        JButton counter = new JButton("Count");
        counter.setPreferredSize(new Dimension(150, 30));
        counter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                result.setText("Current count is : " + count);
            }
        });

        JButton reset = new JButton("Reset");
        reset.setPreferredSize(new Dimension(150, 30));
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                result.setText("Current count is : " + count);
            }
        });

        JPanel resetPanel = new JPanel();
        resetPanel.setBorder(
                BorderFactory.createEmptyBorder(50, 0, 0, 0));
        resetPanel.add(reset);

        JPanel wrapper = new JPanel();
        wrapper.add(new JPanel().add(counter));
        wrapper.add(new JPanel().add(result));
        wrapper.add(resetPanel);
        wrapper.setBorder(
                BorderFactory.createEmptyBorder( 50, 50, 50, 50 ));

        frame.setLayout(new BorderLayout());
        frame.add(wrapper, BorderLayout.CENTER);
        frame.setTitle("Simple counter");
        frame.setSize(new Dimension(300, 300));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
