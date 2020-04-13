package sample;

import java.util.ArrayList;
import java.util.List;

public class Head {

    private ArrayList<Organ> bodies;

    Head() {

        bodies = new ArrayList<Organ>();
    }

    public void setBodies(Organ organ) {

        this.bodies.add(organ);
    }

    public Organ getBodies(int index) {
        return this.bodies.get(index);
    }
}
