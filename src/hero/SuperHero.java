package hero;

public abstract class SuperHero implements Hero {
    private String trueIdentity;
    private String alterEgo;
    private String currentIdentity;

    public SuperHero(String trueIdentity, String alterEgo)
    {
        this.trueIdentity = trueIdentity;
        this.alterEgo = alterEgo;
        this.currentIdentity = trueIdentity;
    }

    public abstract boolean hasPower(SuperPower queriedPower);

    public abstract int totalPower();

    @Override
    public String currentIdentity() {
        return currentIdentity;
    }

    @Override
    public void switchIdentity() {
        currentIdentity = currentIdentity.equals(trueIdentity) ? alterEgo : trueIdentity;
    }
}
