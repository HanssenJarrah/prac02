package hero;

import java.util.Arrays;
import java.util.HashSet;

public class SuperHuman extends SuperHero {
    private HashSet<SuperPower> powerSet = new HashSet<SuperPower>();

    public SuperHuman(String trueIdentity, String alterEgo, SuperPower[] innatePowers) {
        super(trueIdentity, alterEgo);
        powerSet.addAll(Arrays.asList(innatePowers));
    }

    public void losePowers(SuperPower[] lostPowers)
    {
        powerSet.removeAll(Arrays.asList(lostPowers));
    }

    public void acquirePowers(SuperPower[] newPowers)
    {
        powerSet.addAll(Arrays.asList(newPowers));
    }

    @Override
    public boolean hasPower(SuperPower queriedPower) {
        return powerSet.contains(queriedPower);
    }

    @Override
    public int totalPower() {
        int totalPower = 0;
        for (SuperPower power : powerSet)
        {
            totalPower += power.getValue();
        }
        return totalPower;
    }
}
