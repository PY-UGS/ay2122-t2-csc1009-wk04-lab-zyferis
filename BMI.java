package lab04;

public class BMI {
    private double weight;  // weight in pounds
    private double height;  // weight in inches
    private static final double pound = 0.45359237;
    private static final double inch = 0.0254;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        double weightKG = weight * pound;
        double heightM = height * inch;
        double heightMSq = heightM * heightM;
        double BMI = weightKG / heightMSq;
        return BMI;
    }

    public String getInterpretation(double BMI) {
        String interpretation = "Obese";
        if (BMI < 18.5) {
            interpretation = "Underweight";
        }
        else if (BMI >= 18.5 && BMI < 25.0) {
            interpretation = "Normal";
        }
        else if (BMI >= 25.0 && BMI < 30.0) {
            interpretation = "Overweight";
        }
        return interpretation;
    }
}
