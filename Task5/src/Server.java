import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProcessor = scanner.nextInt();
        int[] frequency = new int[countProcessor];
        int[] totalFrequency = new int[countProcessor];
        int sumFrequency = 0;
        int max = totalFrequency[0];

        for (int i = 0; i < countProcessor; i++) {
            frequency[i] = scanner.nextInt();
        }

        for (int i = 0; i < frequency.length; i++) {
            int min = frequency[i];
            for (int k : frequency) {
                int num = k;
                while (num % min != 0) {
                    num--;
                }
                sumFrequency += num;

            }
            totalFrequency[i] = sumFrequency;
            sumFrequency = 0;
        }
        for (int i : totalFrequency) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
