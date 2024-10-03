package entities;

public class UserPremium extends User{
    private boolean inEvidence;

    public UserPremium() {
    }

    public UserPremium(String name, String email, int age, boolean inEvidence) {
        super(name, email, age);
        this.inEvidence = inEvidence;
    }

    public boolean isInEvidence() {
        return inEvidence;
    }

    public void setInEvidence(boolean inEvidence) {
        this.inEvidence = inEvidence;
    }

    @Override
    public String toString() {
        return "UserPremium{" + super.toString() + ", inEvidence=" + inEvidence + "}";
    }
}
