package sample;
import java.util.ArrayList;

public class Head {

    public  ArrayList<Organ> organsList = new ArrayList<Organ>();
    public Brain brain;
    public Nose nose;
    public Mouse mouse;
    public Head()
    {
        Organ organ = new Organ(0.0);
        brain = new Brain();
        nose = new Nose();
        mouse = new Mouse();


        organsList.add(organ);
        organsList.add(brain);
        organsList.add(nose);
        organsList.add(mouse);
    }
}
