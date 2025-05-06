package cardApi;

import java.util.ArrayList;
import java.util.List;

public class RegisterDecks {

    public BaseDeck SampleLuna = new BaseDeck(RegisterCards.LUNA);
    public List<BaseCard> lunaCard = new ArrayList<>();
    public List<EnumColor> lunaYell = new ArrayList<>();
    public void RegisterCards(){
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_90);
        lunaCard.add(RegisterCards.LUNA_80);
        lunaCard.add(RegisterCards.LUNA_80);
        lunaCard.add(RegisterCards.LUNA_80);
        lunaCard.add(RegisterCards.LUNA_80);
        lunaCard.add(RegisterCards.LUNA_150);
        lunaCard.add(RegisterCards.LUNA_150);
        lunaCard.add(RegisterCards.LUNA_150);
        lunaCard.add(RegisterCards.LUNA_150);
        lunaCard.add(RegisterCards.LUNA_120);
        lunaCard.add(RegisterCards.LUNA_120);
        lunaCard.add(RegisterCards.LUNA_120);
        lunaCard.add(RegisterCards.LUNA_120);
        lunaCard.add(RegisterCards.LUNA_110);
        lunaCard.add(RegisterCards.LUNA_110);
        lunaCard.add(RegisterCards.LUNA_180);
        lunaCard.add(RegisterCards.LUNA_180);
        lunaCard.add(RegisterCards.LUNA_180);
        lunaCard.add(RegisterCards.LUNA_180);
        lunaCard.add(RegisterCards.GENERAL_PC);
        lunaCard.add(RegisterCards.GENERAL_PC);
        lunaCard.add(RegisterCards.GENERAL_PC);
        lunaCard.add(RegisterCards.GENERAL_PC);
        lunaCard.add(RegisterCards.OLD_PC);
        lunaCard.add(RegisterCards.NODOKA);
        lunaCard.add(RegisterCards.NODOKA);
        lunaCard.add(RegisterCards.NODOKA);
        lunaCard.add(RegisterCards.NODOKA);
        lunaCard.add(RegisterCards.MANAGER);
        lunaCard.add(RegisterCards.MANAGER);
        lunaCard.add(RegisterCards.MANAGER);
        lunaCard.add(RegisterCards.INTIMIDATION);
        lunaCard.add(RegisterCards.MIKORONE24);
        lunaCard.add(RegisterCards.MIKORONE24);
        lunaCard.add(RegisterCards.FORTH);
        lunaCard.add(RegisterCards.FORTH);
        lunaCard.add(RegisterCards.FORTH);
        lunaCard.add(RegisterCards.LUKNIGHT);
        lunaCard.add(RegisterCards.LUKNIGHT);
        lunaCard.add(RegisterCards.LUKNIGHT);
        lunaCard.add(RegisterCards.LUKNIGHT);
        for(int i=0;i<20;i++){
            lunaYell.add(EnumColor.White);
        }
        SampleLuna.setMemberCards(lunaCard);
        SampleLuna.setYellCards(lunaYell);
    }

}
