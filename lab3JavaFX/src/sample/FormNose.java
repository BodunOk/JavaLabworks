package sample;

public enum FormNose {

    NOT_SPECIFIED("Не указан"),CROOKED("Кривой"),STRAIGHT("Прямой");
    private String code;
    FormNose(String _code)
    {
        this.code = _code;
    }

    public String getCode() {return code;}

}
