package hero;

public class Human extends SuperHero {
    public Human(String trueIdentity, String alterEgo) {
        super(trueIdentity, alterEgo);
    }

    @Override
    public boolean hasPower(SuperPower power) {
        return false;
    }

    @Override
    public int totalPower() {
        return 0;
    }
}
