class Solution {
    public int majorityElement(int[] nums) {
        int major = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
                count++;
            }
            else if (major == num) count++;
            else count--;
        }
        return major;
    }
}