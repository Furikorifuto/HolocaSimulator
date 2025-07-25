package cardApi;
//推しカードの親クラス
//最大体力を設定する
public class LeaderCard extends BaseCard{
<<<<<<< Updated upstream
    private int maxHealth;
    private EnumMember cardMember;

    public LeaderCard(EnumMember member,EnumRecorded recorded,EnumColor color,int health) {
        super(member.toString(),recorded,EnumCardType.Leader,color);
=======
    public int maxHealth;
    public Member enumMember;
    public LeaderCard(Member member, Recorded recorded, CardColor color, int health) {
        super(member.toString(), CardType.Leader,recorded,color);
>>>>>>> Stashed changes
        this.setEnumMember(member);
        this.setMaxHealth(health);
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }
<<<<<<< Updated upstream
    public EnumMember getEnumMember(){
        return this.cardMember;
    }
    public void setEnumMember(EnumMember member){
        this.cardMember = member;
=======
    public Member getEnumMember(){
        return this.enumMember;
    }
    public void setEnumMember(Member member){
        this.enumMember = member;
>>>>>>> Stashed changes
    }
    @Override
    public String getTitle() {
        return this.getEnumMember().toString()+"("+this.getRecorded().toString()+")";
    }
}
