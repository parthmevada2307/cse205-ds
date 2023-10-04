class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i<nums1.length;i++) {
           int G= -1;
           int len = nums2.length-1;
                while (len >= 0 && nums2[len] != nums1[i]) {
                 if (nums2[len] > nums1[i]) {
                     G = nums2[len];
                 }
                 len--;
            }
            ans[i] = G;
        }
    return ans;
}
}