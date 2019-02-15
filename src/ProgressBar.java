import javax.swing.*;

public class ProgressBar {

    // create a frame
    static JFrame fprogress;

    static JProgressBar bprogress;

    public void mainBar() {

        // create a frame
        fprogress = new JFrame("Story Completion");

        // create a panel
        JPanel p = new JPanel();

        // create a progressbar
        bprogress = new JProgressBar();

        // set initial value
        bprogress.setValue(0);

        bprogress.setStringPainted(true);

        // add progressbar
        p.add(bprogress);

        // add panel
        fprogress.add(p);

        // set the size of the frame
        fprogress.setSize(200, 200);//was 500 500
        fprogress.setVisible(true);

        fill();
    }

    // function to increase progress
    public static void fill() {

        int i = 0;
        i = InteractiveNov.currentLvl;
        try {
            while (i <= 10) {//i <= 100
                // fill the menu bar
                bprogress.setValue(i + 10);//i + 10

                // delay the thread
                Thread.sleep(1000);
                i += 20;//was 20
            }
        } catch (Exception e) {
        }



    }
}

