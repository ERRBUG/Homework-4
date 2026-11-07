import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] inputArray1 = {50000, 75000, 30000, 120000, 45000};
        float[] outputArray1 = new float[4];

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) max = payment;
            if (payment < min) min = payment;
        }
        float average = (float) sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println("inputArray1:  " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        // Задача 2
        int[] inputArray2 = {60000, 85000, 42000, 150000, 33000};
        float[] outputArray2 = new float[inputArray2.length];

        int i = 0;
        for (int salary : inputArray2) {
            outputArray2[i] = salary * 0.13f;
            i++;
        }

        System.out.println("inputArray2:  " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        // Задача 3
        int[] inputArray3 = {3000, 7500, 5000, 12000, 4999};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int j = 0;
        for (int bonus : inputArray3) {
            outputArray3[j] = bonus > 5000;
            j++;
        }
        System.out.println("inputArray3:  " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        // Задача 4
        int[] inputArray4 = {15000, 8000, -2000, 5000, 12000};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println("inputArray4:  " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        // Задача 5
        int[] inputArray5 = {150000, -30000, 85000, 12000, -5000};
        int[] outputArray5 = new int[1];
        outputArray5[0] = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println("inputArray5:  " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5) + " рентабельных месяцев");
    }
}