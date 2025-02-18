import java.util.Scanner;

public class Task_1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для подсчета символов: ");
        String text = scanner.nextLine();
        System.out.print("Введите символ нуждающийся в посчете: ");
        char ch = scanner.nextLine().charAt(0);
        long x = counter(text, ch);
        System.out.print("Строка содержит: " + x + " символов: " + ch);
    }


    public static long counter(String text, char ch) {
        return text.chars().filter(c -> c == ch).count();
    }
}


