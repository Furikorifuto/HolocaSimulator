package cardApi;
//全カードの親クラス
//色と収録段を設定
public class BaseCard {
<<<<<<< Updated upstream
    private String cardName;
    private EnumColor cardColor;
    private EnumCardType cardType;
    private EnumRecorded cardRecorded;

    public BaseCard(String name,EnumRecorded recorded,EnumCardType type,EnumColor color){
=======
    public static final int WHITE = 0;
    public static final int GREEN = 1;
    public static final int RED = 2;
    public static final int BLUE = 3;
    public static final int PURPLE = 4;
    public static final int YELLOW = 5;
    public String cardName;
    public CardColor enumColor;
    public CardType enumCardType;
    public Recorded enumRecorded;

    public BaseCard(String name, CardType type, Recorded recorded, CardColor color){
>>>>>>> Stashed changes
        this.setCardName(name);
        this.setCardType(type);
        this.setRecorded(recorded);
        this.setColor(color);
    }
    public String getCardName() {
        return cardName;
    }
    public void setCardName(String name){
        this.cardName = name;
    }
    public EnumCardType getCardType(){
        return cardType;
    }
    public void setCardType(EnumCardType type){
        this.cardType = type;
    }
    public EnumRecorded getRecorded(){
        return cardRecorded;
    }
    public void setRecorded(EnumRecorded recorded){
        this.cardRecorded = recorded;
    }
    public EnumColor getColor() {
        return cardColor;
    }
    public void setColor(EnumColor colors){
        this.cardColor = colors;
    }
    //JListなど1行を出力させる
    public String getTitle(){
        return "This is base class!";
    }
    //JTextareaなど複数の詳細の情報を出力させる
    public String getCardStatus(){
        return "This is base class!";
    }
<<<<<<< Updated upstream
    public boolean isMember(){
        return true;
=======
    public CardType getCardType(){
        return this.enumCardType;
    }
    public void setCardType(CardType type){
        this.enumCardType = type;
    }
    public Recorded getRecorded(){
        return this.enumRecorded;
    }
    public void setRecorded(Recorded recorded){
        this.enumRecorded = recorded;
    }
    public CardColor getColor() {
        return this.enumColor;
    }
    public void setColor(CardColor colors){
        this.enumColor = colors;
>>>>>>> Stashed changes
    }
}
