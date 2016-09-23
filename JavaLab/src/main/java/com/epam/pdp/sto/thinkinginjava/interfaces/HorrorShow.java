package com.epam.pdp.sto.thinkinginjava.interfaces;

public class HorrorShow {
    static void umo(Monster bi) {
        bi.menace();
    }

    static void vmo(DangerousMonster dii) {
        dii.menace();
        dii.destroy();
    }

    static void wmo(Lethal let) {
        let.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        umo(barney);
        vmo(barney);

        Vampire vlad = new VeryBadVampire();
        umo(vlad);
        vmo(vlad);
        wmo(vlad);
    }
}
