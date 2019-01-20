import java.io.Serializable;
import java.io.*;

public class HappyLevel {
    public int mood;
    public String comment;
    public int level;
    // public String[] dialogueOption = {"nice", "not cool"};

    public HappyLevel(int mood, int level) {
        mood = 0;
        level = 0;


        // this.comment = comment;

    }

    public int getMood() {
        int mood = 0;
        int level = 0;
        while((level >= 0) && (mood >= 0)){
            level = level + (mood/100);
            mood --;
        }

        return mood;
    }

    public String getComment() {
        return comment;
    }



    }


