package cap10;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random radom = new Random();

        double[] temperatures = new double[365];


        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = Math.round(-45 + (radom.nextDouble() * 100));

        }

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(temperatures[i]);
        }

        System.out.println("\n" + getHottest(temperatures));

        System.out.println("\n" + getLowet(temperatures));

        double[] average = getAverage(temperatures);

        for (int i = 0; i < average.length; i++){
            System.out.println("\n"+average[i]);
        }
    }

    public static double getHottest(double[] temperatures) {
        double hottest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > hottest) {
                hottest = temperatures[i];
            }
        }

        return hottest;
    }

    public static double getLowet(double[] temperatures) {
        double lowest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        return lowest;
    }

    public static double[] getAverage(double[] temperatures) {
        double[] average = new double[12];
        double count = 0.0;

        for (int i = 0; i < 30; i++) {
            count += temperatures[i];
        }
        temperatures[0] = count / 31;
        count = 0.0;

        for (int i = 30; i < 59; i++) {
            count += temperatures[i];
        }
        temperatures[1] = count / 28;
        count = 0.0;

        for (int i = 59; i < 90; i++) {
            count += temperatures[i];
        }
        temperatures[2] = count / 31;
        count = 0.0;

        for (int i = 90; i < 120; i++) {
            count += temperatures[i];
        }
        temperatures[3] = count / 30;
        count = 0.0;

        for (int i = 120; i < 151; i++) {
            count += temperatures[i];
        }
        temperatures[4] = count / 31;
        count = 0.0;

        for (int i = 151; i < 181; i++) {
            count += temperatures[i];
        }
        temperatures[5] = count / 30;
        count = 0.0;

        for (int i = 181; i < 212; i++) {
            count += temperatures[i];
        }
        temperatures[6] = count / 31;
        count = 0.0;

        for (int i = 212; i < 243; i++) {
            count += temperatures[i];
        }
        temperatures[7] = count / 31;
        count = 0.0;

        for (int i = 243; i < 273; i++) {
            count += temperatures[i];
        }
        temperatures[8] = count / 30;
        count = 0.0;

        for (int i = 273; i < 304; i++) {
            count += temperatures[i];
        }
        temperatures[9] = count / 31;
        count = 0.0;

        for (int i = 304; i < 334; i++) {
            count += temperatures[i];
        }
        temperatures[10] = count / 30;
        count = 0.0;

        for (int i = 334; i < 365; i++) {
            count += temperatures[i];
        }
        temperatures[11] = count / 31;

        return average;
    }
}

