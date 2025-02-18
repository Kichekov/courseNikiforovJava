
import java.util.Queue;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str = "HELLOWORLD";
        System.out.println("Введите слово без пробеллов");
        String str = scanner.nextLine();
        counter(str);
    }
    static void counter (String str){
        int[] alphabet = new int[26];
        char[] massChar = str.toCharArray();
        for (int j = 0; j < massChar.length; j++){
            int num =(int)massChar[j]- 65;
            alphabet[num] ++;
        }

        for (int i = 65; i<=90; i++) {
            int num1 = i-65;
            System.out.println(((char) i) + " -> " + alphabet[num1] );
        }
    }
}
