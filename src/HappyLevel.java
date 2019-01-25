import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.io.*;

public class HappyLevel {
    public int mood;
    public String comment;
    public int level;
    // public String[] dialogueOption = {"nice", "not cool"};

    public HappyLevel(int mood, int level) {
        this.mood = mood;
        this.level = level;



        // this.comment = comment;

    }

    public int getMood() {
        int mood = 0;
        int level = 0;
        while((level > 0) && (mood >= 0)){
            level = level + (mood/100);
            mood ++;
            System.out.println("mood is: " + this.mood);
            System.out.println("level is" + this.level);
        }

        return mood;
    }

    public String getComment() {
        String comment = "nicely done";
        mood +=1;
        level +=1;
        return comment;
    }
    public String getComment2(){
        String comment2 = "Bad choice, my friend";
        level +=1;
        System.out.println(this.level);

        return comment2;
    }


    public void go() {
        JTextArea question;
         JTextArea answer;
         JFrame frame;
         JButton nextButton;
         boolean isAnswer;


            frame = new JFrame("Game Menu");
            JPanel mainPanel = new JPanel();
            Font bifFont = new Font("sanserif", Font.ITALIC, 24);

            question = new JTextArea(10, 20);
            question.setFont(bifFont);

            question.setLineWrap(true);
            question.setEditable(false);

            JScrollPane qScroller = new JScrollPane(question);
            qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            nextButton = new JButton("Show Story");
            mainPanel.add(qScroller);
            mainPanel.add(nextButton);
            //nextButton.addActionListener(new NextCardListener());

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");



    }
}






