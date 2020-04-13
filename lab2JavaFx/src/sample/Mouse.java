package sample;

public class Mouse extends Organ {
    private double size = 0.0;
    public Mouse()
    {
        super(0.0);
    }
    public static void toEat()
    {
        Brain.receiveDataFromOrgans("Идёт приём пищи");
    }
    public static void toSay()
    {
        Brain.receiveDataFromOrgans("Подаётся голос");
    }
}
