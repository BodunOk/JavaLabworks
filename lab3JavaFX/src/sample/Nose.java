package sample;

public class Nose extends HeadOrgan {

    private FormNose form = FormNose.NOT_SPECIFIED;
    private String smell = " ";
    private String sensation = "";

    public Nose(double _weight, FormNose _form) {

        super(_weight);
        form = _form;
    }

    public FormNose getForm() {

        return form;

    }

    public String getSmell() {
        return smell;
    }

    public String getSensation() {
        return sensation;
    }

    public void ToSniff() {

        smell = "Какой-то запах!";

    }

    public void ToItch() {
        sensation = "Чешется!";
    }
}
