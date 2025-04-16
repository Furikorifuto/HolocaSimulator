package cards;

import cardApi.*;

public class CardRegister {
    public static final LeaderCard MUMEI_BR = new LeaderCard(EnumMember.Mumei, EnumRecorded.BloomingRadiance,true,false,false,false,false,false,5);
    public static final MemberCard MUMEI_90 = new MemberCard(EnumMember.Mumei,EnumRecorded.BloomingRadiance,true,false,false,false,false,false, EnumCardType.Debut,90);
    public static final MemberCard MUMEI_60 = new MemberCard(EnumMember.Mumei,EnumRecorded.BloomingRadiance,true,false,false,false,false,false,EnumCardType.Debut,60);
    public CardRegister(){
        LeaderCard[] leaderCards = {
                MUMEI_BR
        };
    }
}
