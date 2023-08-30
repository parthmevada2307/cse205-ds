class Solution {
    public int maxSubArray(int[] nums) {
        int maximum_Value = Integer.MIN_VALUE;
        int sum = 0;
      for (int i:nums) {
          sum = sum + i;
          if (sum>maximum_Value) maximum_Value = sum;
          if (sum<0) sum = 0;
      }
      return maximum_Value;
    }
}