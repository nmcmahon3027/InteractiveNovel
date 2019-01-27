


public class Stats {

    //starting level stat
    public static int DEFAULT_LEVEL = 0;

    //amount of XP each "positive" choice increase gives
    public static final int LEVEL_UP = 2;


    //amount of XP each "negative" choice gives
    public static final int LEVEL_DOWN = 1;

    public static int currentLvl = DEFAULT_LEVEL;
    public static String levelp = "LVL";
    public static String pt = "pt";
    public static String pts = "pts";
    public static String bonus = "BONUS!";



    public int LVL;//all WERE private
    public String name;
    public boolean savedCompany;
    public boolean savedMaggie;


    public Stats(){ //Stats constructor
        LVL = DEFAULT_LEVEL;
        name = "";
        savedCompany = false;
        savedMaggie = false;

    }
    public String getName(){
        return name;
    }
    public String getBonus(){
        return bonus;
    }
    public int getLVL(){
        return DEFAULT_LEVEL;
    }
    public boolean isSavedCompany(){
        return savedCompany;

    }

    public boolean isSavedMaggie() {
        return savedMaggie;
    }
    public void setLVL(int lvl){
        this.LVL = LVL;
    }
    public int addToLevel(int a, int b, int c){
        a = LVL;
        b = LEVEL_UP;
        c = LEVEL_DOWN;
        return a + b + c;



    }
    public String printLevelPlus(){
        String plus = "+";
        return plus;
    }




}
