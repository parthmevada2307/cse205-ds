import java.util.Arrays;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        //String str = Arrays.toString(nums);
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count +=1;
            }
            else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return count > max? count:max;
        //return count;
    }
}