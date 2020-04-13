package sample;

public class Brain extends HeadOrgan {

    private double KPD = 0.0;

    Brain(double _weight,double _KPD) {

        super(_weight);

        KPD = ((_KPD >= 0) && (_KPD <= 100)) ? _KPD : 0.0;

    }

    public double getKPD() {

        return KPD;

    }

    public void manageOrgan(Organ organ, int id) {

        switch (id) {
            case 0:
                Nose nose = (Nose)organ;
                nose.ToItch();
                nose.ToSniff();
                break;
            case 1:
                Mouth mouth = (Mouth)organ;
                mouth.toEat();
                mouth.getTesteInfo();
                mouth.transferFood();
                break;
            case 2:
                Ear ear = (Ear) organ;
                ear.toHear();
                break;
        }

    }

    public String getData(Organ organ, int id){

        switch (id) {
            case 0:
                Nose nose = (Nose) organ;
                manageOrgan(organ, id);
                return ("Запах: "+ nose.getSmell() + "\nОщущения: " + nose.getSensation());
            case 1:
                Mouth mouth = (Mouth) organ;
                manageOrgan(organ,id);
                return ("Голос: " + mouth.toTalk() + "\nПища: " + mouth.toEat() +"\nВкус: " + mouth.getTesteInfo());
            case 2:
                Ear ear = (Ear) organ;
                manageOrgan(organ,id);
                return ("Слышимая информация: " + ear.getSounds());
        }
        return "  ";
    }

}
