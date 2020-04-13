package sample;


public class Nose extends Organ {
    private String form = "not specified";
    public Nose()
    {
        super(0.0);
    }
    public static void toSniff()  //нюхать
    {
        Brain.receiveDataFromOrgans("А пахне як!");
    }
    public static void itch()  //чесаться
    {
        Brain.receiveDataFromOrgans("Чувство что нос чешится!");
    }
}
