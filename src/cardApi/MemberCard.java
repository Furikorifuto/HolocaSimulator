package cardApi;


public class MemberCard extends BaseCard{
    private EnumMember cardMember;
    private int maxHealth;
    private int nowHealth;
    private int cardLimit;
    private boolean buzzFlag;
    private EnumCostTable changeCost;

    public MemberCard( EnumMember member, EnumRecorded recorded, EnumColor color, EnumCardType type, int health,EnumCostTable cost, boolean buzz, int limit) {
        super(member.toString(),recorded,type,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setChangeCost(cost);
        this.setCardLimit(limit);
        this.setBuzzFlag(buzz);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health,EnumCostTable cost, boolean buzz) {
        super(member.toString(),recorded,type,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setChangeCost(cost);
        this.setCardLimit(4);
        this.setBuzzFlag(buzz);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health,EnumCostTable cost, int limit) {
        super(member.toString(),recorded,type,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setChangeCost(cost);
        this.setCardLimit(limit);
        this.setBuzzFlag(false);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health,EnumCostTable cost) {
        super(member.toString(),recorded,type,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setChangeCost(cost);
        this.setCardLimit(4);
        this.setBuzzFlag(false);
    }
    public EnumMember getEnumMember(){
        return cardMember;
    }
    public void setEnumMember(EnumMember member){
        this.cardMember = member;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }
    public int getNowHealth(){
        return nowHealth;
    }
    public void setNowHealth(int health){
        this.nowHealth = health;
    }
    public int getCardLimit(){
        return cardLimit;
    }
    public void setCardLimit(int limit){
        this.cardLimit = limit;
    }
    public boolean isBuzzFlag(){
        return buzzFlag;
    }
    public void setBuzzFlag(boolean flag){
        this.buzzFlag = flag;
    }

    public EnumCostTable getChangeCost() {
        return changeCost;
    }

    public void setChangeCost(EnumCostTable cost) {
        this.changeCost = cost;
    }
}
