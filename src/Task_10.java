public class Task_10 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);

    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        int[] dublNums = new int[nums.length];
        int point = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                dublNums[point] = nums[i];
                point++;
                counter++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = dublNums[i];
        }
       return counter;
    }
}
