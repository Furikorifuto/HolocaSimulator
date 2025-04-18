package cardApi;


public class MemberCard extends BaseCard{
    public EnumMember enumMember;
    public int maxHealth;
    public int nowHealth;
    public int cardLimit;
    public boolean buzzFlag;

    public MemberCard( EnumMember member, EnumRecorded recorded, EnumColor color, EnumCardType type, int health, boolean buzz, int limit) {
        super(member.toString(), type, recorded,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setCardLimit(limit);
        this.setBuzzFlag(buzz);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health, boolean buzz) {
        super(member.toString(), type, recorded,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setCardLimit(4);
        this.setBuzzFlag(buzz);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health, int limit) {
        super(member.toString(), type, recorded,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setCardLimit(limit);
        this.setBuzzFlag(false);
    }
    public MemberCard( EnumMember member, EnumRecorded recorded,EnumColor color, EnumCardType type, int health) {
        super(member.toString(), type, recorded,color);
        this.setEnumMember(member);
        this.setMaxHealth(health);
        this.setCardLimit(4);
        this.setBuzzFlag(false);
    }
    public EnumMember getEnumMember(){
        return this.enumMember;
    }
    public void setEnumMember(EnumMember member){
        this.enumMember = member;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }
    public int getNowHealth(){
        return this.nowHealth;
    }
    public void setNowHealth(int health){
        this.nowHealth = health;
    }
    public int getCardLimit(){
        return this.cardLimit;
    }
    public void setCardLimit(int limit){
        this.cardLimit = limit;
    }
    public boolean isBuzzFlag(){
        return this.buzzFlag;
    }
    public void setBuzzFlag(boolean flag){
        this.buzzFlag = flag;
    }
}
