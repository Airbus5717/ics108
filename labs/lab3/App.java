
public class App {
    public static void main(String[] args) {
        int[] random = createRandomScores();
        double meanValue = mean(random);
        double deviationValue = deviation(random, meanValue);
        System.out.printf("The mean is\t%.2f\n", meanValue);
        System.out.printf("The std deviation is\t%.2f\n", deviationValue);
    }

    public static int[] createRandomScores() {
        int[] random = new int[(int) (Math.random() * 101)];
        for (int i : random) {
            random[i] = (int) (Math.random() * 101);
        }
        return random;
    }

    public static double mean(int[] x) {
        int arrLen = x.length;
        double sum = 0.0;
        for (int i = 0; i < arrLen; i++) {
            sum += x[i];
        }
        double mean = sum / (double) arrLen;
        return mean;
    }

    public static double deviation(int[] x, double mean) {
        double sum = 0;
        int arrLen = x.length;
        for (int i = 0; i < arrLen; i++) {
            sum += (int) Math.pow((x[i] - mean), 2);
        }
        sum /= arrLen - 1;
        return Math.sqrt(sum);
    }
}
