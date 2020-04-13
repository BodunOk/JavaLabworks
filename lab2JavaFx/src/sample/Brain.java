package sample;

public class Brain extends Organ {
    private double KPD = 0.0;
    public static String result;
    public Brain()
    {
        super(0.0);
    }
    public void manageOrgan(int id)
    {
        switch (id)
        {
            case 0:
                Nose.toSniff();
                break;
            case 1:
                Nose.itch();
                break;
            case 2:
                Mouse.toEat();
                break;
            case 3:
                Mouse.toSay();
                break;
        }
    }
    public static void receiveDataFromOrgans(String _result)
    {
        result = _result;
    }
}
