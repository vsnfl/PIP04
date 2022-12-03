import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Zadanie6 {
    public static double[] getRandom(double min, double max) {
        double[] valuesInRange = new double[3];
        Random random = new Random();
        valuesInRange[0] = min + (max - min) * random.nextDouble();
        valuesInRange[1] =  min + (max - min) * random.nextDouble();;
        valuesInRange[2] =  min + (max - min) * random.nextDouble();;
        Arrays.sort(valuesInRange);
        return valuesInRange;
    }
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj a:");
        double a = skanuj.nextDouble();
        System.out.println("Podaj b:");
        double b = skanuj.nextDouble();
        if (a > b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        double[] threeValues;
        threeValues = getRandom(a,b);
        for (int i=0;i<threeValues.length;i++) {
            threeValues[i] = Math.round(threeValues[i] * 100.0) / 100.0;
        }

        System.out.println(threeValues[0] + " < " + threeValues[1] + " < " + threeValues[2]);

    }
}