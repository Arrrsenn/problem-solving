import java.util.Scanner;

public class NOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ввод натурального числа
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n && (n % i == 0 || n % j == 0)) {
                    //числа-пары с минимальным НОК
                    System.out.print(i + " " + j);
                    return;
                }
            }
        }
    }

}
