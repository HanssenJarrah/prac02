package hero;

public class SecretAgent implements Hero {
    private String trueName;
    private String codeName;
    private String currentIdentity;
    private String favouriteGadget;

    public SecretAgent(String trueName, String codeName, String favouriteGadget) {
        this.trueName = trueName;
        this.codeName = codeName;
        this.currentIdentity = trueName;
        this.favouriteGadget = favouriteGadget;
    }

    public String getGadget()
    {
        return favouriteGadget;
    }

    @Override
    public String currentIdentity() {
        return currentIdentity;
    }

    @Override
    public void switchIdentity() {
        currentIdentity = currentIdentity.equals(trueName) ? codeName : trueName;
    }
}
