package registerCard;

import cardApi.EnumMember;
import cardApi.EnumRecorded;
import cardApi.LeaderCard;

public class LeaderRegister {
    public static LeaderCard MUMEI_SYS;
    public LeaderRegister(){
        MUMEI_SYS.setEnumMember(EnumMember.Mumei);
        MUMEI_SYS.setColors(true,false,false,false,false,false);
        MUMEI_SYS.setMaxHealth(5);
        MUMEI_SYS.setRecorded(EnumRecorded.StartYellSet);

        LeaderCard[] leaderCards = {
                MUMEI_SYS
        };
    }
}
