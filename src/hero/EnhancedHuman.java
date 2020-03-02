package hero;

public class EnhancedHuman extends SuperHero {
    private SuperPower[] powers;
    private boolean enhanced = false;

    public EnhancedHuman(String trueIdentity, String alterEgo, SuperPower[] acquiredPowers)
    {
        super(trueIdentity, alterEgo);
        powers = acquiredPowers;
    }

    @Override
    public void switchIdentity() {
        super.switchIdentity();
        enhanced = !enhanced;
    }

    @Override
    public boolean hasPower(SuperPower queriedPower) {
        if (!enhanced)
        {
            return false;
        }

        for (SuperPower power : powers)
        {
            if (power == queriedPower)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int totalPower() {
        if (!enhanced)
        {
            return 0;
        }

        int totalPower = 0;
        for (SuperPower power : powers)
        {
            totalPower += power.getValue();
        }
        return totalPower;
    }
}
