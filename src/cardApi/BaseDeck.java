package cardApi;

import java.util.ArrayList;
import java.util.List;

public class BaseDeck {
    LeaderCard leaderCard;
    List<MemberCard> memberCards = new ArrayList<MemberCard>(50);
    List<EnumColor> yellCards = new ArrayList<EnumColor>(20);
    public BaseDeck(LeaderCard leader){
        this.setLeader(leader);
    }
    public LeaderCard getLeader(){
        return this.leaderCard;
    }
    public void setLeader(LeaderCard card){
        this.leaderCard = card;
    }
    public List<MemberCard> getMemberCards(){
        return this.memberCards;
    }
    public void setMemberCards(List<MemberCard> list){
        this.memberCards = list;
    }
    public List<EnumColor> getYellCards(){
        return this.yellCards;
    }
    public void setYellCards(List<EnumColor> list){
        this.yellCards = list;
    }
    public boolean isBuild(){
        return (this.getLeader() != null)&&(this.getMemberCards().size() == 50)&&(this.getYellCards().size() == 20);
    }
}
