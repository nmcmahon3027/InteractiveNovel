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
            synchronized(button) {
                try {
                    button.wait();
                } catch (InterruptedException ex) {
                    System.out.println("Interrupted");
                }
            }
            System.out.println("starting game...");




        }



}



