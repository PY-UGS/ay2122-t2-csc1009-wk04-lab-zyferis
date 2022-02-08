package lab04;

import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to BMI Calculator!");
        try (Scanner ScannerObj = new Scanner(System.in)) {
            System.out.print("Enter your weight in pounds: ");
            double weight = ScannerObj.nextDouble();
            System.out.print("Enter your height in inches: ");
            double height = ScannerObj.nextDouble();

            BMI newBMI = new BMI(weight, height);
            double BMI = newBMI.calculateBMI();
            System.out.println("BMI is " + BMI);
            System.out.println(newBMI.getInterpretation(BMI));
        }
    }
}
