class Solution {
    public int triangularSum(int[] nums) {
       int[] newNums = new int[nums.length-1];
       int j = 0;
       if (nums.length == 1) {
           return nums[0];
       } 
           for (int i = 0; i<nums.length-1;i++) {
               if ((nums[i] + nums[i+1]) >= 10) {
               newNums[i] = (nums[i] + nums[i+1])%10;
               }
               else {
                   newNums[i] = nums[i] + nums[i+1];
               }
               j++;
           }
       return triangularSum(newNums);
    }
}