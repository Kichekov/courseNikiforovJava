import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        String str = Arrays.toString(runningSum(nums));
        System.out.println(str);
    }

    public static int[] runningSum(int[] nums) {
        int[] copyNums = new int[nums.length];
        copyNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            copyNums[i] = nums[i]+copyNums[i-1];
        }
        return copyNums;
    }
}
