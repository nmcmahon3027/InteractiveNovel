import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.*;

import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;



class InteractiveNov extends Stats implements CharacterInfo { //WAS public


    public void paintMenu(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(20, 50, 100, 100);

        System.out.println(g);
    }
    public void paintComponent(Graphics g){
        JButton startNewGame = new JButton("Start Game");
        JButton load = new JButton("Load");
        startNewGame.add(startNewGame);
        load.add(load);


    }












    JFrame window;
    static Container con;
    static JPanel titleNamePanel;
    static JLabel titleNameLabel;
    static Font titleFont = new Font("Times New Roman", Font.PLAIN, 12);






    public static void main(String[] args) {
       HappyLevel charMood = new HappyLevel(0, 0);
       charMood.getMood();
        System.out.println("CURRENT MOOD LEVEL: "+ charMood.mood);
        new SimpleJButton();
        new ProgressBar();












        /*This program will give the player/user situations in the story
         * The user should prepare to make choices all the way through the game
         * The Interactive Novel will ask for a name from the user
         * The user must type in their preferred name
         * The author of this program has beginner experience; this is the authors first large program
         * The program keeps track of all the decisions that the user has made
         * These decisions will branch off, and then branch off again, many times
         * It will scan for strings from the user as well as multiple choices
         * The user must type in the correct spelling of the words shown on screen
         * The user must also type in the correct number (i.e. 1 or 2 for [1] [2] respectively)
         * The program will print out the game/story results after completing certain story-lines
         * Some may offer a checkpoint to go back to
         * Exiting out of the pop up window will end the program
         * If reloading a checkpoint, just minimize the menu
         * Have fun!
         */



        Scanner numberReader = new Scanner(System.in); //number reader is here for future purpose




        Scanner s = new Scanner(System.in);
        int stressCount = 0;
        String name;
        int input = 0;
        int memoryCountMan = 0;

        System.out.println("Enter your name");


        name = s.nextLine();


        System.out.println("Welcome to Your Story, " + name + "!");
        System.out.println("This is a story about choice. You will decide the path "
                + "in which the story unfolds.\n"
                + "Every choice has a consequence.\n"
                + "Pick carefully!");
        System.out.println("   ");
        System.out.println("The story begins.....");
        System.out.println("    ");
        System.out.println("...You hear your alarm going off as you rubb your\n"
                + "eyes. You get dressed and head out your city penthouse.");

        System.out.println("You realize that there are "
                + "more people than expected on the train platform.\n"
                + "You have a big meeting in 15 minutes.");
        System.out.println("*TUTORIAL*");
        System.out.println("Below is your first choice. \n"
                + "For the sake of learning the games \n"
                + "systems, let's give you an easy one! \n"
                + "Type '[1]' to proceed.");




        do {
            System.out.println("[0] Quit.");
            System.out.println("[1] Continue to wait ");
            //System.out.println("[2] Go to the next stop 2 blocks away.");

        }while(input != 0);

        input = s.nextInt();
        // To get next input

        if (input == 0) {
            System.out.println("You quit the game");


        }
        if (input == 1) {
            System.out.println("Nicely done, " + name + "!");
            System.out.println("You look at your watch");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");//was HH:mm:ss
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.out.println("Default Level:" + DEFAULT_LEVEL);


            System.out.println("You continued to wait and finally got on the train.");
            System.out.println("As you got into the train, you bumped into \n "
                    + "a man. The man gave you an ugly glance and returned \n "
                    + "to watching his phone");

            System.out.println("*TUTORIAL* The game will also ask \n"
                    + "you to type in the word. This is designed \n"
                    + "for player immersion. Typing the actual words \n"
                    + "puts you in the shoes of the story's writer, so to speak. \n"
                    + "The game will prompt you with one of two words usually. \n"
                    + "Type which word you would like your character to say \n"
                    + "or action to do."
                    + "*IMPORTANT: Please be sure to correctly spell the word.");
            System.out.println("Will you say sorry? 'yes' or 'no?' "); //YES->forgiving, yells name


            Scanner scan = new Scanner(System.in);
            Object response = scan.nextLine();

            if(response.equals("yes") || response.equals("Yes")){
                //stressCount -= 1;

                System.out.println("The man seems forgiving and sits beside you."
                        + "You notice he is wearing a red pin on "
                        + "his suit...you wonder what it is \n"
                        + "Please press ENTER to continue");

                System.out.println();

                memoryCountMan += 1; //remembers man
                System.out.println("Memory Point:" + memoryCountMan);
                currentLvl += LEVEL_UP;
                System.out.println("+" + LEVEL_UP + pts);
                System.out.println(levelp + currentLvl);

                JFrame window = new JFrame();
                window.setSize(1000, 1000);
                window.setTitle("Tutorial: Player Level");
                //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
                Rectangle rect = new Rectangle(200, 200, 300, 200);
                window.getContentPane().setBackground(Color.black);
                window.setLayout(null);
                con = window.getContentPane();

                titleNamePanel = new JPanel();
                titleNamePanel.setBounds(200,  200,  600, 200);//200 200
                titleNamePanel.setBackground(Color.blue);


                titleNameLabel = new JLabel("Choices that are smart & safe award 1pt;Choices that are controversial award 2 but run the risk of story fallout");

                /*window.getContentPane().add(new JPanel());
                titleNamePanel = new JPanel();
                titleNamePanel.setBounds(200,  200,  600, 200);
                titleNamePanel.setBackground(Color.blue);
                titleNameLabel = new JLabel("Choices that are smart & safe award 1pt Choices that are controversial award 2 and run the risk of story fallout");
*/





                titleNameLabel.setForeground(Color.white);

                titleNameLabel.setFont(titleFont);
                titleNamePanel.add(titleNameLabel);
                con.add(titleNamePanel);


                JFrame f = new JFrame("You leveled Up!");
                JButton b = new JButton("LVL 2", new ImageIcon("github_image.png"));
                b.setBounds(100, 100, 140, 40);
                f.add(b);
                f.setSize(300, 400);
                f.setLayout(null);
                f.setVisible(true);

                JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
                b2.setBounds(50, 50, 100, 20);
                f.add(b2);
               // b2.setText("<html><body>Line 1 <br/>Line 2</body></html>");
                //above adds a 2nd line in the 2nd button, b2






            }
            if(response.equals("no")){ //Say Sorry?
                Tutorials tutorials = new Tutorials();
                tutorials.getTutor();
                System.out.println(tutorials.getTutor());
                Tutorials tutorials1 = new Tutorials();
                //tutorials1.setTutor("Choices that are smart & safe award 1pt;Choices that are controversial award 2 but run the risk of story fallout");
                Tutorials tutPane = new Tutorials();
                tutPane.getTutorPane();
                //System.out.println(tutPane.getTutorPane());






                currentLvl += LEVEL_DOWN;
                System.out.println("+ " + LEVEL_DOWN + "pt");
                System.out.println("LVL " + currentLvl);
                System.out.println("The man mumbles something with \n "
                        + "an evil look in his eye. He goes accross \n "
                        + "the train car to the other side \n "
                        + "Press ENTER to continue");

                JFrame f = new JFrame("You leveled Up!");
                JButton b = new JButton("LVL 1", new ImageIcon("github_image.png"));
                b.setBounds(100, 100, 140, 40);
                f.add(b);
                f.setSize(300, 400);
                f.setLayout(null);
                f.setVisible(true);

                //TESTS
                System.out.println("@DEV TEST@");
                //System.out.println("Character Mood: " + charMood);
                System.out.println("Default Level: " + DEFAULT_LEVEL);
                System.out.println("Stress count: " + stressCount);



                JButton b2 = new JButton("+ 1pts", new ImageIcon("Sample.png"));
                b2.setBounds(50, 50, 100, 20);
                f.add(b2);




            }
            if(input == 2){
                System.out.println("You walked to work avoiding rush hour. \n"
                        + "That was lucky. Your STRESS COUNT was reduced by 1!");
                stressCount -= 1;
                System.out.println("SC" + stressCount);
                System.out.println("More on Stress Counts later!");
                System.out.println("Press ENTER to continue");

            }




            Scanner scan1 = new Scanner(System.in);
            Object response21 = scan1.nextLine();

        }

        else{
            System.out.println("You notice someone giving you a nasty look. \n "
                    + "He looks away from you in an angry manner");
            stressCount += 2;
        }

        System.out.println("As you continue down the block hear someone yell \n"
                + "your name ");
        System.out.println("Hey " + name + "!");

        do {
            System.out.println("[0] Say hi back.");
            System.out.println("[1] Ignore, you have a meeting soon anyway ");



        }while(input != 0 && stressCount >= 1);

        input = s.nextInt();

        if (input == 0) {
            currentLvl = currentLvl + LEVEL_UP;
            System.out.println("+ " + LEVEL_UP + "pts");
            System.out.println("LVL " + currentLvl);







            System.out.println("You look up and see Maggie. \n "
                    + "Maggie is an old friend who also lives in the city. \n "
                    + "She was romantically involved with your best \n "
                    + "friend and business partner, John. To be honest, \n "
                    + "they still are seeing each other, John just doesnt like \n "
                    + "to publicly announce his relationships.");
            stressCount +=2;
            System.out.println("SC" + stressCount);
            System.out.println("GAME TIP: The number above is your \n "
                    + "Stress Count \n "
                    + "As you progress through the story and make decisions, \n "
                    + "you may get stressed from the situation. \n "
                    + "Make sure to consider this and don't let it get too high!");
            System.out.println("Maggie tells you that John is acting strange. They've had \n "
                    + "an on again off again relationship. John told her that he's in trouble \n "
                    + "and he's been having shady phone conversations late at night. \n "
                    + "Maggie always has the good gossip on John. He's usually a secretive guy. \n "
                    + "You feel like Maggie's afraid of something. She begins to look around as if \n "
                    + "she expects to see someone. She suddenly says she has to go. Her route to work \n "
                    + "is usually on the other side of the city. She wanted to find me. ");

        }else{
            System.out.println("It's Maggie. You see her from time to time on your commute. \n "
                    + "You dont want to deal with Maggie right now \n "
                    + "so you ignore her words");
            currentLvl = currentLvl + LEVEL_DOWN;
            System.out.println("+ " + LEVEL_DOWN + "pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ " + LEVEL_DOWN , new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);
            f.getRootPane().setDefaultButton(b2);//NEW






        }
        System.out.println(" ");
        System.out.println("Chapter 2: The Overseas Overseer");
        System.out.println("");
        System.out.println("You finally arrive into the office. John, \n "
                + "your business partner and best friend, comes rushing up to you. \n"
                + "He seems anxious and has sweat on his brow. He asks you if I've made up my mind \n "
                + "about the big company merger. If we sign with the Chinese \n "
                + "we will earn more revenue, but in turn lose 40% of our company \n "
                + "control and influence. If we merge with the Japanese, we get much less \n "
                + "yearly income, but will maintain 100% company control");
        System.out.println("How will you answer John?");

        do {
            System.out.println("[0] You are a money making machine! The more money \n"
                    + "the better! You would like to buy another lake house and a boat. \n"
                    + "So, let's go with the Chinese deal!");
            System.out.println("[1] We can't lose what we started just because \n "
                    + "of money, our business is too important. The Japanese deal.");


        }while(input != 0 && stressCount >= 1);

        input = s.nextInt();
        if(input == 0){
            System.out.println("John totally agrees");
            System.out.println("SC: " + stressCount);
            chineseStory(name);
        }

        if(input == 1){



            System.out.println("John thinks its a bad choice");
            System.out.println("You were dreading this decision all week, and \n "
                    + "you knew John would be angry over this choice.");
            System.out.println("Since you and John disagree, the committee has to take \n "
                    + "a hard vote. This may get messy. Not to mention on a personal level.");
            System.out.println("SC was " + stressCount);

            stressCount +=5;
            System.out.println("SC:" + stressCount);
            System.out.println("Input:" + input);
            japanStory();
        }

    }

