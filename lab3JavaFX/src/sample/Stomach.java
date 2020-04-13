package sample;

public class Stomach extends TailOrgan{

    private double volume = 0.0;

    Stomach(double _weight, double _volume) {

        super(_weight);
        volume = (_volume >= 0.0) ? _volume : 0.0;

    }

    public double getVolume() {

        return volume;

    }

    public void getFood(Mouth mouth) {
        mouth.transferFood();
    }

    public String toDigest() {
        return "Процесс переваривания";
    }


}
