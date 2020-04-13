package sample;

import java.util.ArrayList;

public class Tail {

    private ArrayList<Organ> bodies;

    Tail() {

        bodies = new ArrayList<Organ>();

    }

    public void setBodies(Organ organ) {

        this.bodies.add(organ);
    }

    public Organ getBodies(int index) {
        return this.bodies.get(index);
    }

}
