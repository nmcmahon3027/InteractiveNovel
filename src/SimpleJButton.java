import javax.swing.*;

public class SimpleJButton {

        SimpleJButton() {
            JFrame f = new JFrame("Main Menu");
            JButton b = new JButton("Play", new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);
            //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    }

