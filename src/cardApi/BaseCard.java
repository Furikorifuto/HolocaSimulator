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
    public EnumColor enumColor;
    public EnumCardType enumCardType;
    public EnumRecorded enumRecorded;

    public BaseCard(String name,EnumCardType type,EnumRecorded recorded,EnumColor color){
        this.setCardName(name);
        this.setCardType(type);
        this.setRecorded(recorded);
        this.setColor(color);
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
    public EnumColor getColor() {
        return this.enumColor;
    }
    public void setColor(EnumColor colors){
        this.enumColor = colors;
    }
}
