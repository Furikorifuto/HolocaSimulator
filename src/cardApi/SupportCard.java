package cardApi;

public class SupportCard extends BaseCard{
    private boolean LimitedFlag;
    private int cardLimit;

    public SupportCard(String name, EnumRecorded recorded, EnumCardType type,boolean limited) {
        super(name,recorded,type,EnumColor.None);
        this.setLimitedFlag(limited);
        this.setCardLimit(4);
    }
    public SupportCard(String name, EnumRecorded recorded, EnumCardType type,boolean limited,int limit) {
        super(name,recorded,type,EnumColor.None);
        this.setLimitedFlag(limited);
        this.setCardLimit(limit);
    }

    public boolean isLimitedFlag() {
        return LimitedFlag;
    }

    public void setLimitedFlag(boolean flag) {
        LimitedFlag = flag;
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int limit) {
        this.cardLimit = limit;
    }
    public boolean isMember() {
        return false;
    }

    @Override
    public String toString() {
        return getCardName();
    }
}
