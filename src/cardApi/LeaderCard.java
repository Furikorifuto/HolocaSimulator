package cardApi;
//推しカードの親クラス
//最大体力を設定する
public class LeaderCard extends BaseCard{
    private int maxHealth;
    private EnumMember cardMember;

    public LeaderCard(EnumMember member,EnumRecorded recorded,EnumColor color,int health) {
        super(member.toString(),EnumCardType.Leader,recorded,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }
    public EnumMember getEnumMember(){
        return this.cardMember;
    }
    public void setEnumMember(EnumMember member){
        this.cardMember = member;
    }
    @Override
    public String getTitle() {
        return this.getEnumMember().toString()+"("+this.getRecorded().toString()+")";
    }
}
