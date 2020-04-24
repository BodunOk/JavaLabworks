package sample;

public class MainThread {

    private double[] vector1 = {3.6, 2.2, 1.5};
    private double[] vector2 = {1.2, -9, 4.7};
    private double resultMul = 0;



    public MainThread(double[] _vector1,double[] _vector2) {

        this.vector1 = _vector1;
        this.vector2 = _vector2;

    }

    public void calculateMul() {

        for (int i = 0; i < this.vector1.length; i++) {

            ChildThread calculate = new ChildThread("Child" + i,this.vector1[i],this.vector2[i]);
            calculate.start();
            try{
                calculate.join();
            }
            catch (InterruptedException e){
                System.out.printf("%s has been interrupted",calculate.getName());
            }
            this.resultMul += calculate.getResult();
        }
    }

    public void addMul() {

    }

    public double getResultMul(){
        return this.resultMul;
    }

}
