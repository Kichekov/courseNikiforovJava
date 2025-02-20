import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        int[] digit = {9,9};

        System.out.println(plusOne(digit));


    }
    public static int[] plusOne(int[] digits) {
        List<Integer> intList = new ArrayList<Integer>(digits.length);
        for (int i=0; i<digits.length; i++)
        {
            intList.add(digits[i]);
        }
        if (intList.size()>1 && intList.get(intList.size()-1) != 9){
            intList.set(intList.size()-1, intList.getLast()+1);
        }
        if (intList.size()>1 && intList.get(intList.size()-1) == 9){
            if (intList.size()-1 !=9) {
                intList.set(intList.size() - 1, 0);
                intList.set(intList.size() - 2, intList.get(intList.size() - 2) + 1);
            }
            if (intList.size()-1 ==9) {
                intList.set(intList.size() - 2, 0);
                intList.set(intList.size() - 1, 0);
                intList.set(intList.size() - 3, intList.get(intList.size() - 3) + 1);
            }

        }
        if (intList.size() == 1 && intList.getLast() != 9){
            intList.set(intList.size()-1, intList.getLast()+1);
        }
        if (intList.size() == 1 && intList.getLast() == 9){
            intList.addFirst(1);
            intList.set(1, 0);
        }
        int[] mass = new int[intList.size()];
        for (int i=0; i<mass.length; i++)
        {
            mass[i] = intList.get(i);
        }
        return mass;
    }
}