    {		int stressCount = 0;
        int input = 0;
        while(input != 0 && stressCount >= 1);
    }
    {	}

    public static void japanStory(){ //new method
        JFrame f = new JFrame("Choice");
        JButton b = new JButton("rethink", new ImageIcon("github_image.png"));
        b.setBounds(100, 100, 140, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);

        JButton b2 = new JButton("sure", new ImageIcon("Sample.png"));
        b2.setBounds(50, 50, 100, 20);
        f.add(b2);






        System.out.println("John asks you to reconsider. He doesnt want any of this to \n "
                + "have to go through the committee. He asks you to at least sleep on it \n "
                + "Will you: 'rethink' or 'sure': ");




        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("rethink")){

            Hedger hedgerLabel = new Hedger();
            hedgerLabel.getAllCharacterInfo();

            InteractiveNov myNov = new InteractiveNov();
            System.out.println(myNov.printLevelPlus() + LEVEL_DOWN + pt);
            System.out.println(levelp + currentLvl);



            System.out.println("John says good thinking and walks away");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("You made John happy");
            //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.red);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.red);
            titleNameLabel = new JLabel("John's happiness went up");


            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);




        }
        if(input.equals("sure")){

            ConfidentLabel confidentLabel = new ConfidentLabel();
            confidentLabel.getAllCharacterInfo();

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);
            ProgressBar.fill();






            System.out.println("John says that I am making the \n"
                    + "biggest mistake of my life, he almost looks shook. \n"
                    + " He is furious and storms off");
        }
        System.out.println("Later that night... \n"
                + "As you pull out your key to open your front door, you see that \n"
                + "it is already open. You were in a hurry this morning...but you \n "
                + "are usually careful about locking up...");
        System.out.println("You slowly open the door and immediately see signs \n "
                + "of struggle. The heavy high-rise breeze hitting the curtains \n "
                + "because someone left the balcony door open. You tread carefully \n "
                + "into the entry and living room");
        System.out.println("You take a deep breath and gather yourself. \n "
                + "You study your belongings spread out everywhere. \n "
                + "This wasn't a struggle. Someone was here looking for something. \n "
                + "You look through your office desk. The hidden safe wasn't opened.They \n "
                + "didn't want money. You think long and hard about what your \n "
                + "next move should be. You suddenly think back to this morning. \n"
                + "Maggie was trying to tell you something. She knows something. \n"
                + "You rush out of the building and grab a taxi across town \n"
                + "to Maggie's. You arrive outside her place. She is on the third \n"
                + "floor. You see what appears to be the shadows of four men quickly \n"
                + "rummaging around.");
        System.out.println("You call Maggie. No answer. You see her about to \n"
                + "walk into the side entrance. You run up and grab her arm. \n"
                + "She jumps in fear. You shush her and take her to the ally. \n "
                + "She interups me and softly whispers we can't talk here.");
        playSafe();


    }




    public static void chineseStory(String name){
        System.out.println("You've never seen John happier than he is now. \n "
                + "He appears very very relieved, so much so it bothers you. \n "
                + "John loves money, there's no doubt, but you feel like there is \n "
                + "something bigger at play here. John says thank you " + name +".");

        System.out.println("John tells you to come over for a celebration \n "
                + "tonight at his place. You'll endulge him, even though \n "
                + "you would prefer not to.");
        System.out.println("                     ");
        System.out.println("Later that night, you arrive at John's luxury downtown\n"
                + " condo on the 49th floor you walk into quite the surprise.\n "
                + " Maggie is there, and she runs up to you dragging you to \n "
                + " the back hallway of the large condo. \n "
                + "She tells you that John was always planning on taking the Chinese deal. \n"
                + "She looked at his phone when he was asleep the other night. \n "
                + "Why would John do that? you think. Maggie says this is dangerous and \n "
                + "I have to go along with everything or else I'm in danger.");
        System.out.println("What will you do?");
        System.out.println(" 'confront John' or 'go along'");
        System.out.println("ENTER 'confront' or 'go along'");

        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("confront")){
            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov3 = new InteractiveNov();
            System.out.println(myNov3.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);
            System.out.println("Maggie begs you not to but all you see is red.");

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ " + LEVEL_UP , new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            if( input.equals("confront") && currentLvl >= 9){

                currentLvl = currentLvl + bonusNum;
                InteractiveNov myNov4 = new InteractiveNov();
                System.out.println(myNov4.printLevelPlus() + bonusNum + " pts");
                System.out.println("LVL " + currentLvl);
                System.out.println("Maggie begs you not to but all you see is red.");

                JFrame fBonus = new JFrame("You leveled Up!");
                JButton bBonus = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
                bBonus.setBounds(100, 100, 140, 40);
                fBonus.add(b);
                fBonus.setSize(300, 400);
                fBonus.setLayout(null);
                fBonus.setVisible(true);

                JButton b3 = new JButton("+ " + bonusNum , new ImageIcon("Sample.png"));
                b3.setBounds(50, 50, 100, 20);
                f.add(b3);

            }



            confrontJohn();
        }
        if(input.equals("go along")){
            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov4 = new InteractiveNov();
            System.out.println(myNov4.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);




            System.out.println("You calmly bury your anger and stick with Maggie");
            playSafe();
        }
    }
    public static void confrontJohn(){
        System.out.println("You dismiss Maggie's presence entirely, and \n "
                + "rush to find the conniving bastard.");
        System.out.println("A man in a slick, slim-fit black suit attached with a flashy red pin \n "
                + "suddenly reads your aggressive movement and stands before you \n "
                + "blocking your path to John.");
        System.out.println("Out of nowhere Maggie comes in and spills her \n"
                + "cocktail all over the man as the glass shatters on the floor. \n "
                + "The man, obviously trying not to draw attention stops along \n "
                + "with everyone else in the party. The man loses sight of you \n "
                + "but another man of Chinese descent grabs your arm");
        System.out.println("The man says, that they know what I'm trying to do \n "
                + "and there's no point. Who are they? You think");
        System.out.println("What will you do?");
        System.out.println("'twist his arm and escape' or 'listen to him' ");
        System.out.println(" escape or listen?");

        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("escape")){
            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov = new InteractiveNov();
            System.out.println(myNov.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            System.out.println("You turn the tide with one relentless grab to \n"
                    + "the man's wrist. You rip his grasp of you and throw him \n"
                    + "to the ground");
            escapedGrasp();
        }
        if(input.equals("listen")){
            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);


            JFrame f = new JFrame("You leveled up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts ", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);




            System.out.println("You have a small window of opportunity, but \n"
                    + "you may make things worse if I get violent or make a scene.");
            threatGrasp();
        }


    }
    public static void playSafe(){
        System.out.println("Play it Safe, you think");
        System.out.println("You calm yourself. You trust in Maggie. She's a \n"
                + "good friend. Maggie tells you that we both have to leave. \n"
                + "she says if she didnt show her face they would be on to her.\n "
                + "Who are they? you ask. She nods, indicating we should talk \n"
                + "somewhere else. You and Maggie arrive at a nearby dive that \n"
                + "her friend owns. She slowly catches her breath as she knows \n"
                + "what she's about to say is crazy. John's been in deep trouble \n"
                + "with the Chinese mob. He got into some trouble on his business \n"
                + "trips to China. Apparently, John is being forced to sell the \n"
                + "majority of the company to this Chinese group. They're a company \n"
                + "that is affiliated with really dangerous people. Maggie says, \n"
                + "that these people know that she has been seeing John. She believes \n"
                + "they've been following her. They're probably following me too, she says. \n"
                + " She thinks shes something that \n"
                + "these people can take or hurt to get to John. There are still \n"
                + "things that she cant put together. She's just been piecing \n"
                + "everything together. This is crazy!");
        System.out.println("It seems Maggie knew about some of this weeks ago. You \n"
                + "can either let it go or get upset.");
        System.out.println("'let go' or 'scorn' ");

        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("let go")){
            System.out.println("She's under a lot of stress and let it go. \n"
                    + "You wonder what we should do now. Maggie says that they \n"
                    + "have to find hard evidence and present it to the cops. \n"
                    + "What if they own the cops? you ask. We have to find a way to stop \n"
                    + "this.");

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            maggieStory();

        }
        if(input.equals("scorn")){
            System.out.println("Your head is spinning, you're furious, confused, and \n"
                    + "worst of all worried. You yell at Maggie, telling her she \n"
                    + "should have come to me earlier when she knew about this!");

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            maggieLeaves();

        }



    }
    public static void escapedGrasp(){
         JTextArea usergui;
         JFrame userframe;
         JLabel uselabel;

         usergui = new JTextArea(30, 50);
         userframe = new JFrame("Password: 12345 ");

         uselabel = new JLabel("Here is the label");
         uselabel.setVisible(true);
         uselabel.setText("HERE is the 2nd label");
         userframe.setVisible(true);
         usergui.setVisible(true);
         Font bigFont = new Font("sanserif", Font.BOLD, 24);
         usergui.setFont(bigFont);

        System.out.println("You rush over to John who is at the bar. \n "
                + "He sees that there is fiery in your eyes. You grab \n "
                + "him by his $2,000 shirt and force him into the hallway \n "
                + "and toss him into the room. John asks why I'm so damn upset. \n "
                + "You tell him he knows why.");
        System.out.println("John begins to look ghost white as you confront him. \n "
                + "He tells you that he had no choice. He says that he was in debt \n "
                + "and got mixed up with the Chinese mob. He had to sell stock shares \n "
                + "to pay his debt, but it wasn't enough. This business that you \n "
                + "and him built, the one that you started in college is gone. \n "
                + "You cant believe it. Its almost too crazy to actually believe, but \n"
                + "you know John. It sickens you to your core, but he's always \n "
                + "been like this: messy and naive.");
        System.out.println("You remind John that nothing has been signed yet. \n "
                + "You place your hand on his shoulder to comfort and tell him \n "
                + "we can still fix this. He shakes his head frivolously. \n "
                + "He begins to say something, studders and then grabs his \n "
                + "stomach. John falls to the floor gasping and foaming at the \n "
                + "mouth. You desperatly try to snap him out of it, but he isnt \n "
                + "responding. After a minute....John lies there motionless. \n "
                + "He's dead.");
        System.out.println("You stand there in shock. Before you even know what to \n "
                + "do, a man and a women stroll into the room looking for privacy. \n "
                + "The women looks down and sees John on the floor. She screams. \n "
                + "Next thing you know the ambulence is zipping his body into \n "
                + "a body bag and the police have you in custody.");
        theSetUp();

    }


    public static void threatGrasp(){//2/9
        System.out.println("The Chinese man pulls you outside. He pulls out \n "
                + "his phone and says a few words in Chinese then hangs up. \n"
                + "Less than 30 seconds later two more large-set men walk \n "
                + "out from the exit and into the ally");
        System.out.println("It suddenly all clicks. What has John gotten \n "
                + "himself into you wonder.");
        System.out.println("These men are obviously not messing around. \n"
                + "You see one large Chinese man walking in through the exit door \n"
                + "into the ally. The ally leads into a dead end around the corner, \n"
                + "so there appears to be zero hope of anyone seeing you or stopping \n"
                + "them. You get the feeling that even if someone did see this, \n"
                + "that person wouldn't be able to do anything to these guys. \n"
                + "The large man has the appearance of being the one in charge. \n"
                + "The man nods at his men, as if to say your work here is done. \n"
                + "Then quickly spits out a word in Chinese. Apparently it means \n"
                + "tie him up. Another man grabs a thick rope from the trunk of \n"
                + "their car which is blocking the entrance to the ally. \n "
                + "The henchman ties your hands behind your back.");
        System.out.println("The leader introduces himself as Chen Fai. \n"
                + "The name obviously means nothing to you, but you get the \n"
                + "impression he's a pretty influental man back in China. \n"
                + "Chen says that John has been cheating them. He's had very \n"
                + "large debt for years. Chen says that John made a deal with their \n"
                + "group about a year ago. A deal that John didnt follow through on. \n"
                + "John owes these men and unable to repay his debt. This company \n"
                + "that you and John bulit is literally worth millions. How could \n"
                + "he run out of money?");
        System.out.println("Chen tells you that our company is now his. It's just a matter \n"
                + "of finalizing a few things. They need my signature to hand over the \n"
                + "company! Thats why John was so nervous. That's why he wanted me to \n"
                + "choose the Chinese deal so bad.");
        System.out.println("Chen gives you an ultimatum: Give them your shares, \n"
                + "sign over your CEO rights, and no blood will be spilled. \n"
                + "			or \n"
                + "Things will get out of hand and someone will pay");
        System.out.println("'sign' or 'stall' ");


        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("sign")){
            System.out.println("You realize that there is nothing that you can do.");

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pt ", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            System.out.println("PRESS: 'options' for character progression");
            Scanner showCompletion = new Scanner(System.in);
            Object inputShowCompletion = scan.nextLine();
            if(inputShowCompletion.equals("options")){
                ProgressBar signProgressBar = new ProgressBar();//2/10
                signProgressBar.mainBar();


            }else if(!(inputShowCompletion.equals("options"))){
                signNow();
            }

            signNow();



            //signNow was here
        }
        if(input.equals("stall")){
            System.out.println("You can't sign it over! This company is your life!");

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL " + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar stallProgBar = new ProgressBar();//2/10
            stallProgBar.mainBar();



            stallSign();
        }
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //            LocalDateTime now = LocalDateTime.now();

    }


    public static void theSetUp(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        System.out.println("It is now " + dtf.format(now) + " You are in an interrogation \n "
                + "room at the downtown precinct. You have been in the cold \n"
                + "room for over 2 hours without a word from a detective. \n"
                + "You look into the one-way-mirror to glimpse at your current \n"
                + "physical state. You look terrible; tired, sweaty, and shook."
                + "Suddenly you hear the door open. The sound breaks your \n"
                + "study in the mirror. A strict looking man with a folder \n"
                + "under his arm and a certain aim in his eye comes marching in. \n"
                + "He introduces himself as detective Willows.");
        System.out.println("Willows asks if I've spoken to anyone.\n"
                + "You say nothing. He then tells me to start from the beginning.");
        System.out.println("What will you say?");
        System.out.println("'I want a lawyer' or 'You got the wrong guy' ");
        System.out.println("Enter: 'lawyer' or 'innocent' ");

        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("lawyer")){
            System.out.println("You respond quickly with the typical dialogue. \n"
                    + "You tell Willows you want a lawyer.");

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar lawyerProgBar = new ProgressBar();//2/10
            lawyerProgBar.mainBar();


            wantLawyer();


        }
        if(input.equals("innocent")){
            System.out.println("Although it may be stupid, you suddenly say \n"
                    + "that they have the wrong guy. Willows grins and shakes his \n"
                    + "head. He thinks he has something on you. He says that they \n"
                    + "found the vile in my coat pocket. What vile!? you say back. \n"
                    + "Willows says the one that killed John. John was poisoned. \n"
                    + "You suddenly get a neauseous. Willows examines your response. \n"
                    + "You suddenly think back to the party. When you ran to grab John \n"
                    + "a man stopped you. He grabbed your arm. He must have put the \n"
                    + "vile in your pocket with out you knowing. This was the plan all \n"
                    + "along. If we didnt sign over the company, they were going to \n"
                    + "kill John. Who knows they may even want Maggie and yourself dead \n"
                    + "as well. These people do not mess around."
                    + "You begin to openly tell the detective about the strange \n"
                    + "activities that John has been up to. You know that only \n"
                    + "Maggie can back up what you are saying. She knows John \n"
                    + "best afterall. You tell Willows about Maggie, he seems surprised \n"
                    + "that she knows so much. He is very interested though. Willows \n"
                    + "reaches for his pen out of his jacket to take notes. \n"
                    + "As he does, a pen, car keys, and a red pin dropps from his \n"
                    + "pocket. He is so focused on trying to take notes that he \n"
                    + " didnt seem to notice the random objects \n "
                    + "that fell from his inside pocket.");

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pt", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar innocentProgBar = new ProgressBar();//2/10
            innocentProgBar.mainBar();


            talkOrStop();






        }

    }

    public static void maggieStory(){
        System.out.println("Maggie catches her bearings. She thinks we should \n"
                + "leave town");
        System.out.println("ENTER 'leave' or 'fight'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("leave")){

            RedeemerLabel redeemerLabel = new RedeemerLabel();
            redeemerLabel.getAllCharacterInfo();

            System.out.println("You and Maggie leave town");
            System.out.println("*GAME RESULTS: John: Alive, Maggie: Alive, Company:Unknown");
            System.out.println("You chose to run! Next time try to stand up for yourself!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.red);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.red);
            titleNameLabel = new JLabel("You decide to run. Stand up for yourself next time!");

            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);
            InteractiveNov myint1 = new InteractiveNov();
            myint1.isSavedCompany();

            System.out.println(bonus);

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("Story Branch ended");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("CompanySaved" + myint1, new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);


            ProgressBar here = new ProgressBar();//2/10 //YESSS!!!
            here.mainBar();








        }
        if(input.equals("fight")){
            System.out.println("You decide to see this through and fight!");

            FighterLabel fighterLabel = new FighterLabel();
            fighterLabel.getAllCharacterInfo();

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar fightProgBar = new ProgressBar();//2/10
            fightProgBar.mainBar();


            System.out.println("Story Branch Ended");
            System.out.println("Load most recent save (i.e. chapter)?");
            System.out.println("ENTER 'yes' or 'no' ");
            Scanner scanLoad = new Scanner(System.in);
            Object inputLoad = scan.nextLine();

            if(inputLoad.equals("yes")){
                maggieStory();
            }if(inputLoad.equals("no")){
                keepGoing();
            }



           // keepGoing();


        }


    }
    public static void signNow(){
        System.out.println("You know that these are dangerous people \n"
                + "so you say okay. The man snaps his fingers. The man sitting \n"
                + "behind the group reaches for a briefcase, and pulls out a \n"
                + "thick folder. You've signed big mergers and deals in the \n"
                + "past. That folder took weeks and maybe even months to finsh. \n"
                + "They obviously were anticipating this day. The man puts the paper \n"
                + "on the top of the car. The third man forces you over to the side \n"
                + "of the car. He sets the pen on top of the paper. You sign \n"
                + "the document. It seems that all your company ownership is now gone.");

        currentLvl = currentLvl + LEVEL_DOWN;
        InteractiveNov myNov2 = new InteractiveNov();
        System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
        System.out.println("LVL " + currentLvl);

        JFrame f = new JFrame("You leveled Up!");
        JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
        b.setBounds(100, 100, 140, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);

        JButton b2 = new JButton("+ 1pt", new ImageIcon("Sample.png"));
        b2.setBounds(50, 50, 100, 20);
        f.add(b2);

        johnAlive();//End of this story line

        ProgressBar johnAliveProgBar = new ProgressBar();//2/10
        johnAliveProgBar.mainBar();




    }
    public static void stallSign(){
        System.out.println("NO, you yell! The man gives you a hard hit to the \n"
                + "mouth, then a knee to the stomach. You've never felt so much pain \n"
                + "in your life");
        System.out.println("*Your STRESS is high!*");
        System.out.println("They hand you the pen and tell you to sign now.");
        System.out.println("'Take pen' or 'take a beating' ");
        System.out.println("ENTER 'pen' or 'beating'");
        System.out.println("ENTER 'pen' or beating ");//WAS 'yes' or 'no'
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("pen")){
            currentLvl = currentLvl + bonusNum;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + bonusNum + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("BONUS!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 3pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            takePen();




        }
        if(input.equals("beating")){
            FighterLabel beatLabel = new FighterLabel();
            beatLabel.getAllCharacterInfo();

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("Story branch ended");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pt", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            System.out.println("You are unconscious!");

            ProgressBar unconciouseProgBar = new ProgressBar();//2/10
            unconciouseProgBar.mainBar();


        }


    }
    public static void wantLawyer(){


        System.out.println("Detective Willows stares at you wil disdain.\n"
                + "He was hoping I would cooperite. I'm not going to make it \n"
                + "that easy on him!");
        System.out.println("Maggie works at a law firm downtown, she knows \n"
                + "some great lawyers. You try to call her, but no answer. \n"
                + "Great...now you have to wait for the detectives to appoint one \n"
                + "for you. That may take a while. Now all I have to do is wait. \n"
                + "You left Maggie a message and hopfully she will send someone \n"
                + "to help.... \n"
                + "...About an hour goes by and you hear commotion outside the door. \n"
                + "A man comes storming in yelling at the detectives. He says he represents \n"
                + "the law firm that Maggie works for. He introduces himself as \n"
                + "Mike Donnovan. He somehow was able to post bail. He went to a judge \n"
                + "and was able to get me out of here! Apperently they don't have enough \n"
                + "hard proof that I killed John. There are no finger prints in his place \n"
                + "and no other damning evidence other than the fact that I was standing \n"
                + "right next to John when he died. Willows is livid. He says that if I \n"
                + "leave my life is in danger. Donnovan tells you not to listen. He \n"
                + "says lets go. \n"
                + "Willows asks one last time to stay. He says I will be safe here.");
        System.out.println(" 'leave' or 'stay' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("leave")){
            System.out.println("You are not taking the chance. This is too dangerous \n"
                    + "you just stick around here.");


            leaveWithDonn();

        }
        if(input.equals("stay")){

            currentLvl = currentLvl + bonusNum;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + bonusNum + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("Bonus!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 3pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);


            System.out.println("You want the detective to know the truth! There are \n"
                    + "dangerous people out there!");
            if(currentLvl >= 10){
                JFrame secretFrame = new JFrame("Enter the Password");
                JPasswordField jPasswordField = new JPasswordField();
                jPasswordField.setBounds(100, 100, 140, 40);
                secretFrame.add(jPasswordField);
                secretFrame.setSize(300, 400);
                secretFrame.setLayout(null);
                secretFrame.setVisible(true);
                talkOrStop();


            }else{
                staySafe();
            }
            //staySafe();

        }



    }
    public static void talkOrStop(){
        System.out.println("What will you do?");
        System.out.println(" 'continue' or 'stop' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("continue")){
            System.out.println("You continue to talk about Maggie, who she is \n"
                    + "and how she knows John.");
            talkAboutMag();

        }
        if(input.equals("stop")){
            System.out.println("You've seen that red pin before. You saw it on \n"
                    + "that man who grabbed you. And that man on the train this \n"
                    + "morning. The detective has to be involved with people some how!");
            secretSeen();

        }

    }
    public static void secretSeen(){
        System.out.println("Willows doesnt see the red pin on the floor. \n"
                + "You slowly move your foot over it, cough loudly and drag \n"
                + "it close to you. Willows asks you to coninue. You tell him \n"
                + "that you changed your mind. He tries to pry, but you're silent. \n"
                + "About a minute later Willows gets up and storms out. \n"
                + "You get up, go to the door. If someone else was behind the \n"
                + "glass they wouldve came in to try and stop me already. \n"
                + "You run back and pick up the red pin that was under your foot. \n"
                + "You unfold the pointed pin from the circular cosmetic object.\n"
                + "You begin to pick the lock. Its not working. You try again, \n"
                + "Its open! You look out the door very carefully. No one seems to \n"
                + "be around.");
        System.out.println("Which way will you go?");
        System.out.println("Enter 'left' or 'right' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("left")){
            System.out.println("You go left down the hallway.");
            goLeft();

        }
        if(input.equals("right")){
            System.out.println("You head right torward the stairwell.");
            goRight();
        }

    }

    public static void talkAboutMag(){
        System.out.println("You tell Willows everything. He seems like a good cop. \n"
                + "You tell him about the Chinese mob and the company. \n"
                + "After Willows collects all the information, he gets up \n"
                + "and tells me I'm making the right choice. He leaves the room. \n"
                + "You begine to nod off. It's been a long, crazy day...You wake \n"
                + "and the detective tells you that I've earned some coffee \n"
                + "and food. It must be morning. Willows takes you \n"
                + "to his desk, gets you a cup of hot coffee, and looks \n"
                + "through some paperwork. He says that the information you \n"
                + "provided was very helpful. He pulls out a sheet of paper. \n"
                + "Willows then puts it face down on the desk. He walks away. \n"
                + "You pause for a moment. You flip the paper. The sight you see \n"
                + "shocks you. It's a picture of Maggie tied up. You see that she \n"
                + "must've been jumped at her apartment, because you recignize \n"
                + "the background. She's tied up with ducktape on her mounth. \n"
                + "It seems that the information you provided them was either \n"
                + "passed along to the Chinese or it was leaked. Either way \n"
                + "it seems that Willows is in on this too. A small sticky note \n"
                + "was attached to the picture. It reads, GO TO THE BASEMENT. \n"
                + "You get up, look around in suspicion, and head torward the \n"
                + "back stairwell leading to the police station basement. \n"
                + "The basement is empty. You hear a phone ring. You pick it up. \n"
                + "On the other line is a deep voice. They say they have Maggie. \n"
                + "They are in my apartment. They say they need my safe code to get \n"
                + "the files for the merger. John is dead and they need me now.\n"
                + "They say if I give them the code, Maggie will live.");
        System.out.println("Save Maggie or Save Company?");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("maggie")){

            currentLvl = currentLvl + LEVEL_UP;
            System.out.println("+ " + LEVEL_UP + "pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ " + LEVEL_UP , new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            //EOG pop-up


            JFrame fa = new JFrame("Story Branch Ended");
            JButton ba = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            ba.setBounds(100, 100, 140, 40);
            fa.add(b);
            fa.setSize(300, 400);
            fa.setLayout(null);
            fa.setVisible(true);


            JButton ba2 = new JButton("Maggie: Saved ", new ImageIcon("Sample.png"));
            ba2.setBounds(50, 50, 100, 20);
            fa.add(ba2);


            System.out.println("No amount of money is worth a persons life. \n"
                    + "John has already been killed. You can't live with \n"
                    + "another death.");

            saveMaggie(); //RELOAD


        }
        if(input.equals("company")){
            System.out.println("That company has the worth of a small island. \n"
                    + "We are talking millions. There is no way these punks are getting \n"
                    + "my hard earned business!");


        }

    }

    public static void goLeft(){
        System.out.println("You turn left and go into a long hallway. \n"
                + "You have no clue where the exit is! You open a door. \n"
                + "Another officer comes face-to-face with you. He yells STOP! \n"
                + "You turn and slam the door in his face. A few seconds later the \n"
                + "building alarm goes off. Now you're in trouble! You \n"
                + "run. It may look like this is the end.");
        System.out.println("*GAME RESULTS: John: Deceased, Maggie: Unknown, Company: Unknown");

        currentLvl = currentLvl + LEVEL_DOWN;
        InteractiveNov myNov2 = new InteractiveNov();
        System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
        System.out.println("LVL " + currentLvl);

        JFrame f = new JFrame("Story Branch Ended");
        JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
        b.setBounds(100, 100, 140, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);

        JButton b2 = new JButton("+ 1pt ", new ImageIcon("Sample.png"));
        b2.setBounds(50, 50, 100, 20);
        f.add(b2);

        Stats printFinalStats = new Stats();//NEW 2/8/19
        printFinalStats.savedJohn = false;
        System.out.println("John Saved:  " + printFinalStats.isSavedJohn());


    }
    public static void goRight(){
        System.out.println("You look down the stairs. Someone walks past. \n"
                + "You shoot back around the corner, wait, and look again. \n"
                + "It looks clear. You run down to the first floor. You \n"
                + "look in a room full of desks where officers work. There is \n"
                + "only one man in the room and his back is turned. You see a \n"
                + "cell phone on the desk behind him. You slowly go into the room \n"
                + "and grab the phone. You also see the files that have your \n"
                + "name on them. You have a clear window to escape, but \n"
                + "you also need to prove that the mob is involved with your \n"
                + "company");
        System.out.println("Will you get the files and risk getting caught or \n"
                + "safely escape the building?");
        System.out.println("ENTER 'escape' or 'get files'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("escape")){

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            System.out.println("You don't want to risk it. You leave.");
            escapeStation();

        }
        if(input.equals("get files")){
            System.out.println("You focus on getting the files from the desk.");

            currentLvl = currentLvl + bonusNum;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + bonusNum + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("Secret Uncovered!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 3pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            gotProof();
        }

    }

    public static void maggieLeaves(){
        System.out.println("Maggie is very hurt and offended that you would \n"
                + "even consider that she was hiding something. She tears up \n"
                + "and tell you that you are a jerk. She says that she was only \n"
                + "trying to help! She tells you good luck, and storms out. \n"
                + "You feel bad, but she should have told you!");
        System.out.println("Now you are on your own. You have to talk to John, "
                + "but you know that those goons are with him. About an hour later"
                + "you get a text. It's a picture of Maggie's body! She was kidnapped and killed"
                + "when she stormed off! You did this! \n");
        System.out.println("You need to end this! I either have to sign the \n"
                + "contract for the Chinese or John will have the same fate.");
        System.out.println("ENTER 'sign' or 'dont' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("sign")){
            System.out.println("You have to end this");
            zeroPerc();


            //New content (1/18/19)
            //New GUI's
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect1 = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.lightGray);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.red);
            titleNameLabel = new JLabel("Final Level: " + currentLvl);

            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);

            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("- 1pt", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);


        }
        if(input.equals("dont")){

            System.out.println("You get a call from the police saying John was found dead!"
                    + "No checkpoints available. Please restart");
            JFrame window1 = new JFrame();
            window1.setSize(1000, 1000);
            window1.setTitle("MENU");
            window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window1.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window1.getContentPane().setBackground(Color.red);
            window1.setLayout(null);
            con = window1.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.red);
            titleNameLabel = new JLabel("John is dead. NO CHECKPOINTS. Please Restart");
            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);

            //NEW as of 2/24/19
            CharacterInfo characterInfo = new CharacterInfo() {
                @Override
                public void label() {
                    System.out.println("Label: Redeemer ");

                }

                @Override
                public void title() {
                    System.out.println("Title: Bum");

                }

                @Override
                public void getAllCharacterInfo() {

                }
            };
            characterInfo.label();




        }



    }
    public static void johnAlive(){
        System.out.println("You feel empty inside but it seems that \n"
                + "these men are sticking to their word and letting me live. \n"
                + "Out of the shadows you see John. That coward. \n"
                + "At least he his ok, you think.");
        System.out.println("**Story Outcome** \n"
                + "John: Alive, Company: Signed to Chinese, Maggie: Unharmed");
        System.out.println("Would you like to go back to a story checkpoint?");
        System.out.println("GAME TIP: If the story hits a dead end, you may be \n"
                + "asked if you would like to reload a story checkpoint. \n"
                + "In other words you can go back to the last decision in the story \n"
                + "try another route!");
        System.out.println("ENTER 'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            System.out.println("Going to last checkpoint...");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("MENU");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.black);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.blue);
            titleNameLabel = new JLabel("Interactive Novel **Story Outcome** \n"
                    + "John: Alive, Company: Signed to Chinese, Maggie: Unharmed");
            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);
            threatGrasp();


        }
        if(input.equals("no")){
            System.out.println("You quit the game");


        }

    }
    public static void escapeStation(){
        System.out.println("*You have successfully left the station! \n"
                + "As you are walking through the back parking lot, your \n"
                + "hear a voice. The deep, male voice says that he knows \n"
                + "whats happening and he can help. The way he talks sounds \n"
                + "like he's a cop. He's not in uniform, but he has a badge on \n"
                + "his belt. He says that the whole station is corrupt. His \n"
                + "name is Mills. He says that he's sick and tired of seeing \n"
                + "innocent people get caught up in violence and corruption. \n"
                + "He says that they were going to kill me. He tells you \n"
                + "to get in his car and he'll explain along the way.");
        millsHelp();
    }
    public static void gotProof(){
        System.out.println("You carefully open the door and sneak into the room. \n"
                + "You see the thick folder and slowly take it. You have been out of \n"
                + "the interrogation room for a while. Someone is going to notice! \n"
                + "All of a sudden the alarm goes off. You got greedy! You run to \n"
                + "a nearby closet to hide out. You hear loud footsteps outside \n"
                + "the door. The cops out side are running to find you. The coast \n"
                + "is clear and you leave the closet and run to the back exit. \n"
                + "Out of nowhere a man grabs you and throws you against the wall. \n"
                + "He says he's not my enemy. His name is Mills and he wants to help. \n"
                + "He tells you that these cops are corrupt. He drags you outside \n"
                + "and into his car.");
        millsHelp();

    }
    public static void millsHelp(){
        System.out.println("Detective Mills tells you that he can help you prove to the \n"
                + "D.A. whats been happening. He says that Willows was paid off by \n"
                + "the Chinese. He says that their street name is the Red Pin Gang. \n"
                + "That pin that you've seen, and the one that Willows had, must be \n"
                + "their calling card. He says that they have hidden hit-men, assasins, \n"
                + "if you will, that dip the tip of the pin into poison. They then \n"
                + "poke the target and within minutes they are dead. Mills \n"
                + "says that sometimes a smaller dose can be given and it would take \n"
                + "a day or so. So in theory, John could've been poisoned the previous \n"
                + "day with a smaller dose or with a heavier right before. \n"
                + "Only Maggie saw John last night! It could'nt have been her!? \n"
                + "These people are good at setting up people. Thats what they want.");
        System.out.println("Bring up Maggie to Mills as a potential suspect or trust your gut \n"
                + "and leave Maggie out of the suspect list.");
        System.out.println("ENTER 'accuse' or 'dont' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("accuse")){
            System.out.println("Mills is insulted! He stops the car and says get out! \n"
                    + "He says good luck on your own.");
            System.out.println("Now you have no chance! John is gone, Maggie's somewhere, \n"
                    + "and now the only person who was going to help is gone! Damn!");
            System.out.println("Story not complete! There are still lose ends!");
            System.out.println("Your ignorance cost you! Please start again!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.red);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.red);
            titleNameLabel = new JLabel("Your ignorance cost you! Try again \n"
                    + "and try not to be a jerk!");

            titleNameLabel.setForeground(Color.black);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);


            currentLvl = currentLvl + LEVEL_DOWN;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_DOWN + " pt");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 1pt", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar accuseProgBar = new ProgressBar();//2/10
            accuseProgBar.mainBar();



        }
        if(input.equals("dont")){
            System.out.println("You continue to Mills's place. If you shut down the mob you \n"
                    + "can end this for good.");

            currentLvl = currentLvl + LEVEL_UP;
            InteractiveNov myNov2 = new InteractiveNov();
            System.out.println(myNov2.printLevelPlus() + LEVEL_UP + " pts");
            System.out.println("LVL " + currentLvl);

            JFrame f = new JFrame("You leveled Up!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("+ 2pts", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);

            ProgressBar dontAccuseProgBar = new ProgressBar();//2/10
            dontAccuseProgBar.mainBar();


            millsPlace();


        }

    }
    public static void leaveWithDonn(){
        System.out.println("You and Mike leave and walk out to the \n"
                + "parking lot. He says that Maggie has a friend that helped. \n"
                + "He actually works in the police department. He has proof that \n"
                + "this department is corrupt and that they too are working \n"
                + "with the Chinese mob. Mike says to keep walking. He says \n"
                + "he'll be in contact. Mike leaves and you keep walking.");
        escapeStation();
    }
    public static void staySafe(){
        System.out.println("You decide to play it safe. You tell Willows \n"
                + "about all the strange happenings.");
    }
    public static void saveMaggie(){

        System.out.println("You tell them you don't want anymore violence. You tell them to release Maggie \n"
                + "right now and then you'll sign. Maggie is safe, she will walk away safely!");
        System.out.println("YOU SAVED MAGGIE!");
        System.out.println("**GAME RESULTS: Maggie: safe, John: deceased, Company: sold");
        System.out.println("33% score! You could have done better! Good game!");
        System.out.println("Would you like to reload your last checkpoint?");
        System.out.println("ENTER 'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            System.out.println("Going to last checkpoint...");

            JFrame f = new JFrame("Story Branch Ended");
            JButton b = new JButton("Going to last checkpoint", new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("....", new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);


            talkAboutMag();


        }
        if(input.equals("no")){

            JFrame f = new JFrame("Quitting game");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            //JButton b2 = new JButton("+ 1pt ", new ImageIcon("Sample.png"));
            //b2.setBounds(50, 50, 100, 20);
            //f.add(b2);


            System.out.println("You quit the game");


        }

    }
    public static void takePen(){
        System.out.println("Use the pen and a weapon or just be over with it!'");
        System.out.println("ENTER 'stab' or 'sign'");
        //System.out.println("ENTER 'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();

        if(input.equals("stab")){
            System.out.println("You gain a rush of rage and stab the man in his arm. \n"
                    + "He screams and grabs his wounded, bloody arm. You run! You \n"
                    + "also realize that you have the contract. You have the proof!");
            System.out.println("*GAME RESULTS: John: Alive, Maggie: Alive, Company: Safe ");
            System.out.println("Congrats! You finished the game with a 100%! That's no easy \n"
                    + "feat considering the mob is after you!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.green);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.green);
            titleNameLabel = new JLabel(" \n"
                    + " *GAME RESULTS: John: Alive, Maggie: Alive,\n"
                    + " Company: Saved \n"
                    + "Congrats! You finished with a 100% \n"
                    + "Perfect!");

            titleNameLabel.setForeground(Color.black);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);

            JFrame f = new JFrame("True Ending achieved!");
            JButton b = new JButton("LVL" + currentLvl, new ImageIcon("github_image.png"));
            b.setBounds(100, 100, 140, 40);
            f.add(b);
            f.setSize(300, 400);
            f.setLayout(null);
            f.setVisible(true);

            JButton b2 = new JButton("100% + " + LEVEL_UP , new ImageIcon("Sample.png"));
            b2.setBounds(50, 50, 100, 20);
            f.add(b2);




        }
        if(input.equals("sign")){

            System.out.println("You signed over the company!");
            System.out.println("*GAME RESULTS: John: Alive, Maggie: Alive, Company: Sold");
            System.out.println("You finished the game with a 67% Not too bad!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.black);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.blue);
            titleNameLabel = new JLabel("Interactive Novel \n"
                    + " *GAME RESULTS: John: Deceased, Maggie: Saved, Company: Saved \n"
                    + "67%");

            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);





        }

    }
    public static void millsPlace(){
        System.out.println("You and Mills arrive at the hideout. You just need Maggie. Mills is \n"
                + "able to track her phones location. You arrive at a wearhouse. Mills \n"
                + "gives you a wire to wear. He says if I get them to confess, we can put these \n"
                + "bastards and the whole corrupt police department away for good! You \n"
                + "walk into the wearhouse slowly. A man yels stop! you do. You immediately \n"
                + "say you are here to end this.");
        System.out.println("You ask about everything. You say you know they are the Red-pin gang! \n"
                + "The leader of the mob says confesses to all. He confesses to blackmailing John. \n"
                + "Thats it! thats the proof you need.");
        System.out.println("Run out with the proof or stall to save Maggie?");
        System.out.println("ENTER 'run' or 'save'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("run")){
            System.out.println("You got all the proof to get off the hook! But Maggie is still in there!");
            System.out.println("*GAME RESULTS: John: Deceased, Maggie: unknown, Company: saved ");
            System.out.println("BONUS score for proving your innocence! 75% score! Nice!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("Story Results");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.black);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.blue);
            titleNameLabel = new JLabel(" \n"
                    + " *GAME RESULTS: John: Deceased, Maggie: Unknown, Company: Saved \n"
                    + "BONUS score for proving innocence! 75% Nice!");

            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);




        }
        if(input.equals("save")){
            System.out.println("You keep them talking and just as you do, Mills runs in and gets Maggie! \n"
                    + "Your patience paid off!");
            System.out.println("*GAME RESULTS: John: Deceased, Maggie: Saved, Company: Saved");
            System.out.println("Game score: 67% Not bad!");
            JFrame window = new JFrame();
            window.setSize(1000, 1000);
            window.setTitle("MENU");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            Rectangle rect = new Rectangle(100, 100, 300, 100);
            window.getContentPane().setBackground(Color.black);
            window.setLayout(null);
            con = window.getContentPane();

            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100,  100,  600, 150);
            titleNamePanel.setBackground(Color.blue);
            titleNameLabel = new JLabel("Interactive Novel \n"
                    + " *GAME RESULTS: John: Deceased, Maggie: Saved, Company: Saved \n"
                    + "67%");

            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            titleNamePanel.add(titleNameLabel);
            con.add(titleNamePanel);


        }


    }
    public static void zeroPerc(){
        System.out.println("*GAME RESULTS: John: Deceased, Maggie: Deceased, Company: Saved");
        System.out.println("Both your friends are dead! You recieved a 33% score! Be better next time!");


    }
    public static void keepGoing(){
        System.out.println("You and Maggie head back to the office in hopes to find the original \n"
                + "conrtact statments and sent it to the district attorney.");
        System.out.println("You prooved that there is criminal activity going on \n"
                + "in the city police departent and the Chinese mob. \n"
                + "You arrive at the office of the district attorney.");
        System.out.println("*GAME RESULTS: John: Alive, Maggie: Alive, Company: Saved ");
        JFrame window = new JFrame();
        window.setSize(1000, 1000);
        window.setTitle("Story Results");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Rectangle rect = new Rectangle(100, 100, 300, 100);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,  100,  600, 150);
        titleNamePanel.setBackground(Color.blue);
        titleNameLabel = new JLabel("*GAME RESULTS \n"
                + "John: Alive, Maggie: Alive. Company: Saved");

        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);


        //New content (1/18/19)
        //New GUI's
        JFrame window1 = new JFrame();
        window.setSize(1000, 1000);
        window.setTitle("Story Results");
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Rectangle rect1 = new Rectangle(100, 100, 300, 100);
        window.getContentPane().setBackground(Color.lightGray);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,  100,  600, 150);
        titleNamePanel.setBackground(Color.red);
        titleNameLabel = new JLabel("-------\n" +
                "                         ----->--");

        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
       

    }


    @Override
    public void label() {
        System.out.println("Label: Bum");

    }

    @Override
    public void title() {
        System.out.println("TITLE: Redeemer ");

    }

    @Override
    public void getAllCharacterInfo() {
        label();
        title();

    }
}
