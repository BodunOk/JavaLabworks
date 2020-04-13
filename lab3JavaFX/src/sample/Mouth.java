package sample;

public class Mouth extends HeadOrgan{

    private double size = 0.0;
    private String taste = "Информация о вкусе";

    Mouth(double _weight, double _size) {

        super(_weight);
        size = (_size >= 0) ? _size : 0.0;

    }

    public double getSize() {

        return size;

    }

    public String toEat() {
        return "Идёт приём пищи!";
    }


    public String toTalk() {

        return "Искодят звуки";

    }

    public String getTesteInfo() {

        return taste;

    }

    public String transferFood() {
        return("Пища передаётся в желудок");
    }

}
