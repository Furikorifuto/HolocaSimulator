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
    public Boolean[] cardColors = new Boolean[6];
    public EnumRecorded enumRecorded;

    public BaseCard(Boolean[] colors ,EnumRecorded recorded){
        this.setColors(colors);
        this.setRecorded(recorded);
    }
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
    public EnumRecorded getRecorded(){
        return this.enumRecorded;
    }
    public void setRecorded(EnumRecorded recorded){
        this.enumRecorded = recorded;
    }
    public String getTitle(){
        return "This is base class!";
    }
}
