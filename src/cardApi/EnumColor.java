package cardApi;

public enum EnumColor {
    None(false,false,false,false,false,false),
    White(true,false,false,false,false,false),
    Green(false,true,false,false,false,false),
    Red(false,false,true,false,false,false),
    Blue(false,false,false,true,false,false),
    SorAZ(true,true,false,false,false,false),
    Purple(false,false,false,false,true,false),
    Yellow(false,false,false,false,false,true),
    Fuwamoco(false,false,true,true,false,false);

    EnumColor(boolean w, boolean g, boolean r, boolean b, boolean p, boolean y) {
    }
}
