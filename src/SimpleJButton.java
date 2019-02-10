import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class SimpleJButton {


    SimpleJButton() {


        JFrame f = new JFrame("Main Menu");
        JButton b = new JButton("Play", new ImageIcon("github_image.png"));
        JButton b2 = new JButton("Load", new ImageIcon());//
        b2.setBounds(50, 50, 140, 20);//
        b.setBounds(100, 100, 140, 40);//
        f.add(b2);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        Container contentPane = f.getContentPane();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setLayout(new FlowLayout());
        contentPane.add(b);//wasb2
        contentPane.add(b);//was b2


        final JButton button = new JButton("OK");
        button.setAction(new AbstractAction() {
            public void actionPerformed(ActionEvent ae) {
                synchronized (button) {
                    button.notify();
                }
            }
        });
        JFrame jf = new JFrame("Title Menu");
        jf.getContentPane().add(button, BorderLayout.CENTER);
        //JTextArea jTextArea = new JTextArea("LVL " + Stats.currentLvl);
        //jTextArea.setVisible(true);
        //jf.add(jTextArea);

        //jf.setDefaultCloseOperation();
        JTextField jTextField = new JTextField("LVL " + Stats.currentLvl);
        jTextField.setVisible(true);
        //jf.add(jTextField);

        jf.pack();//
        jf.setVisible(true);
        synchronized (button) {
            try {
                button.wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("starting game...");


    }

    public static class progress extends JFrame { //was extends JFrame

        // create a frame
        JFrame f;

        static JProgressBar b;

        public void mainBar() {

            // create a frame
            f = new JFrame("Progression 1");

            // create a panel
            JPanel p = new JPanel();

            // create a progressbar
            b = new JProgressBar();

            // set initial value
            b.setValue(0);

            b.setStringPainted(true);

            // add progressbar
            p.add(b);

            // add panel
            f.add(p);

            // set the size of the frame
            f.setSize(500, 500);
            f.setVisible(true);

            fill();
        }

        // function to increase progress
        public static void fill() {
            int i = 0;
            try {
                while (i <= 100) {
                    // fill the menu bar
                    b.setValue(i + InteractiveNov.currentLvl);//i + 10

                    // delay the thread
                    Thread.sleep(1000);
                    i += 20;
                }
            } catch (Exception e) {
            }
        }
    }
}









