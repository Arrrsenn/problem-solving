import java.util.Scanner;

public class coloringLetters {
    public static void main(String[] args) {

        Scanner forN = new Scanner(System.in);
        Scanner forS = new Scanner(System.in);
        Scanner forBY = new Scanner(System.in);

        int countLetterName = forN.nextInt(); //кол-во букв в названии отдела
        String name = forS.nextLine(); // название
        String letter = forBY.nextLine(); // B or Y

        int beginIndex = 0;
        int endIndex = 0;
        int countUgly = 0;
        String countLetters = name.replaceAll("\\s", "");

        if (countLetterName != letter.length() && countLetterName != countLetters.length()) {
            return;
        }

        String[] text = name.split(" ");
        String[] stack = new String[text.length];

        for (int i = 0; i < text.length; i++) {
            endIndex += text[i].length();
            stack[i] = (letter.substring(beginIndex, endIndex));
            beginIndex += text[i].length();
        }

        for (int j = 0; j < stack.length; j++) {
            String BY = stack[j];
            if (BY.charAt(j) == BY.charAt(j + 1)) {
                countUgly++;
            }
        }

        System.out.println(countUgly);
    }
}
