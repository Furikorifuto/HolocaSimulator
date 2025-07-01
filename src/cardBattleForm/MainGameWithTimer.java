package cardBattleForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainGameWithTimer implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!CardBattleForm.timerStopFlag){
            switch (CardBattleForm.count) {
                case "start":
                    CardBattleCommand.mainDeck1PCreate();
                    CardBattleCommand.mainDeck2PCreate();
                    CardBattleCommand.setCount(100,"mainShuffle",false);
                    break;
                case "mainShuffle":
                    CardBattleCommand.mainDeckShuffle(false);
                    CardBattleCommand.mainDeckShuffle(true);
                    CardBattleCommand.setCount(100,"yellShuffle",false);
                    break;
                case "yellShuffle":
                    CardBattleCommand.yellDeckShuffle(false);
                    CardBattleCommand.yellDeckShuffle(true);
                    CardBattleCommand.setCount(100,"leaderPlace",false);
                    break;
                case "leaderPlace":
                    CardBattleCommand.leaderCardPlace();
                    CardBattleCommand.setCount(100,"setPreceding",false);
                    break;
                case "setPreceding":
                    Random random = new Random();
                    CardBattleForm.preceding1pFlag = random.nextBoolean();
                    if(CardBattleForm.preceding1pFlag){
                        CardBattleForm.textAreaLog.append("1P is preceding.\n");
                    }else {
                        CardBattleForm.textAreaLog.append("2P is preceding.\n");
                    }
                    CardBattleCommand.setCount(100,"firstDraw",false);
                    break;
                case "firstDraw":
                    CardBattleCommand.drawCard(false,7);
                    CardBattleCommand.drawCard(true,7);
                    while (!CardBattleCommand.hasDebutInHand(true)) {
                        CardBattleCommand.AllHandToDeck(true);
                        CardBattleCommand.drawCard(true,7);
                    }
                    while (!CardBattleCommand.hasDebutInHand(false)) {
                        CardBattleCommand.AllHandToDeck(false);
                        CardBattleCommand.drawCard(false,7);
                    }
                    CardBattleCommand.setCount(100,"placeDebutCard1P",true);
                    break;
                case "placeDebutCard1P":
                    break;
            }
        }
    }
}
