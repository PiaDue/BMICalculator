public class BMICalc {
    private int weight;
    private double height;
    private int bmi;

    public BMICalc(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.bmi = weight/(height*height);
    }

    public int getBmi() {
        return bmi;
    }
}
