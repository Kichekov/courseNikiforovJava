import java.math.BigInteger;
import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] digit = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        System.out.println(Arrays.toString(plusOne(digit)));;

    }
    public static int[] plusOne(int[] digits) {
        String num = "";//пустая строка в которую мы переведем число из массива
        for (int i = 0; i < digits.length; i++){
            num = num.concat(String.valueOf(digits[i])); //переводим массив в строку
        }
        BigInteger bigNum = new BigInteger(num);
        bigNum = bigNum.add(new BigInteger("1"));
        String temp = bigNum.toString(10);
        int len = temp.length();
        int arr[] = new int[len];
        for (int i = 0; i < len; ++i) {
            arr[i] = Integer.parseInt(temp.charAt(i) + "");
        }
        return arr;

    }
}
