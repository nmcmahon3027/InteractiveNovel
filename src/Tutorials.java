import javax.swing.*;
import java.awt.*;



public class Tutorials {
    private String tutor = "Choices that are smart & safe award 1pt;Choices that are controversial award 2 but run the risk of story fallout";
    JOptionPane tutorPane = new JOptionPane(tutor);


    public JOptionPane getTutorPane() {
        return tutorPane;
    }

    public void setTutorPane(JOptionPane tutorPane) {
        this.tutorPane = tutorPane;
    }

    public String getTutor(){
        return tutor;

    }
    public void setTutor(String tutor){
        this.tutor = tutor;

    }

}
