package sample;

abstract class Organ {
    private double weight;

    Organ(double _weight) {

        this.weight = _weight;

    }

    public double getWeight() {
        return weight;
    }
}
