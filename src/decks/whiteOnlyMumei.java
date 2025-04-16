package decks;

import cardApi.BaseDeck;
import cardApi.LeaderCard;
import cards.CardRegister;

public class whiteOnlyMumei extends BaseDeck {
    public whiteOnlyMumei(LeaderCard leader) {
        super(CardRegister.MUMEI_BR);
    }
}
