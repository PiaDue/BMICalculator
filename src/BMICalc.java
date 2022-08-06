public class BMICalc {
    private double weight;
    private double  height;
    private int bmi;

    public BMICalc(int weight, int height) {
        this.weight = (double) weight;
        this.height = height/100.0;
        this.bmi = (int)(this.weight/(this.height*this.height));
    }

    public int getBmi() {
        return bmi;
    }
}
