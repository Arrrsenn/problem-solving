import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCmd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Изначальное количество элементов в множестве.
        int countSet = scanner.nextInt();
        //Сами элементы множества
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < countSet; i++) {
            arr.add(scanner.nextInt());
        }
        //Количество запросов
        int request = scanner.nextInt();
        //Строка для add "YES" & "NO"
        StringBuilder sbr = new StringBuilder();
        //Итерация по запросам
        for (int i = 1; i <= request; i++) {
            //Значение команды с действием
            int cmd = scanner.nextInt();
            // Переменная X
            int x = scanner.nextInt();
            //Проверить, лежит ли множество X
            if (cmd == 0) {
                boolean yes = false;
                for (Integer set : arr) {
                    if (x == set) {
                        sbr.append("YES\n");
                        yes = true;
                    }
                }
                if (!yes) {
                    sbr.append("NO\n");
                }
            }
            //Увеличить все элементы множества на X
            if (cmd == 1) {
                int firstElement = arr.get(0) + x;
                int secondElement = arr.get(1) + x;
                arr.removeAll(arr);
                arr.add(0, firstElement);
                arr.add(1, secondElement);
            }
            //Добавить в множество число X
            if (cmd == 2) {
                boolean add = false;
                for (Integer integer : arr) {
                    if (x == integer) {
                        add = true;
                        break;
                    }
                }
                if (!add) {
                    arr.add(x);
                }
            }
            //Удалить из множества число X
            if (cmd == 3) {
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(j) == x) {
                        arr.remove(arr.get(j));
                    }
                }
            }
        }
        //Вывод
        System.out.println(sbr);
    }
}
