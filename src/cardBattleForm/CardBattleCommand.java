package cardBattleForm;

import cardApi.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBattleCommand {

    public static void mainDeck1PCreate() {
        CardBattleForm.baseDeck1P = new BaseDeck(RegisterCards.LUNA);
        List<BaseCard> list = new ArrayList<>();
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_110);
        list.addLast(RegisterCards.LUNA_110);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.OLD_PC);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.INTIMIDATION);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        CardBattleForm.baseDeck1P.setMemberCards(list);
        List<YellCard> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.addLast(RegisterCards.WHITE_YELL);
        }
        CardBattleForm.baseDeck1P.setYellCards(list2);
    }
    public static void mainDeck2PCreate(){
        CardBattleForm.baseDeck2P = new BaseDeck(RegisterCards.MIKO);
        List<BaseCard> list = new ArrayList<>();
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_130_A);
        list.addLast(RegisterCards.MIKO_130_A);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Magchi);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.INTIMIDATION);
        list.addLast(RegisterCards.WAIT_REQUEST);
        CardBattleForm.baseDeck2P.setMemberCards(list);
        List<YellCard> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.addLast(RegisterCards.RED_YELL);
        }
        CardBattleForm.baseDeck2P.setYellCards(list2);

    }
    public static void setCount(int timeCount, String key, boolean stopFlag){
        CardBattleForm.nextTime = timeCount;
        CardBattleForm.count = key;
        CardBattleForm.timerStopFlag = stopFlag;
    }
    public static void mainDeckShuffle(boolean flag2P){
        if(flag2P) {
            Collections.shuffle(CardBattleForm.baseDeck2P.getMemberCards());
            CardBattleForm.labelMainDeckValue2P.setText(Integer.toString(CardBattleForm.baseDeck2P.getMemberCards().size()));
            CardBattleForm.textAreaLog.append("2P main deck shuffled\n");
        }else {
            Collections.shuffle(CardBattleForm.baseDeck1P.getMemberCards());
            CardBattleForm.labelMainDeckValue1P.setText(Integer.toString(CardBattleForm.baseDeck1P.getMemberCards().size()));
            CardBattleForm.textAreaLog.append("1P main deck shuffled\n");
        }
    }
    public static void yellDeckShuffle(boolean flag2P){
        if(flag2P) {
            Collections.shuffle(CardBattleForm.baseDeck2P.getYellCards());
            CardBattleForm.labelYellDeckValue2P.setText(Integer.toString(CardBattleForm.baseDeck2P.getYellCards().size()));
            CardBattleForm.textAreaLog.append("2P yell deck shuffled\n");
        }else {
            Collections.shuffle(CardBattleForm.baseDeck1P.getYellCards());
            CardBattleForm.labelYellDeckValue1P.setText(Integer.toString(CardBattleForm.baseDeck1P.getYellCards().size()));
            CardBattleForm.textAreaLog.append("1P yell deck shuffled\n");
        }
    }

    public static void leaderCardPlace(){
        CardBattleForm.leader1P = CardBattleForm.baseDeck1P.getLeader();
        CardBattleForm.labelLeaderValue1P.setText("???");
        CardBattleForm.textAreaLog.append("1P Leader card pleased\n");
        CardBattleForm.leader2P = CardBattleForm.baseDeck2P.getLeader();
        CardBattleForm.labelLeaderValue2P.setText("???");
        CardBattleForm.textAreaLog.append("2P Leader card pleased\n");
    }
    public static void drawCard(boolean flag2, int cards){
        for(int i=0;i<cards;i++) {
            if (flag2) {
                BaseCard card = CardBattleForm.baseDeck2P.getMemberCards().getLast();
                CardBattleForm.hand2p.add(card);
                if (card.isMember()) {
                    MemberCard memberCard = (MemberCard) card;
                    CardBattleForm.listModel2.addElement(memberCard);
                } else {
                    SupportCard supportCard = (SupportCard) card;
                    CardBattleForm.listModel2.addElement(supportCard);
                }
                CardBattleForm.baseDeck2P.getMemberCards().removeLast();
                CardBattleForm.textAreaLog.append("2P draw 1 card\n");
                CardBattleForm.labelHandValue2P.setText(String.valueOf(CardBattleForm.hand2p.size()));
                CardBattleForm.labelMainDeckValue2P.setText(Integer.toString(CardBattleForm.baseDeck2P.getMemberCards().size()));
            } else {
                BaseCard card = CardBattleForm.baseDeck1P.getMemberCards().getLast();
                CardBattleForm.hand1p.add(card);
                if (card.isMember()) {
                    MemberCard memberCard = (MemberCard) card;
                    CardBattleForm.listModel1.addElement(memberCard);
                } else {
                    SupportCard supportCard = (SupportCard) card;
                    CardBattleForm.listModel1.addElement(supportCard);
                }
                CardBattleForm.baseDeck1P.getMemberCards().removeLast();
                CardBattleForm.textAreaLog.append("1P draw 1 card\n");
                CardBattleForm.labelHandValue1P.setText(String.valueOf(CardBattleForm.hand1p.size()));
                CardBattleForm.labelMainDeckValue1P.setText(Integer.toString(CardBattleForm.baseDeck1P.getMemberCards().size()));
            }
        }
    }
    public static void AllHandToDeck(boolean flag2P){
        if(flag2P) {
            for (int i = 0; i < CardBattleForm.hand2p.size(); ) {
                BaseCard baseCard = CardBattleForm.baseDeck2P.getMemberCards().getLast();
                CardBattleForm.baseDeck2P.getMemberCards().add(baseCard);
                CardBattleForm.listModel2.remove(CardBattleForm.hand2p.size() - 1);
                CardBattleForm.hand2p.removeLast();
                CardBattleForm.textAreaLog.append("2P Puts the cards back into the deck.\n");
                CardBattleForm.labelMainDeckValue2P.setText(Integer.toString(CardBattleForm.baseDeck2P.getMemberCards().size()));
            }
        }else {
            for (int i = 0; i < CardBattleForm.hand1p.size(); ) {
                BaseCard baseCard = CardBattleForm.baseDeck1P.getMemberCards().getLast();
                CardBattleForm.baseDeck1P.getMemberCards().add(baseCard);
                CardBattleForm.listModel1.remove(CardBattleForm.hand1p.size() - 1);
                CardBattleForm.hand1p.removeLast();
                CardBattleForm.textAreaLog.append("1P Puts the cards back into the deck.\n");
                CardBattleForm.labelMainDeckValue1P.setText(Integer.toString(CardBattleForm.baseDeck1P.getMemberCards().size()));
            }
        }
    }
    public static boolean hasDebutInHand(boolean flag2P) {
        if (flag2P) {
            for (BaseCard baseCard : CardBattleForm.hand2p) {
                if (baseCard.getCardType() == EnumCardType.Debut) {
                    return true;
                }
            }
        }else {
            for (BaseCard baseCard : CardBattleForm.hand1p) {
                if (baseCard.getCardType() == EnumCardType.Debut) {
                    return true;
                }
            }
        }
        return false;
    }
}
