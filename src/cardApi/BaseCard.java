package cardApi;
//全カードの親クラス
//色と収録段を設定
public class BaseCard {
    public static final int WHITE = 0;
    public static final int GREEN = 1;
    public static final int RED = 2;
    public static final int BLUE = 3;
    public static final int PURPLE = 4;
    public static final int YELLOW = 5;
    public String cardName;
    public Boolean[] cardColors = new Boolean[6];
    public EnumCardType enumCardType;
    public EnumRecorded enumRecorded;

    public BaseCard(String name,EnumCardType type,EnumRecorded recorded,boolean w,boolean g,boolean r,boolean b,boolean y,boolean p){
        this.setCardName(name);
        this.setCardType(type);
        this.setRecorded(recorded);
        this.setColors(w,g,r,b,y,p);
    }
    public void setCardName(String name){
        this.cardName = name;
    }
    //JListなど1行を出力させる
    public String getTitle(){
        return "This is base class!";
    }
    //JTextareaなど複数の詳細の情報を出力させる
    public String getCardStatus(){
        return "This is base class!";
    }
    public EnumCardType getCardType(){
        return this.enumCardType;
    }
    public void setCardType(EnumCardType type){
        this.enumCardType = type;
    }
    public EnumRecorded getRecorded(){
        return this.enumRecorded;
    }
    public void setRecorded(EnumRecorded recorded){
        this.enumRecorded = recorded;
    }
    //card color set and get
    public static boolean hasWhite(Boolean[] colors){
        return colors[WHITE];
    }
    public static boolean hasGreen(Boolean[] colors){
        return colors[GREEN];
    }
    public static boolean hasRed(Boolean[] colors){
        return colors[RED];
    }
    public static boolean hasBlue(Boolean[] colors){
        return colors[BLUE];
    }
    public static boolean hasPurple(Boolean[] colors){
        return colors[PURPLE];
    }
    public static boolean hasYellow(Boolean[] colors){
        return colors[YELLOW];
    }
    public void setColors(boolean white, boolean green, boolean red, boolean blue, boolean purple, boolean yellow){
        this.cardColors[WHITE] = white;
        this.cardColors[GREEN] = green;
        this.cardColors[RED] = red;
        this.cardColors[BLUE] = blue;
        this.cardColors[PURPLE] = purple;
        this.cardColors[YELLOW] = yellow;
    }
    public void setColors(Boolean[] colors){
        this.cardColors = colors;
    }
    public void setWhite(){
        this.cardColors[WHITE] = true;
    }
    public void setGreen(){
        this.cardColors[GREEN] = true;
    }
    public void setRed(){
        this.cardColors[RED] = true;
    }
    public void setBlue(){
        this.cardColors[BLUE] = true;
    }
    public void setPurple(){
        this.cardColors[PURPLE] = true;
    }
    public void setYellow(){
        this.cardColors[YELLOW] = true;
    }
}
