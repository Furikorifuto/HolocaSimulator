package cardApi;
//全カードの親クラス
//色と収録段を設定
public class BaseCard {
    private String cardName;
    private EnumColor cardColor;
    private EnumCardType cardType;
    private EnumRecorded cardRecorded;

    public BaseCard(String name,EnumRecorded recorded,EnumCardType type,EnumColor color){
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
}
