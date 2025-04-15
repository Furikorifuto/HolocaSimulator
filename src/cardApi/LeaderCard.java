package cardApi;
//推しカードの親クラス
//最大体力を設定する
public class LeaderCard extends BaseCard{
    public int maxHealth;
    public EnumMember enumMember;
    public LeaderCard(EnumMember member,EnumRecorded recorded,boolean w,boolean g,boolean r,boolean b,boolean y,boolean p,int health) {
        super(member.toString(),EnumCardType.Leader,recorded,w,g,r,b,y,p);
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
        return this.enumMember;
    }
    public void setEnumMember(EnumMember member){
        this.enumMember = member;
    }
    @Override
    public String getTitle() {
        return this.getEnumMember().toString()+"("+this.getRecorded().toString()+")";
    }
}
