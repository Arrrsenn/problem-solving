import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telescopes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> telescopeMode = new HashMap<>();//телескоп-режим
        int countTelescope = scanner.nextInt(); //количество телескопов
        int countStars = scanner.nextInt(); // количество звезд
        int countMode = scanner.nextInt(); //количество режимов
        int countSwitch = 0;

        for (int i = 1; i <= countTelescope; i++) {
            int mode = scanner.nextInt(); //количество режимов
            if (mode > countMode) {
                return;
            }
            telescopeMode.put(i, mode);
        }
        for (int j = 1; j <= countStars; j++) {
            int a = scanner.nextInt();// номера телескопа A
            int b = scanner.nextInt();// номер телескопа B
            if (a > countTelescope || b > countTelescope || a == b) {
                return;
            }
            if (!telescopeMode.get(a).equals(telescopeMode.get(b))) {
                countSwitch++;
            }
        }
        System.out.println(countSwitch);
    }
}
