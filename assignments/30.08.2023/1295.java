class Solution {
    int cd(int n) {
       int count = 0;
       while (n!=0) {
           count++;
           n/=10;
       }
     return count;
    }
      int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i<nums.length;i++) {
        if (cd(nums[i])%2==0) {
            ans++;
        }
        }
        return ans;
        }
       
        

                


}