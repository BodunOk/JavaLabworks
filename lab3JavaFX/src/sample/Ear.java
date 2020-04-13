package sample;

public class Ear extends HeadOrgan {

    private boolean earring;
    private String sounds = "";

    public Ear(double _weight,boolean _earring) {

        super(_weight);
        earring = _earring;

    }

    public boolean isEarring() {

        return earring;

    }

    public void toHear()
    {
        sounds = "Звуки вокруг";
    }

    public String getSounds() {
        return sounds;
    }
}
