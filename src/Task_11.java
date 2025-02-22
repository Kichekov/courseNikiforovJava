import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] arr = str.split(" ");
        return arr[arr.length-1].length();
    }
}
