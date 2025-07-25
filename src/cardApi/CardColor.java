package cardApi;

public enum CardColor {
    None(false,false,false,false,false,false),
    White(true,false,false,false,false,false),
    Green(false,true,false,false,false,false),
    Red(false,false,true,false,false,false),
    Blue(false,false,false,true,false,false),
    SorAZ(true,true,false,false,false,false),
    Purple(false,false,false,false,true,false),
    Yellow(false,false,false,false,false,true),
    Fuwamoco(false,false,true,true,false,false);

<<<<<<< Updated upstream:src/cardApi/EnumColor.java
    EnumColor(boolean w, boolean g, boolean r, boolean b, boolean p, boolean y) {
=======
    CardColor(boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5) {
>>>>>>> Stashed changes:src/cardApi/CardColor.java
    }
}
