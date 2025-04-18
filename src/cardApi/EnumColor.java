package cardApi;

public enum EnumColor {
    None(false,false,false,false,false,false),
    White(true,false,false,false,false,false),
    Green(false,true,false,false,false,false),
    Red(false,false,true,false,false,false),
    Blue(false,false,false,true,false,false),
    SorAZ(true,true,false,false,false,false),
    Purple(false,false,false,false,true,false),
    Yellow(false,false,false,false,false,true);

    EnumColor(boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5) {
    }
}
