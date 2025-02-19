import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,177198};
         System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            int num = nums[i];
            while (num > 0) {
                num = num / 10;
                counter++;
            }
            if (counter % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}

