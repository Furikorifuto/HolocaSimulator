package cardApi;

public enum Member {
    Sora(MemberHashTag.JP, MemberHashTag.Zero, MemberHashTag.Singer),
    Roboco(MemberHashTag.JP, MemberHashTag.Zero, MemberHashTag.Shooter),
    Miko(MemberHashTag.JP, MemberHashTag.Zero, MemberHashTag.Baby),
    Suisei(MemberHashTag.JP, MemberHashTag.Zero, MemberHashTag.Singer),
    Azki(MemberHashTag.JP, MemberHashTag.Zero, MemberHashTag.Painter),
    SorAZ(MemberHashTag.JP, MemberHashTag.Zero),
    Akirose(MemberHashTag.JP, MemberHashTag.First, MemberHashTag.HalfElf, MemberHashTag.Sake),
    Haato(MemberHashTag.JP, MemberHashTag.First, MemberHashTag.Cook),
    Fubuki(MemberHashTag.JP, MemberHashTag.First, MemberHashTag.Gamers, MemberHashTag.Animal, MemberHashTag.Animal),
    Matsuri(MemberHashTag.JP, MemberHashTag.Second),
    Shion(MemberHashTag.JP, MemberHashTag.Second),
    Ayame(MemberHashTag.JP, MemberHashTag.Second, MemberHashTag.Shooter),
    Choco(MemberHashTag.JP, MemberHashTag.Second, MemberHashTag.Cook),
    Subaru(MemberHashTag.JP, MemberHashTag.Second),
    Mio(MemberHashTag.JP, MemberHashTag.Gamers, MemberHashTag.Animal, MemberHashTag.Cook),
    Okayu(MemberHashTag.JP, MemberHashTag.Gamers, MemberHashTag.Animal),
    Korone(MemberHashTag.JP, MemberHashTag.Gamers, MemberHashTag.Animal),
    Pekora(MemberHashTag.JP, MemberHashTag.Third, MemberHashTag.Animal),
    Flare(MemberHashTag.JP, MemberHashTag.Third, MemberHashTag.HalfElf),
    Noel(MemberHashTag.JP, MemberHashTag.Third, MemberHashTag.Sake),
    Marine(MemberHashTag.JP, MemberHashTag.Third, MemberHashTag.Painter, MemberHashTag.Sea),
    Kanata(MemberHashTag.JP, MemberHashTag.Forth, MemberHashTag.Singer),
    Watame(MemberHashTag.JP, MemberHashTag.Forth, MemberHashTag.Animal, MemberHashTag.Singer),
    Towa(MemberHashTag.JP, MemberHashTag.Forth, MemberHashTag.Singer, MemberHashTag.Shooter),
    Luna(MemberHashTag.JP, MemberHashTag.Forth, MemberHashTag.Baby),
    Risu(MemberHashTag.ID, MemberHashTag.ID1st, MemberHashTag.Animal, MemberHashTag.Singer),
    Moona(MemberHashTag.ID, MemberHashTag.ID1st, MemberHashTag.Singer),
    Iofi(MemberHashTag.ID, MemberHashTag.ID1st, MemberHashTag.Painter),
    Lamy(MemberHashTag.JP, MemberHashTag.Fifth),
    Nene(MemberHashTag.JP, MemberHashTag.Fifth),
    Botan(MemberHashTag.JP, MemberHashTag.Fifth, MemberHashTag.Animal, MemberHashTag.Shooter),
    Polka(MemberHashTag.JP, MemberHashTag.Fifth, MemberHashTag.Animal),
    Calli(MemberHashTag.EN, MemberHashTag.Myth, MemberHashTag.Singer),
    Inanis(MemberHashTag.EN, MemberHashTag.Myth, MemberHashTag.Painter, MemberHashTag.Sea),
    Kiara(MemberHashTag.EN, MemberHashTag.Myth, MemberHashTag.Bird),
    Gura(MemberHashTag.EN, MemberHashTag.Myth),
    Irys(MemberHashTag.EN, MemberHashTag.Promise, MemberHashTag.Singer),
    Kroni(MemberHashTag.EN, MemberHashTag.Promise),
    Mumei(MemberHashTag.EN, MemberHashTag.Promise, MemberHashTag.Bird, MemberHashTag.Painter),
    Baelz(MemberHashTag.EN, MemberHashTag.Promise, MemberHashTag.Animal),
    Ollie(MemberHashTag.ID, MemberHashTag.ID2nd, MemberHashTag.Linguistic),
    Anya(MemberHashTag.ID, MemberHashTag.ID2nd),
    Reine(MemberHashTag.ID, MemberHashTag.ID2nd, MemberHashTag.Bird, MemberHashTag.Painter),
    Laplus(MemberHashTag.JP, MemberHashTag.HoloX, MemberHashTag.Shooter),
    Lui(MemberHashTag.JP, MemberHashTag.HoloX, MemberHashTag.Bird, MemberHashTag.Sake),
    Koyori(MemberHashTag.JP, MemberHashTag.HoloX, MemberHashTag.Animal),
    Chloe(MemberHashTag.JP, MemberHashTag.HoloX, MemberHashTag.Sea),
    Iroha(MemberHashTag.JP, MemberHashTag.HoloX),
    Zeta(MemberHashTag.ID, MemberHashTag.ID3rd),
    Kaela(MemberHashTag.ID, MemberHashTag.ID3rd),
    Kobo(MemberHashTag.ID, MemberHashTag.ID3rd),
    Shiori(MemberHashTag.EN, MemberHashTag.Advent),
    Bijou(MemberHashTag.EN, MemberHashTag.Advent),
    Nerissa(MemberHashTag.EN, MemberHashTag.Advent, MemberHashTag.Singer, MemberHashTag.Bird),
    Fuwawa(MemberHashTag.EN, MemberHashTag.Advent, MemberHashTag.Animal),
    Mococo(MemberHashTag.EN, MemberHashTag.Advent, MemberHashTag.Animal),
    FuwaMoco(MemberHashTag.EN, MemberHashTag.Advent, MemberHashTag.Animal),
    Ao(MemberHashTag.DEV_IS, MemberHashTag.ReGLoss, MemberHashTag.Painter),
    Kanade(MemberHashTag.DEV_IS, MemberHashTag.ReGLoss, MemberHashTag.Singer),
    Ririka(MemberHashTag.DEV_IS, MemberHashTag.ReGLoss, MemberHashTag.Cook),
    Raden(MemberHashTag.DEV_IS, MemberHashTag.ReGLoss, MemberHashTag.Sake, MemberHashTag.Linguistic),
    Hajime(MemberHashTag.DEV_IS, MemberHashTag.ReGLoss, MemberHashTag.Baby),
    Rose,
    Gigi,
    Cecilia,
    Raora,
    Riona,
    Niko,
    Su,
    Chihaya,
    Vivi;


    Member() {
    }
    Member(MemberHashTag enumMemberTag, MemberHashTag enumMemberTag1) {
    }
    Member(MemberHashTag enumMemberTag, MemberHashTag enumMemberTag1, MemberHashTag enumMemberTag2) {
    }
    Member(MemberHashTag enumMemberTag, MemberHashTag enumMemberTag1, MemberHashTag enumMemberTag2, MemberHashTag enumMemberTag3) {
    }
    Member(MemberHashTag enumMemberTag, MemberHashTag enumMemberTag1, MemberHashTag enumMemberTag2, MemberHashTag enumMemberTag3, MemberHashTag enumMemberTag4) {
    }

}
