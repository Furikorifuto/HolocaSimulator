package cardApi;

import java.util.ArrayList;
import java.util.List;

public class BaseDeck {
<<<<<<< Updated upstream
    private LeaderCard leaderCard;
    private List<BaseCard> memberCards = new ArrayList<BaseCard>(50);
    private List<YellCard> yellCards = new ArrayList<YellCard>(20);

=======
    LeaderCard leaderCard;
    List<MemberCard> memberCards = new ArrayList<MemberCard>(50);
    List<CardColor> yellCards = new ArrayList<CardColor>(20);
>>>>>>> Stashed changes
    public BaseDeck(LeaderCard leader){
        this.setLeader(leader);
    }
    public LeaderCard getLeader(){
        return this.leaderCard;
    }
    public void setLeader(LeaderCard card){
        this.leaderCard = card;
    }
    public List<BaseCard> getMemberCards(){
        return this.memberCards;
    }
    public void setMemberCards(List<BaseCard> list){
        this.memberCards = list;
    }
<<<<<<< Updated upstream
    public List<YellCard> getYellCards(){
        return this.yellCards;
    }
    public void setYellCards(List<YellCard> list){
=======
    public List<CardColor> getYellCards(){
        return this.yellCards;
    }
    public void setYellCards(List<CardColor> list){
>>>>>>> Stashed changes
        this.yellCards = list;
    }
    public boolean isBuild(){
        return (this.getLeader() != null)&&(this.getMemberCards().size() == 50)&&(this.getYellCards().size() == 20);
    }
}
